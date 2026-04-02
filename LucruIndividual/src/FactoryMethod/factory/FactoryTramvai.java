package FactoryMethod.factory;

import FactoryMethod.clase.MijlocTransport;
import FactoryMethod.clase.Tramvai;

public class FactoryTramvai implements FactoryMijlocTransport{
    @Override
    public MijlocTransport creareMijlocTransport() {
        return new Tramvai();
    }
}
