package SimpleFactory.main;

import SimpleFactory.clase.PersonalFactory;
import SimpleFactory.clase.PersonalSpital;
import SimpleFactory.clase.TipPersonal;


public class Main {
    public static void main(String[] args) {
        PersonalSpital doctor = PersonalFactory.crearePersonal(TipPersonal.Brancardier);
        doctor.afiseazaDetalii();
    }
}
