
package hello;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.xmlsoap.schemas.ws._2004._08.addressing.AttributedURI;
import org.xmlsoap.schemas.ws._2004._08.addressing.EndpointReferenceType;
import org.xmlsoap.schemas.ws._2004._08.addressing.Relationship;


/**
 * <p>Java class for PSBAddressingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PSBAddressingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://schemas.xmlsoap.org/ws/2004/08/addressing}MessageID"/>
 *         &lt;element ref="{http://schemas.xmlsoap.org/ws/2004/08/addressing}To"/>
 *         &lt;element ref="{http://schemas.xmlsoap.org/ws/2004/08/addressing}Action"/>
 *         &lt;element ref="{http://schemas.xmlsoap.org/ws/2004/08/addressing}From"/>
 *         &lt;element ref="{http://schemas.xmlsoap.org/ws/2004/08/addressing}ReplyTo"/>
 *         &lt;element ref="{http://schemas.xmlsoap.org/ws/2004/08/addressing}FaultTo"/>
 *         &lt;element ref="{http://schemas.xmlsoap.org/ws/2004/08/addressing}RelatesTo" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.xmlsoap.org/ws/2004/08/addressing}EndpointReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSBAddressingType", propOrder = {
    "messageID",
    "to",
    "action",
    "from",
    "replyTo",
    "faultTo",
    "relatesTo",
    "endpointReference"
})
public class PSBAddressingType {

    @XmlElement(name = "MessageID", namespace = "http://schemas.xmlsoap.org/ws/2004/08/addressing", required = true)
    protected AttributedURI messageID;
    @XmlElement(name = "To", namespace = "http://schemas.xmlsoap.org/ws/2004/08/addressing", required = true)
    protected AttributedURI to;
    @XmlElement(name = "Action", namespace = "http://schemas.xmlsoap.org/ws/2004/08/addressing", required = true)
    protected AttributedURI action;
    @XmlElement(name = "From", namespace = "http://schemas.xmlsoap.org/ws/2004/08/addressing", required = true)
    protected EndpointReferenceType from;
    @XmlElement(name = "ReplyTo", namespace = "http://schemas.xmlsoap.org/ws/2004/08/addressing", required = true)
    protected EndpointReferenceType replyTo;
    @XmlElement(name = "FaultTo", namespace = "http://schemas.xmlsoap.org/ws/2004/08/addressing", required = true)
    protected EndpointReferenceType faultTo;
    @XmlElement(name = "RelatesTo", namespace = "http://schemas.xmlsoap.org/ws/2004/08/addressing")
    protected Relationship relatesTo;
    @XmlElement(name = "EndpointReference", namespace = "http://schemas.xmlsoap.org/ws/2004/08/addressing")
    protected EndpointReferenceType endpointReference;

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link AttributedURI }
     *     
     */
    public AttributedURI getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributedURI }
     *     
     */
    public void setMessageID(AttributedURI value) {
        this.messageID = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link AttributedURI }
     *     
     */
    public AttributedURI getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributedURI }
     *     
     */
    public void setTo(AttributedURI value) {
        this.to = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link AttributedURI }
     *     
     */
    public AttributedURI getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributedURI }
     *     
     */
    public void setAction(AttributedURI value) {
        this.action = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link EndpointReferenceType }
     *     
     */
    public EndpointReferenceType getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointReferenceType }
     *     
     */
    public void setFrom(EndpointReferenceType value) {
        this.from = value;
    }

    /**
     * Gets the value of the replyTo property.
     * 
     * @return
     *     possible object is
     *     {@link EndpointReferenceType }
     *     
     */
    public EndpointReferenceType getReplyTo() {
        return replyTo;
    }

    /**
     * Sets the value of the replyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointReferenceType }
     *     
     */
    public void setReplyTo(EndpointReferenceType value) {
        this.replyTo = value;
    }

    /**
     * Gets the value of the faultTo property.
     * 
     * @return
     *     possible object is
     *     {@link EndpointReferenceType }
     *     
     */
    public EndpointReferenceType getFaultTo() {
        return faultTo;
    }

    /**
     * Sets the value of the faultTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointReferenceType }
     *     
     */
    public void setFaultTo(EndpointReferenceType value) {
        this.faultTo = value;
    }

    /**
     * Gets the value of the relatesTo property.
     * 
     * @return
     *     possible object is
     *     {@link Relationship }
     *     
     */
    public Relationship getRelatesTo() {
        return relatesTo;
    }

    /**
     * Sets the value of the relatesTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Relationship }
     *     
     */
    public void setRelatesTo(Relationship value) {
        this.relatesTo = value;
    }

    /**
     * Gets the value of the endpointReference property.
     * 
     * @return
     *     possible object is
     *     {@link EndpointReferenceType }
     *     
     */
    public EndpointReferenceType getEndpointReference() {
        return endpointReference;
    }

    /**
     * Sets the value of the endpointReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointReferenceType }
     *     
     */
    public void setEndpointReference(EndpointReferenceType value) {
        this.endpointReference = value;
    }

}
