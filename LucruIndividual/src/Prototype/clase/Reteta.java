package Prototype.clase;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Reteta implements PrototypeReteta{
    private String nume;
    private List<String> solutii;

    public Reteta() {
    }

    public Reteta(String nume, List<String> solutii) {
        this.nume = nume;
        this.solutii = solutii;
    }

    public List<String> getSolutii() {
        return solutii;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setSolutii(List<String> solutii) {
        this.solutii = solutii;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Reteta.class.getSimpleName() + "[", "]")
                .add("nume='" + nume + "'")
                .add("solutii=" + solutii)
                .toString();
    }

    @Override
    public PrototypeReteta shallowCopy() {
        Reteta reteta = new Reteta();
        reteta.nume = this.nume;
        reteta.solutii = this.solutii;

        return reteta;
    }

    @Override
    public PrototypeReteta deepCopy() {
        Reteta reteta = new Reteta();
        reteta.nume = this.nume;
        reteta.solutii = new ArrayList<>(this.solutii);

        return reteta;
    }
}
