package SimpleFactory.clase;

public class PersonalFactory {
    public static PersonalSpital crearePersonal(TipPersonal tipPersonal) {
        return switch (tipPersonal) {
            case Medic -> new Medic();
            case Brancardier -> new Brancardier();
            case Asistent -> new Asistent();
        };
    }
}
