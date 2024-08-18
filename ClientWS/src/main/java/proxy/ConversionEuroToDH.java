
package proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conversionEuroToDH complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="conversionEuroToDH">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MONTANT" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conversionEuroToDH", propOrder = {
    "montant"
})
public class ConversionEuroToDH {

    @XmlElement(name = "MONTANT")
    protected double montant;

    /**
     * Gets the value of the montant property.
     * 
     */
    public double getMONTANT() {
        return montant;
    }

    /**
     * Sets the value of the montant property.
     * 
     */
    public void setMONTANT(double value) {
        this.montant = value;
    }

}
