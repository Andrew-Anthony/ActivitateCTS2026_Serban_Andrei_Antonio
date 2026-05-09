package ro.ase.cts.ChainOfResponsibility.clase;

public class CalatorieTramvai extends CalatorieHandler{
    @Override
    public String recomandaCalatorie(double distanta) {
        if(distanta < 10) {
            return "tramvai";
        } else {
            return this.calatorieHandler.recomandaCalatorie(distanta);
        }
    }
}
