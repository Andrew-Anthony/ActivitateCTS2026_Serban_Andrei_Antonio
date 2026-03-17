package ro.ase.cts.builder02;

public class InternareBuilder02 implements AbstractBuilder02{
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuci;
    private boolean halat;

    public InternareBuilder02() {
        this.patRabatabil = false;
        this.micDejun = false;
        this.papuci = false;
        this.halat = false;
    }

    @Override
    public Internare build(String nume) {
        return new Internare(nume,patRabatabil,micDejun,papuci,halat);
    }

    @Override
    public AbstractBuilder02 setPatRabatil(boolean patRabatil) {
        this.patRabatabil = patRabatil;
        return this;
    }

    @Override
    public AbstractBuilder02 setAreMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
        return this;
    }

    @Override
    public AbstractBuilder02 setArePapuci(boolean papuci) {
        this.papuci = papuci;
        return this;
    }

    @Override
    public AbstractBuilder02 setAreHalat(boolean halat) {
        this.halat = halat;
        return this;
    }
}
