package ro.ase.cts.ChainOfResponsibility.clase;

public class CalatorieMetrou extends CalatorieHandler{
    @Override
    public String recomandaCalatorie(double distanta) {
        return "metrou";
    }
}
