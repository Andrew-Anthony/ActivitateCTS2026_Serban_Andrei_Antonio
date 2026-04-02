package Cafenea.factory;

import Cafenea.clase.Bautura;
import Cafenea.clase.Ceai;

public class CeaiFactory implements BauturaFactoryInterface{
    @Override
    public Bautura creareCafea(TipBautura tipBautura, String nume, double volum, double pret) {
        return null;
    }

    @Override
    public Bautura creareCeai(TipBautura tipBautura, String nume, double volum, double pret) {
        if(tipBautura == TipBautura.Ceai) {
            return new Ceai(nume,volum,pret);
        }
        throw new IllegalArgumentException("Tip de bautura Incompatibil");
    }

    @Override
    public Bautura creareCiocolataCalda(TipBautura tipBautura, String nume, double volum, double pret, String culoareCiocolata) {
        return null;
    }
}
