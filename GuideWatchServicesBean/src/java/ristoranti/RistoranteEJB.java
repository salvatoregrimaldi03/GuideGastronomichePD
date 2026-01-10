package ristoranti;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

@WebService
@Stateless
@LocalBean
public class RistoranteEJB implements RistoranteEJBRemote {
    @Inject
    private EntityManager em;
    
    @Override
    public Ristorante findByID(int id) {
        TypedQuery<Ristorante> query = em.createNamedQuery("findByID", Ristorante.class);
        query.setParameter(1, id);
        return query.getSingleResult();
    }
    
    @Override
    public List<Ristorante> findByCittà(String citta) {
        TypedQuery<Ristorante> query = em.createNamedQuery("findByCittà", Ristorante.class);
        query.setParameter(2, citta);
        return query.getResultList();
    }
    
    @Override
    public List<Ristorante> findByGuida(String guida) {
        TypedQuery<Ristorante> query = em.createNamedQuery("findByGuida", Ristorante.class);
        query.setParameter(3, guida);
        return query.getResultList();
    }
    
    @Override
    public List<Ristorante> getAll() {
        TypedQuery<Ristorante> query = em.createNamedQuery("getAll", Ristorante.class);
        return query.getResultList();
    }
    
    @Override
    public Ristorante creaRistorante(Ristorante r) {
        em.persist(r);
        return r;
    }
    
    @Override
    public void eliminaRistorante(Ristorante r) {
        em.remove(em.merge(r));
    }
    
    @Override
    public void aggiornaRistorante(Ristorante r) {
        em.merge(r);
    }
    
    @Override
    public int numRistorantiAncoraInGuida() {
        TypedQuery<Long> query = em.createQuery("SELECT COUNT(r) FROM Ristorante r WHERE r.AncoraPresenteInGuida = true", Long.class);
        Long ris = query.getSingleResult();
        return ris.intValue();
    }
    
    @Override
    public int numRistorantiByGuida(String guida) {
        TypedQuery<Long> query = em.createQuery("SELECT COUNT(r) FROM Ristorante r WHERE r.Guida = :guida", Long.class);
        query.setParameter("guida", guida);
        Long ris = query.getSingleResult();
        return ris.intValue();
    }
}