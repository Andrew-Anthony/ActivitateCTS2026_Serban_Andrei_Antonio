package Cafenea.factory2;

import Cafenea.clase.Bautura;

public interface BauturaFactory {
    Bautura creareBautura(String nume, double volum, double pret);
}
