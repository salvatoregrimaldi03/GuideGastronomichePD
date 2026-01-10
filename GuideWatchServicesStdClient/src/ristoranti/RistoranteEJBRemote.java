package ristoranti;

import java.util.List;
import javax.ejb.Remote;

@Remote
public interface RistoranteEJBRemote {
    Ristorante findByID(int id);
    List<Ristorante> findByCittà(String citta);
    List<Ristorante> findByGuida(String guida);
    List<Ristorante> getAll();
    Ristorante creaRistorante(Ristorante r);
    void eliminaRistorante(Ristorante r);
    void aggiornaRistorante(Ristorante r);
    int numRistorantiAncoraInGuida();
    int numRistorantiByGuida(String guida);
}