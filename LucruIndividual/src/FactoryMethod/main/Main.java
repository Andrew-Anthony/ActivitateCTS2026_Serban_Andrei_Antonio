package FactoryMethod.main;

import FactoryMethod.clase.MijlocTransport;
import FactoryMethod.factory.FactoryAutobuz;
import FactoryMethod.factory.FactoryMijlocTransport;
import FactoryMethod.factory.FactoryTramvai;
import FactoryMethod.factory.FactoryTroleibuz;

public class Main {
    public static void main(String[] args) {
        FactoryMijlocTransport factoryAutobuz = new FactoryAutobuz();
        MijlocTransport autobuz = factoryAutobuz.creareMijlocTransport();
        autobuz.pornesteInCursa(105);

        FactoryMijlocTransport factoryTramvai = new FactoryTramvai();
        MijlocTransport tramvai = factoryTramvai.creareMijlocTransport();
        tramvai.pornesteInCursa(203);

        FactoryMijlocTransport factoryTroleibuz = new FactoryTroleibuz();
        MijlocTransport troleibuz = factoryTroleibuz.creareMijlocTransport();
        troleibuz.pornesteInCursa(317);
    }
}
