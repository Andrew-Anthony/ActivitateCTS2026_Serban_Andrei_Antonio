package ro.ase.cts.vehicule;

public abstract class MijlocTransport {
    protected String marca;
    protected int linia;

    public MijlocTransport(String marca, int linia) {
        this.marca = marca;
        this.linia = linia;
    }

    public abstract void afisareDescriere();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Marca: ").append(marca).append("\n");
        sb.append("Linia: ").append(linia).append("\n");
        return sb.toString();
    }
}
