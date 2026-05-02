package ro.ase.cts.Decorator.clase.decorator;

import ro.ase.cts.Decorator.clase.NotaDePlataAbstract;

public abstract class NotaDePlataDecorator implements NotaDePlataAbstract {
    private NotaDePlataAbstract notaDePlata;

    public NotaDePlataDecorator(NotaDePlataAbstract notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printeaza() {
        notaDePlata.printeaza();
    }
    public abstract void printeazaFelicitare();
}
