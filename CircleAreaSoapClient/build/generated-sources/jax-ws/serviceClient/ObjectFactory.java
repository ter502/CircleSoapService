
package serviceClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serviceClient package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
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

    private final static QName _Area_QNAME = new QName("http://services/", "area");
    private final static QName _AreaResponse_QNAME = new QName("http://services/", "areaResponse");
    private final static QName _Circumference_QNAME = new QName("http://services/", "circumference");
    private final static QName _CircumferenceResponse_QNAME = new QName("http://services/", "circumferenceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serviceClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Area }
     * 
     */
    public Area createArea() {
        return new Area();
    }

    /**
     * Create an instance of {@link AreaResponse }
     * 
     */
    public AreaResponse createAreaResponse() {
        return new AreaResponse();
    }

    /**
     * Create an instance of {@link Circumference }
     * 
     */
    public Circumference createCircumference() {
        return new Circumference();
    }

    /**
     * Create an instance of {@link CircumferenceResponse }
     * 
     */
    public CircumferenceResponse createCircumferenceResponse() {
        return new CircumferenceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Area }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Area }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "area")
    public JAXBElement<Area> createArea(Area value) {
        return new JAXBElement<Area>(_Area_QNAME, Area.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AreaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AreaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "areaResponse")
    public JAXBElement<AreaResponse> createAreaResponse(AreaResponse value) {
        return new JAXBElement<AreaResponse>(_AreaResponse_QNAME, AreaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Circumference }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Circumference }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "circumference")
    public JAXBElement<Circumference> createCircumference(Circumference value) {
        return new JAXBElement<Circumference>(_Circumference_QNAME, Circumference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CircumferenceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CircumferenceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "circumferenceResponse")
    public JAXBElement<CircumferenceResponse> createCircumferenceResponse(CircumferenceResponse value) {
        return new JAXBElement<CircumferenceResponse>(_CircumferenceResponse_QNAME, CircumferenceResponse.class, null, value);
    }

}
