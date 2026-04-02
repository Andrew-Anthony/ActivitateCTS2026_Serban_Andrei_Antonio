package Cafenea.clase;

import java.util.StringJoiner;

public abstract class BauturaAbstracta implements Bautura {
    protected String name;
    protected double volum;
    protected double pret;

    public BauturaAbstracta(String name, double volum, double pret) {
        this.name = name;
        this.volum = volum;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", BauturaAbstracta.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("volum=" + volum)
                .add("pret=" + pret)
                .toString();
    }
}
