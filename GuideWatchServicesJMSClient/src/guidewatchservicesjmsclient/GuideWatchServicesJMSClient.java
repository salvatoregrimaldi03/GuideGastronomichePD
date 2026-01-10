package guidewatchservicesjmsclient;

import java.util.Scanner;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import ristoranti.MessageWrapper;

public class GuideWatchServicesJMSClient {
    public static void main(String[] args) throws NamingException {
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci l'id del ristorante: ");
        int id = in.nextInt();
        System.out.print("Inserisci il nuovo stato di presenza del ristorante nella guida (true per SI e false per NO): ");
        boolean ancoraInGuida = in.nextBoolean();
        
        MessageWrapper msg = new MessageWrapper(id, ancoraInGuida);
        Context ctx = new InitialContext();
        ConnectionFactory cf = (ConnectionFactory) ctx.lookup("jms/javaee8/ConnectionFactory");
        Destination topic = (Destination) ctx.lookup("jms/javaee8/Topic");
        try(JMSContext jmsContext = cf.createContext())
        {
            jmsContext.createProducer().send(topic, msg);
        }
    }   
}