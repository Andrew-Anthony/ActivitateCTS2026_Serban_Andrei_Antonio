package ro.ase.cts.Observer.main;

import ro.ase.cts.Observer.clase.ISpital;
import ro.ase.cts.Observer.clase.Pacient;
import ro.ase.cts.Observer.clase.PacientAbonat;
import ro.ase.cts.Observer.clase.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new PacientAbonat("Leon", 50);
        Pacient pacient2 = new PacientAbonat("Ada", 40);
        Pacient pacient3 = new PacientAbonat("Chris", 30);

        ISpital spital = new Spital("Umbrella");
        spital.aboneaza(pacient1);
        spital.aboneaza(pacient2);
        spital.aboneaza(pacient3);

        ((Spital)spital).notificaVirus();
        ((Spital)spital).notificaEpidemie();
    }
}
