package ro.ase.cts.builder01;

public class InternareBuilder implements AbstractBuilder {
    private Internare internare;

    public InternareBuilder(String numePacient) {
        internare = new Internare(numePacient, false, false,false,false);
    }

    @Override
    public Internare build() {
        return this.internare;
    }

    @Override
    public AbstractBuilder setNume(String nume) {
        this.internare.setNumePacient(nume);
        return this;
    }

    @Override
    public AbstractBuilder setPatRabatil(boolean patRabatil) {
        this.internare.setPatRabatabil(patRabatil);
        return this;
    }

    @Override
    public AbstractBuilder setAreMicDejun(boolean micDejun) {
        this.internare.setMicDejun(micDejun);
        return this;
    }

    @Override
    public AbstractBuilder setArePapuci(boolean papuci) {
        this.internare.setPapuci(papuci);
        return this;
    }

    @Override
    public AbstractBuilder setAreHalat(boolean halat) {
        this.internare.setHalat(halat);
        return this;
    }
}
