package net.hicham.server;

import jakarta.xml.ws.Endpoint;
import net.hicham.WS.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        String url="http://0.0.0.0:8787/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("ce web service déployé sur "+url);
    }
}
