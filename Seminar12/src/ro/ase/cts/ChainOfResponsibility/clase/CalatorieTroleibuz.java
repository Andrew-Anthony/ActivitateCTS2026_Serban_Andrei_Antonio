package ro.ase.cts.ChainOfResponsibility.clase;

public class CalatorieTroleibuz extends CalatorieHandler{
    @Override
    public String recomandaCalatorie(double distanta) {
        if (distanta < 3) {
            return "Troleibuz";
        } else {
            return this.calatorieHandler.recomandaCalatorie(distanta);
        }
    }
}
