package ro.ase.cts.builder01;

public interface AbstractBuilder {
    Internare build();
    AbstractBuilder setNume(String nume);
    AbstractBuilder setPatRabatil(boolean patRabatil);
    AbstractBuilder setAreMicDejun(boolean micDejun);
    AbstractBuilder setArePapuci(boolean papuci);
    AbstractBuilder setAreHalat(boolean halat);
}
