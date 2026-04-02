package FactoryMethod.factory;

import FactoryMethod.clase.Autobuz;
import FactoryMethod.clase.MijlocTransport;

public class FactoryAutobuz implements FactoryMijlocTransport{
    @Override
    public MijlocTransport creareMijlocTransport() {
        return new Autobuz();
    }
}
