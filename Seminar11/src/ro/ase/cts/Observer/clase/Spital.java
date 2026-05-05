package ro.ase.cts.Observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital{
    private String nume;
    private List<Pacient> listaPacienti;

    public Spital(String nume) {
        this.nume = nume;
        this.listaPacienti = new ArrayList<>();
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(Pacient pacient : listaPacienti) {
            pacient.receptioneazaNotificare(mesaj + " de la spitalul " + this.nume);
        }
    }

    @Override
    public void aboneaza(Pacient pacient) {
        listaPacienti.add(pacient);
    }

    @Override
    public void dezaboneaza(Pacient pacient) {
        listaPacienti.remove(pacient);
    }

    public void notificaVirus() {
        trimiteMesaj("Exista un virus nou in oras!");
    }

    public void notificaEpidemie() {
        trimiteMesaj("Exista o epidemie in oras");
    }
}
