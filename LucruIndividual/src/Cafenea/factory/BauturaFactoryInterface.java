package Cafenea.factory;

import Cafenea.clase.Bautura;

public interface BauturaFactoryInterface {
    Bautura creareCafea(TipBautura tipBautura, String nume, double volum, double pret);
    Bautura creareCeai(TipBautura tipBautura, String nume, double volum, double pret);
    Bautura creareCiocolataCalda(TipBautura tipBautura, String nume, double volum, double pret, String culoareCiocolata);
}
