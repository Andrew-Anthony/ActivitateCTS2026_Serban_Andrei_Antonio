package FactoryMethod.factory;

import FactoryMethod.clase.MijlocTransport;
import FactoryMethod.clase.Troleibuz;

public class FactoryTroleibuz implements FactoryMijlocTransport{
    @Override
    public MijlocTransport creareMijlocTransport() {
        return new Troleibuz();
    }
}
