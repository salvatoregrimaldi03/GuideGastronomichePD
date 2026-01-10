package ristoranti;

import javax.ejb.MessageDriven;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(mappedName = "jms/javaee8/Topic")
public class RistoranteMDB implements MessageListener {
    @Inject
    private RistoranteEJB ristoranteEJB;
    
    @Inject
    private Event<Ristorante> evento;
    
    @Override
    public void onMessage(Message msg) {
        try {
            MessageWrapper mw = msg.getBody(MessageWrapper.class);
            int id = mw.getID();
            boolean ancoraPresenteinGuida = mw.isAncoraPresenteinGuida();
            
            Ristorante r = ristoranteEJB.findByID(id);
            r.setAncoraPresenteInGuida(ancoraPresenteinGuida);
            
            ristoranteEJB.aggiornaRistorante(r);
            evento.fire(r);
        } catch(JMSException ex) {
            ex.printStackTrace();
        }
    }   
}