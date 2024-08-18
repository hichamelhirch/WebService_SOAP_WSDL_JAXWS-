package net.hicham.WS;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;
// POJO plain old java object
@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "conversionEuroToDH")
    public double conversion(@WebParam(name ="MONTANT") double mt){
        return mt*11;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name ="code") int code){
     return new Compte(code,
             Math.random()*3000,new Date());
    }
    @WebMethod
    public List<Compte> getComptes() {
        return List.of(
                new Compte(1, Math.random() * 3000, new Date()),
                new Compte(2, Math.random() * 3000, new Date()),
                new Compte(3, Math.random() * 3000, new Date()),
                new Compte(4, Math.random() * 3000, new Date())
        );
    }
}
