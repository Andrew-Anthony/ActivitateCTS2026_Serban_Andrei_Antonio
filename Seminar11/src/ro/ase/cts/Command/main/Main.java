package ro.ase.cts.Command.main;

import ro.ase.cts.Command.clase.*;

public class Main {
    public static void main(String[] args) {
        PersonalSpital medic = new Medic("RazvanIeseLaTabla");
        PersonalSpital asistenta = new Asistenta("StefanIeseLaTabla");

        Pacient pacient1 = new Pacient("Eduard");
        Pacient pacient2 = new Pacient("Dragos");

        Command comanda1 = new Internare(medic, pacient1);
        Command comanda2 = new Tratare(asistenta, pacient2);

        Operator operator = new Operator();

        operator.inregistreazaComanda(comanda1);
        operator.inregistreazaComanda(comanda2);

        operator.executaFISA();
        operator.inregistreazaComanda(new Tratare(asistenta, new Pacient("marius")));
        operator.executaFISA();
        operator.executaFISA();
    }
}
