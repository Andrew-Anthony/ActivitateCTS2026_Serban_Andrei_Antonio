package Builder.builder2;

public class Pacient{
    private String name;
    private boolean patRabatil;
    private boolean micDejunInclus;
    private boolean papuciCamera;
    private boolean halatInterior;

    public Pacient(String name, boolean patRabatil, boolean micDejunInclus, boolean halatInterior, boolean papuciCamera) {
        this.name = name;
        this.patRabatil = patRabatil;
        this.micDejunInclus = micDejunInclus;
        this.halatInterior = halatInterior;
        this.papuciCamera = papuciCamera;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("name='").append(name).append('\'');
        sb.append(", patRabatil=").append(patRabatil);
        sb.append(", micDejunInclus=").append(micDejunInclus);
        sb.append(", papuciCamera=").append(papuciCamera);
        sb.append(", halatInterior=").append(halatInterior);
        sb.append('}');
        return sb.toString();
    }
}
