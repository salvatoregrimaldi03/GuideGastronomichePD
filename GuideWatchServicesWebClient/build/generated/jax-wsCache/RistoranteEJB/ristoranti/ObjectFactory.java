
package ristoranti;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ristoranti package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AggiornaRistorante_QNAME = new QName("http://ristoranti/", "aggiornaRistorante");
    private final static QName _AggiornaRistoranteResponse_QNAME = new QName("http://ristoranti/", "aggiornaRistoranteResponse");
    private final static QName _CreaRistorante_QNAME = new QName("http://ristoranti/", "creaRistorante");
    private final static QName _CreaRistoranteResponse_QNAME = new QName("http://ristoranti/", "creaRistoranteResponse");
    private final static QName _EliminaRistorante_QNAME = new QName("http://ristoranti/", "eliminaRistorante");
    private final static QName _EliminaRistoranteResponse_QNAME = new QName("http://ristoranti/", "eliminaRistoranteResponse");
    private final static QName _FindByCittà_QNAME = new QName("http://ristoranti/", "findByCitt\u00e0");
    private final static QName _FindByCittàResponse_QNAME = new QName("http://ristoranti/", "findByCitt\u00e0Response");
    private final static QName _FindByGuida_QNAME = new QName("http://ristoranti/", "findByGuida");
    private final static QName _FindByGuidaResponse_QNAME = new QName("http://ristoranti/", "findByGuidaResponse");
    private final static QName _FindByID_QNAME = new QName("http://ristoranti/", "findByID");
    private final static QName _FindByIDResponse_QNAME = new QName("http://ristoranti/", "findByIDResponse");
    private final static QName _GetAll_QNAME = new QName("http://ristoranti/", "getAll");
    private final static QName _GetAllResponse_QNAME = new QName("http://ristoranti/", "getAllResponse");
    private final static QName _NumRistorantiAncoraInGuida_QNAME = new QName("http://ristoranti/", "numRistorantiAncoraInGuida");
    private final static QName _NumRistorantiAncoraInGuidaResponse_QNAME = new QName("http://ristoranti/", "numRistorantiAncoraInGuidaResponse");
    private final static QName _NumRistorantiByGuida_QNAME = new QName("http://ristoranti/", "numRistorantiByGuida");
    private final static QName _NumRistorantiByGuidaResponse_QNAME = new QName("http://ristoranti/", "numRistorantiByGuidaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ristoranti
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AggiornaRistorante }
     * 
     */
    public AggiornaRistorante createAggiornaRistorante() {
        return new AggiornaRistorante();
    }

    /**
     * Create an instance of {@link AggiornaRistoranteResponse }
     * 
     */
    public AggiornaRistoranteResponse createAggiornaRistoranteResponse() {
        return new AggiornaRistoranteResponse();
    }

    /**
     * Create an instance of {@link CreaRistorante }
     * 
     */
    public CreaRistorante createCreaRistorante() {
        return new CreaRistorante();
    }

    /**
     * Create an instance of {@link CreaRistoranteResponse }
     * 
     */
    public CreaRistoranteResponse createCreaRistoranteResponse() {
        return new CreaRistoranteResponse();
    }

    /**
     * Create an instance of {@link EliminaRistorante }
     * 
     */
    public EliminaRistorante createEliminaRistorante() {
        return new EliminaRistorante();
    }

    /**
     * Create an instance of {@link EliminaRistoranteResponse }
     * 
     */
    public EliminaRistoranteResponse createEliminaRistoranteResponse() {
        return new EliminaRistoranteResponse();
    }

    /**
     * Create an instance of {@link FindByCittà }
     * 
     */
    public FindByCittà createFindByCittà() {
        return new FindByCittà();
    }

    /**
     * Create an instance of {@link FindByCittàResponse }
     * 
     */
    public FindByCittàResponse createFindByCittàResponse() {
        return new FindByCittàResponse();
    }

    /**
     * Create an instance of {@link FindByGuida }
     * 
     */
    public FindByGuida createFindByGuida() {
        return new FindByGuida();
    }

    /**
     * Create an instance of {@link FindByGuidaResponse }
     * 
     */
    public FindByGuidaResponse createFindByGuidaResponse() {
        return new FindByGuidaResponse();
    }

    /**
     * Create an instance of {@link FindByID }
     * 
     */
    public FindByID createFindByID() {
        return new FindByID();
    }

    /**
     * Create an instance of {@link FindByIDResponse }
     * 
     */
    public FindByIDResponse createFindByIDResponse() {
        return new FindByIDResponse();
    }

    /**
     * Create an instance of {@link GetAll }
     * 
     */
    public GetAll createGetAll() {
        return new GetAll();
    }

    /**
     * Create an instance of {@link GetAllResponse }
     * 
     */
    public GetAllResponse createGetAllResponse() {
        return new GetAllResponse();
    }

    /**
     * Create an instance of {@link NumRistorantiAncoraInGuida }
     * 
     */
    public NumRistorantiAncoraInGuida createNumRistorantiAncoraInGuida() {
        return new NumRistorantiAncoraInGuida();
    }

    /**
     * Create an instance of {@link NumRistorantiAncoraInGuidaResponse }
     * 
     */
    public NumRistorantiAncoraInGuidaResponse createNumRistorantiAncoraInGuidaResponse() {
        return new NumRistorantiAncoraInGuidaResponse();
    }

    /**
     * Create an instance of {@link NumRistorantiByGuida }
     * 
     */
    public NumRistorantiByGuida createNumRistorantiByGuida() {
        return new NumRistorantiByGuida();
    }

    /**
     * Create an instance of {@link NumRistorantiByGuidaResponse }
     * 
     */
    public NumRistorantiByGuidaResponse createNumRistorantiByGuidaResponse() {
        return new NumRistorantiByGuidaResponse();
    }

    /**
     * Create an instance of {@link Ristorante }
     * 
     */
    public Ristorante createRistorante() {
        return new Ristorante();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggiornaRistorante }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AggiornaRistorante }{@code >}
     */
    @XmlElementDecl(namespace = "http://ristoranti/", name = "aggiornaRistorante")
    public JAXBElement<AggiornaRistorante> createAggiornaRistorante(AggiornaRistorante value) {
        return new JAXBElement<AggiornaRistorante>(_AggiornaRistorante_QNAME, AggiornaRistorante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggiornaRistoranteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AggiornaRistoranteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ristoranti/", name = "aggiornaRistoranteResponse")
    public JAXBElement<AggiornaRistoranteResponse> createAggiornaRistoranteResponse(AggiornaRistoranteResponse value) {
        return new JAXBElement<AggiornaRistoranteResponse>(_AggiornaRistoranteResponse_QNAME, AggiornaRistoranteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreaRistorante }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreaRistorante }{@code >}
     */
    @XmlElementDecl(namespace = "http://ristoranti/", name = "creaRistorante")
    public JAXBElement<CreaRistorante> createCreaRistorante(CreaRistorante value) {
        return new JAXBElement<CreaRistorante>(_CreaRistorante_QNAME, CreaRistorante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreaRistoranteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreaRistoranteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ristoranti/", name = "creaRistoranteResponse")
    public JAXBElement<CreaRistoranteResponse> createCreaRistoranteResponse(CreaRistoranteResponse value) {
        return new JAXBElement<CreaRistoranteResponse>(_CreaRistoranteResponse_QNAME, CreaRistoranteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminaRistorante }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminaRistorante }{@code >}
     */
    @XmlElementDecl(namespace = "http://ristoranti/", name = "eliminaRistorante")
    public JAXBElement<EliminaRistorante> createEliminaRistorante(EliminaRistorante value) {
        return new JAXBElement<EliminaRistorante>(_EliminaRistorante_QNAME, EliminaRistorante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminaRistoranteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminaRistoranteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ristoranti/", name = "eliminaRistoranteResponse")
    public JAXBElement<EliminaRistoranteResponse> createEliminaRistoranteResponse(EliminaRistoranteResponse value) {
        return new JAXBElement<EliminaRistoranteResponse>(_EliminaRistoranteResponse_QNAME, EliminaRistoranteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByCittà }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByCittà }{@code >}
     */
    @XmlElementDecl(namespace = "http://ristoranti/", name = "findByCitt\u00e0")
    public JAXBElement<FindByCittà> createFindByCittà(FindByCittà value) {
        return new JAXBElement<FindByCittà>(_FindByCittà_QNAME, FindByCittà.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByCittàResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByCittàResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ristoranti/", name = "findByCitt\u00e0Response")
    public JAXBElement<FindByCittàResponse> createFindByCittàResponse(FindByCittàResponse value) {
        return new JAXBElement<FindByCittàResponse>(_FindByCittàResponse_QNAME, FindByCittàResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByGuida }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByGuida }{@code >}
     */
    @XmlElementDecl(namespace = "http://ristoranti/", name = "findByGuida")
    public JAXBElement<FindByGuida> createFindByGuida(FindByGuida value) {
        return new JAXBElement<FindByGuida>(_FindByGuida_QNAME, FindByGuida.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByGuidaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByGuidaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ristoranti/", name = "findByGuidaResponse")
    public JAXBElement<FindByGuidaResponse> createFindByGuidaResponse(FindByGuidaResponse value) {
        return new JAXBElement<FindByGuidaResponse>(_FindByGuidaResponse_QNAME, FindByGuidaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByID }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByID }{@code >}
     */
    @XmlElementDecl(namespace = "http://ristoranti/", name = "findByID")
    public JAXBElement<FindByID> createFindByID(FindByID value) {
        return new JAXBElement<FindByID>(_FindByID_QNAME, FindByID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByIDResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByIDResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ristoranti/", name = "findByIDResponse")
    public JAXBElement<FindByIDResponse> createFindByIDResponse(FindByIDResponse value) {
        return new JAXBElement<FindByIDResponse>(_FindByIDResponse_QNAME, FindByIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}
     */
    @XmlElementDecl(namespace = "http://ristoranti/", name = "getAll")
    public JAXBElement<GetAll> createGetAll(GetAll value) {
        return new JAXBElement<GetAll>(_GetAll_QNAME, GetAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ristoranti/", name = "getAllResponse")
    public JAXBElement<GetAllResponse> createGetAllResponse(GetAllResponse value) {
        return new JAXBElement<GetAllResponse>(_GetAllResponse_QNAME, GetAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumRistorantiAncoraInGuida }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NumRistorantiAncoraInGuida }{@code >}
     */
    @XmlElementDecl(namespace = "http://ristoranti/", name = "numRistorantiAncoraInGuida")
    public JAXBElement<NumRistorantiAncoraInGuida> createNumRistorantiAncoraInGuida(NumRistorantiAncoraInGuida value) {
        return new JAXBElement<NumRistorantiAncoraInGuida>(_NumRistorantiAncoraInGuida_QNAME, NumRistorantiAncoraInGuida.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumRistorantiAncoraInGuidaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NumRistorantiAncoraInGuidaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ristoranti/", name = "numRistorantiAncoraInGuidaResponse")
    public JAXBElement<NumRistorantiAncoraInGuidaResponse> createNumRistorantiAncoraInGuidaResponse(NumRistorantiAncoraInGuidaResponse value) {
        return new JAXBElement<NumRistorantiAncoraInGuidaResponse>(_NumRistorantiAncoraInGuidaResponse_QNAME, NumRistorantiAncoraInGuidaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumRistorantiByGuida }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NumRistorantiByGuida }{@code >}
     */
    @XmlElementDecl(namespace = "http://ristoranti/", name = "numRistorantiByGuida")
    public JAXBElement<NumRistorantiByGuida> createNumRistorantiByGuida(NumRistorantiByGuida value) {
        return new JAXBElement<NumRistorantiByGuida>(_NumRistorantiByGuida_QNAME, NumRistorantiByGuida.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumRistorantiByGuidaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NumRistorantiByGuidaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ristoranti/", name = "numRistorantiByGuidaResponse")
    public JAXBElement<NumRistorantiByGuidaResponse> createNumRistorantiByGuidaResponse(NumRistorantiByGuidaResponse value) {
        return new JAXBElement<NumRistorantiByGuidaResponse>(_NumRistorantiByGuidaResponse_QNAME, NumRistorantiByGuidaResponse.class, null, value);
    }

}
