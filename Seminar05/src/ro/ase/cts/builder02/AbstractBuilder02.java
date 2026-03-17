package ro.ase.cts.builder02;

public interface AbstractBuilder02 {
    Internare build(String nume);
    AbstractBuilder02 setPatRabatil(boolean patRabatil);
    AbstractBuilder02 setAreMicDejun(boolean micDejun);
    AbstractBuilder02 setArePapuci(boolean papuci);
    AbstractBuilder02 setAreHalat(boolean halat);
}
