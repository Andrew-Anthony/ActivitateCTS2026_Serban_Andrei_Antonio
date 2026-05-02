package ro.ase.cts.Composite.main;

import ro.ase.cts.Composite.clase.Departament;
import ro.ase.cts.Composite.clase.Sectie;
import ro.ase.cts.Composite.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura administratie = new Departament("Administratie");
        Structura spital = new Departament("Spital");
        Structura secretariat = new Sectie("Secretariat", 12);
        Structura management = new Sectie("Management", 5);

        ((Departament)spital).adaugaStructura(administratie);
        ((Departament)spital).adaugaStructura(management);
        ((Departament)administratie).adaugaStructura(secretariat);
        spital.afiseazaDetaliiStructura();

        ((Departament)spital).stergeStructura(management);
        ((Departament)administratie).adaugaStructura(management);
    }
}
