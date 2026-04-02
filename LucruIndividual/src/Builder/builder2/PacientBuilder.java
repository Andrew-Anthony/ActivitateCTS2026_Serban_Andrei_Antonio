package Builder.builder2;

public class PacientBuilder implements AbstractPacient{
    private String name;
    private boolean patRabatil;
    private boolean micDejunInclus;
    private boolean papuciCamera;
    private boolean halatInterior;

    public PacientBuilder(String name) {
        this.name = name;
        this.patRabatil = false;
        this.micDejunInclus = false;
        this.papuciCamera = false;
        this.halatInterior = false;
    }

    @Override
    public Pacient build() {
        return new Pacient(name, patRabatil, micDejunInclus, halatInterior, papuciCamera);
    }

    @Override
    public AbstractPacient setPat(boolean hasPat) {
        this.patRabatil = hasPat;
        return this;
    }

    @Override
    public AbstractPacient setMicDejun(boolean hasMicDejun) {
        this.micDejunInclus = hasMicDejun;
        return this;
    }

    @Override
    public AbstractPacient setPapuci(boolean hasPapuci) {
        this.papuciCamera = hasPapuci;
        return this;
    }

    @Override
    public AbstractPacient setHalat(boolean hasHalat) {
        this.halatInterior = hasHalat;
        return this;
    }
}
