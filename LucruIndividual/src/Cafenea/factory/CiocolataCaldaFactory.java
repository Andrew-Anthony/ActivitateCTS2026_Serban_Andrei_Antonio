package Cafenea.factory;

import Cafenea.clase.Bautura;
import Cafenea.clase.CiocolataCalda;

public class CiocolataCaldaFactory implements BauturaFactoryInterface{
    @Override
    public Bautura creareCafea(TipBautura tipBautura, String nume, double volum, double pret) {
        return null;
    }

    @Override
    public Bautura creareCeai(TipBautura tipBautura, String nume, double volum, double pret) {
        return null;
    }

    @Override
    public Bautura creareCiocolataCalda(TipBautura tipBautura, String nume, double volum, double pret, String culoareCiocolata) {
        if(tipBautura == TipBautura.CiocolataCalda) {
            return new CiocolataCalda(nume,volum,pret,culoareCiocolata);
        }
        throw new IllegalArgumentException("Tip de bautura Incompatibil");
    }
}
