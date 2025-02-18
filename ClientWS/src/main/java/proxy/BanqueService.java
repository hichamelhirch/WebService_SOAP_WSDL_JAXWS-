
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.3
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://WS.hicham.net/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conversionEuroToDH", targetNamespace = "http://WS.hicham.net/", className = "proxy.ConversionEuroToDH")
    @ResponseWrapper(localName = "conversionEuroToDHResponse", targetNamespace = "http://WS.hicham.net/", className = "proxy.ConversionEuroToDHResponse")
    @Action(input = "http://WS.hicham.net/BanqueService/conversionEuroToDHRequest", output = "http://WS.hicham.net/BanqueService/conversionEuroToDHResponse")
    public double conversionEuroToDH(
        @WebParam(name = "MONTANT", targetNamespace = "")
        double montant);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getComptes", targetNamespace = "http://WS.hicham.net/", className = "proxy.GetComptes")
    @ResponseWrapper(localName = "getComptesResponse", targetNamespace = "http://WS.hicham.net/", className = "proxy.GetComptesResponse")
    @Action(input = "http://WS.hicham.net/BanqueService/getComptesRequest", output = "http://WS.hicham.net/BanqueService/getComptesResponse")
    public List<Compte> getComptes();

    /**
     * 
     * @param code
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://WS.hicham.net/", className = "proxy.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://WS.hicham.net/", className = "proxy.GetCompteResponse")
    @Action(input = "http://WS.hicham.net/BanqueService/getCompteRequest", output = "http://WS.hicham.net/BanqueService/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

}
