package ristoranti;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@NamedQueries({
    @NamedQuery(name = "findByID", query = "SELECT r FROM Ristorante r WHERE r.ID = ?1"),
    @NamedQuery(name = "findByCittà", query = "SELECT r FROM Ristorante r WHERE LOWER(r.Città) LIKE LOWER(CONCAT(?2, '%'))"),
    @NamedQuery(name = "findByGuida", query = "SELECT r FROM Ristorante r WHERE r.Guida = ?3"),
    @NamedQuery(name = "getAll", query = "SELECT r FROM Ristorante r")
})
@XmlRootElement
public class Ristorante implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private int ID;
    private String NomeRistorante;
    private String Città;
    private String Cucina;
    private String Guida;
    private String Riconoscimento;
    private int AnnoRiconoscimento;
    private boolean AncoraPresenteInGuida;
    
    public Ristorante() {
        
    }

    public Ristorante(int ID, String NomeRistorante, String Città, String Cucina, String Guida, String Riconoscimento, int AnnoRiconoscimento, boolean AncoraPresenteInGuida) {
        this.ID = ID;
        this.NomeRistorante = NomeRistorante;
        this.Città = Città;
        this.Cucina = Cucina;
        this.Guida = Guida;
        this.Riconoscimento = Riconoscimento;
        this.AnnoRiconoscimento = AnnoRiconoscimento;
        this.AncoraPresenteInGuida = AncoraPresenteInGuida;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNomeRistorante() {
        return NomeRistorante;
    }

    public void setNomeRistorante(String NomeRistorante) {
        this.NomeRistorante = NomeRistorante;
    }

    public String getCittà() {
        return Città;
    }

    public void setCittà(String Città) {
        this.Città = Città;
    }

    public String getCucina(){
        return Cucina;
    }

    public void setCucina(String Cucina) {
        this.Cucina = Cucina;
    }

    public String getGuida() {
        return Guida;
    }

    public void setGuida(String Guida) {
        this.Guida = Guida;
    }

    public String getRiconoscimento() {
        return Riconoscimento;
    }

    public void setRiconoscimento(String Riconoscimento) {
        this.Riconoscimento = Riconoscimento;
    }

    public int getAnnoRiconoscimento() {
        return AnnoRiconoscimento;
    }

    public void setAnnoRiconoscimento(int AnnoRiconoscimento) {
        this.AnnoRiconoscimento = AnnoRiconoscimento;
    }

    public boolean isAncoraPresenteInGuida() {
        return AncoraPresenteInGuida;
    }

    public void setAncoraPresenteInGuida(boolean AncoraPresenteInGuida) {
        this.AncoraPresenteInGuida = AncoraPresenteInGuida;
    }
    
    @Override
    public String toString() {
        return getClass().getName() + "[ID: " +ID+ ", Nome ristorante: " +NomeRistorante+ ", Città: " +Città+ ", Cucina: " +Cucina+ ", Guida: " +Guida+ ", Riconoscimento: " +Riconoscimento+ ", Anno riconoscimento: " +AnnoRiconoscimento+ ", Ancora presente in guida: " +AncoraPresenteInGuida;
    }
}