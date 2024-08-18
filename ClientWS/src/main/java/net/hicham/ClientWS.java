package net.hicham;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy=new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.conversionEuroToDH(800));
        Compte compte=proxy.getCompte(5);
        System.out.println("###########################");
        System.out.println("Solde = "+compte.getSoulde());
        System.out.println("Date ="+compte.getDateCreation());
        System.out.println("*******************");
        List<Compte> comptes=proxy.getComptes();
        for (Compte compte1:comptes
             ) {
            System.out.println("Code = "+compte1.getCode());
             System.out.println("Solde = "+compte.getSoulde());
            System.out.println("Date ="+compte.getDateCreation());

        }
    }
}
