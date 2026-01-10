package ristoranti;

import java.util.List;
import java.util.Scanner;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class GuideGastronomicheClient {
    public static void main(String[] args) throws NamingException {
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci una città: ");
        String citta = in.nextLine().trim();
        
        Context ctx = new InitialContext();
        RistoranteEJBRemote ristoranteEJB = (RistoranteEJBRemote) ctx.lookup("java:global/GuideWatchServicesBean/RistoranteEJB!ristoranti.RistoranteEJBRemote");
        System.out.println("Elenco dei ristoranti presenti nella città di " +citta);
        List<Ristorante> ristoranti = ristoranteEJB.findByCittà(citta);
        if(ristoranti == null || ristoranti.isEmpty())
            System.out.println("Nessun ristorante della città di "+citta+ " esistente nel database");
        for(Ristorante r : ristoranti)
            System.out.println(r);
    }   
}