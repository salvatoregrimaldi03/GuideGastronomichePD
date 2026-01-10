package ristoranti;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.enterprise.event.Observes;

public class UpdateNotification {
    private static final Pattern STELLE_PATTERN = Pattern.compile("(\\d+)"); //crea un pattern per cercare una o più cifre in una stringa

    public void notify(@Observes Ristorante r) {
        System.out.println("Ristorante " +r.getNomeRistorante()+ " non più presente nella guida "+r.getGuida());
        
        if(r.getGuida().equals("Michelin") && hasAtLeastOneStar(r.getRiconoscimento()))
            System.out.println("Attenzione: ristorante stellato rimosso dalla guida");
    }
    
    private boolean hasAtLeastOneStar(String riconoscimento) {
        //Se la stringa riconoscimento è null, non ci sono stelle
        if(riconoscimento == null)
            return false;
        
        //Cerca un numero nella stringa
        Matcher m = STELLE_PATTERN.matcher(riconoscimento);
        //Se viene trovato almeno un numero, entra nel corpo dell'if
        if(m.find()) {
            int stelle = Integer.parseInt(m.group(1)); //Converte il numero trovato in intero (group(1) prende la prima sottostringa della stringa considerata)
            return stelle >= 1; //Verifica "1 stella o superiore"
        }
        return false; //Restituisci false se non ci sono stelle
    }
}