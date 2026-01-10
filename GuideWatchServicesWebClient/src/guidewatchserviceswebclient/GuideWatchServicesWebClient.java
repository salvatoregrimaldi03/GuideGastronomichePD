package guidewatchserviceswebclient;

import java.util.Scanner;

public class GuideWatchServicesWebClient {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numAncoraPresentiInGuida = numRistorantiAncoraPresentiInGuida();
        System.out.println("I ristoranti ancora presenti in guida sono "+numAncoraPresentiInGuida);
        
        System.out.print("Inserisci il nome di una guida: ");
        String nomeGuida = in.next();
        int numRistorantiInGuida = numRistorantiByGuida(nomeGuida);
        System.out.println("I ristoranti presenti nella guida "+nomeGuida+ " sono "+numRistorantiInGuida);
    }
    
    private static int numRistorantiAncoraPresentiInGuida() {
        ristoranti.RistoranteEJBService service = new ristoranti.RistoranteEJBService();
        ristoranti.RistoranteEJB port = service.getRistoranteEJBPort();
        return port.numRistorantiAncoraInGuida();
    }
    
    private static int numRistorantiByGuida(String guida) {
        ristoranti.RistoranteEJBService service = new ristoranti.RistoranteEJBService();
        ristoranti.RistoranteEJB port = service.getRistoranteEJBPort();
        return port.numRistorantiByGuida(guida);
    }
}