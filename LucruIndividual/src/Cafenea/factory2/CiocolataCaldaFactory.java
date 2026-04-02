package Cafenea.factory2;

import Cafenea.clase.Bautura;
import Cafenea.clase.CiocolataCalda;

public class CiocolataCaldaFactory implements BauturaFactory{
    @Override
    public Bautura creareBautura(String nume, double volum, double pret) {
        return new CiocolataCalda(nume,volum,pret);
    }
}
