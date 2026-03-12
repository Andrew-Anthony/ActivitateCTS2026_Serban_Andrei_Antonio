package ro.ase.cts.main;

import ro.ase.cts.factory.MijlocTransportFactory;
import ro.ase.cts.factory.MijlocTransportType;
import ro.ase.cts.vehicule.MijlocTransport;

public class Main {
    public static void afisareMijlocTransport(MijlocTransport mijlocTransport){
        mijlocTransport.afisareDescriere();
    }
    public static void main(String[] args){
//        MijlocTransportFactory factory = new MijlocTransportFactory();

        MijlocTransport autobuz = MijlocTransportFactory.getMijlocTransport("Mercedes", 432, MijlocTransportType.AUTOBUZ);
        MijlocTransport tramvai = MijlocTransportFactory.getMijlocTransport("Astra", 1, MijlocTransportType.TRAMVAI);
        MijlocTransport troleibuz = MijlocTransportFactory.getMijlocTransport("Mercedes", 97, MijlocTransportType.TROLEIBUZ);

        afisareMijlocTransport(autobuz);
        afisareMijlocTransport(tramvai);
        afisareMijlocTransport(troleibuz);
    }
}
