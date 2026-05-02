package ro.ase.cts.Decorator.clase.decorator;

import ro.ase.cts.Decorator.clase.NotaDePlataAbstract;

public class NotaDePlataNouAn extends NotaDePlataDecorator{
    public NotaDePlataNouAn(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {

    }
}
