package ro.ase.cts.Facade.clase;

public class Medic {
    public boolean areInregistratPacientul(Pacient pacient) {
        return pacient.getGravitate() > 5;
    }
}
