package Cafenea.factory2;

import Cafenea.clase.Bautura;
import Cafenea.clase.Ceai;

public class CeaiFactory implements BauturaFactory{
    @Override
    public Bautura creareBautura(String nume, double volum, double pret) {
        return new Ceai(nume,volum,pret);
    }
}
