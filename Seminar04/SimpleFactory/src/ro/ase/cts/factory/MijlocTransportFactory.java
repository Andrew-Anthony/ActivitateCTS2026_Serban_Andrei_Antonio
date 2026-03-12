package ro.ase.cts.factory;

import ro.ase.cts.vehicule.Autobuz;
import ro.ase.cts.vehicule.MijlocTransport;
import ro.ase.cts.vehicule.Tramvai;
import ro.ase.cts.vehicule.Troleibuz;

public class MijlocTransportFactory {

    public static MijlocTransport getMijlocTransport(String marca, int linie, MijlocTransportType tip){
        return switch (tip) {
            case AUTOBUZ -> new Autobuz(marca, linie);
            case TRAMVAI -> new Tramvai(marca, linie);
            case TROLEIBUZ -> new Troleibuz(marca, linie);
        };
    }
}
