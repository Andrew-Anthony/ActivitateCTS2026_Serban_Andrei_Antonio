package Cafenea.factory;

import Cafenea.clase.Bautura;
import Cafenea.clase.Cafea;

public class CafeaFactory implements BauturaFactoryInterface{
    @Override
    public Bautura creareCafea(TipBautura tipBautura, String nume, double volum, double pret) {
        if(tipBautura == TipBautura.Cafea) {
            return new Cafea(nume,volum,pret);
        }
        throw new IllegalArgumentException("Tip de bautura incompatibil");
    }

    @Override
    public Bautura creareCeai(TipBautura tipBautura, String nume, double volum, double pret) {
        return creareCafea(tipBautura,nume,volum,pret);
        //throw new IllegalArgumentException("Tip de bautura Incompatibil");
    }

    @Override
    public Bautura creareCiocolataCalda(TipBautura tipBautura, String nume, double volum, double pret, String culoareCiocolata) {
        return null;
    }
}
