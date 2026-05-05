package ro.ase.cts.Observer.clase;

public interface ISpital {
    void trimiteMesaj(String mesaj);
    void aboneaza(Pacient pacient);
    void dezaboneaza(Pacient pacient);
}
