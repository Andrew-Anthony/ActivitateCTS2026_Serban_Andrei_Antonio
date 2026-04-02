package Cafenea.factory2;

import Cafenea.clase.Bautura;
import Cafenea.clase.Cafea;

public class CafeaFactory implements BauturaFactory{
    @Override
    public Bautura creareBautura(String nume, double volum, double pret) {
        return new Cafea(nume, volum, pret);
    }
}
