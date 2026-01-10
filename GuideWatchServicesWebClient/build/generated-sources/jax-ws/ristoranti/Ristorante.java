
package ristoranti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ristorante complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ristorante"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ancoraPresenteInGuida" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="annoRiconoscimento" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="città" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cucina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nomeRistorante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="riconoscimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ristorante", propOrder = {
    "ancoraPresenteInGuida",
    "annoRiconoscimento",
    "citt\u00e0",
    "cucina",
    "guida",
    "id",
    "nomeRistorante",
    "riconoscimento"
})
public class Ristorante {

    protected boolean ancoraPresenteInGuida;
    protected int annoRiconoscimento;
    protected String città;
    protected String cucina;
    protected String guida;
    @XmlElement(name = "ID")
    protected int id;
    protected String nomeRistorante;
    protected String riconoscimento;

    /**
     * Recupera il valore della proprietà ancoraPresenteInGuida.
     * 
     */
    public boolean isAncoraPresenteInGuida() {
        return ancoraPresenteInGuida;
    }

    /**
     * Imposta il valore della proprietà ancoraPresenteInGuida.
     * 
     */
    public void setAncoraPresenteInGuida(boolean value) {
        this.ancoraPresenteInGuida = value;
    }

    /**
     * Recupera il valore della proprietà annoRiconoscimento.
     * 
     */
    public int getAnnoRiconoscimento() {
        return annoRiconoscimento;
    }

    /**
     * Imposta il valore della proprietà annoRiconoscimento.
     * 
     */
    public void setAnnoRiconoscimento(int value) {
        this.annoRiconoscimento = value;
    }

    /**
     * Recupera il valore della proprietà città.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCittà() {
        return città;
    }

    /**
     * Imposta il valore della proprietà città.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCittà(String value) {
        this.città = value;
    }

    /**
     * Recupera il valore della proprietà cucina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCucina() {
        return cucina;
    }

    /**
     * Imposta il valore della proprietà cucina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCucina(String value) {
        this.cucina = value;
    }

    /**
     * Recupera il valore della proprietà guida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuida() {
        return guida;
    }

    /**
     * Imposta il valore della proprietà guida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuida(String value) {
        this.guida = value;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà nomeRistorante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeRistorante() {
        return nomeRistorante;
    }

    /**
     * Imposta il valore della proprietà nomeRistorante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeRistorante(String value) {
        this.nomeRistorante = value;
    }

    /**
     * Recupera il valore della proprietà riconoscimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiconoscimento() {
        return riconoscimento;
    }

    /**
     * Imposta il valore della proprietà riconoscimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiconoscimento(String value) {
        this.riconoscimento = value;
    }

}
