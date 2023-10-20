
package hello;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hello package. 
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

    private final static QName _IsPalindromeResponse_QNAME = new QName("http://hello", "isPalindromeResponse");
    private final static QName _SSCAddressing_QNAME = new QName("http://hello", "SSCAddressing");
    private final static QName _IsPalindrome_QNAME = new QName("http://hello", "isPalindrome");
    private final static QName _Header_QNAME = new QName("http://hello", "Header");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hello
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IsPalindrome }
     * 
     */
    public IsPalindrome createIsPalindrome() {
        return new IsPalindrome();
    }

    /**
     * Create an instance of {@link SayHelloHeader }
     * 
     */
    public SayHelloHeader createSayHelloHeader() {
        return new SayHelloHeader();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link UpdateAddress }
     * 
     */
    public UpdateAddress createUpdateAddress() {
        return new UpdateAddress();
    }

    /**
     * Create an instance of {@link Holder }
     * 
     */
    public Holder createHolder() {
        return new Holder();
    }

    /**
     * Create an instance of {@link IsPalindromeResponse }
     * 
     */
    public IsPalindromeResponse createIsPalindromeResponse() {
        return new IsPalindromeResponse();
    }

    /**
     * Create an instance of {@link PSBAddressingType }
     * 
     */
    public PSBAddressingType createPSBAddressingType() {
        return new PSBAddressingType();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsPalindromeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hello", name = "isPalindromeResponse")
    public JAXBElement<IsPalindromeResponse> createIsPalindromeResponse(IsPalindromeResponse value) {
        return new JAXBElement<IsPalindromeResponse>(_IsPalindromeResponse_QNAME, IsPalindromeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PSBAddressingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hello", name = "SSCAddressing")
    public JAXBElement<PSBAddressingType> createSSCAddressing(PSBAddressingType value) {
        return new JAXBElement<PSBAddressingType>(_SSCAddressing_QNAME, PSBAddressingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsPalindrome }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hello", name = "isPalindrome")
    public JAXBElement<IsPalindrome> createIsPalindrome(IsPalindrome value) {
        return new JAXBElement<IsPalindrome>(_IsPalindrome_QNAME, IsPalindrome.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Header }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hello", name = "Header")
    public JAXBElement<Header> createHeader(Header value) {
        return new JAXBElement<Header>(_Header_QNAME, Header.class, null, value);
    }

}
