package ro.ase.cts.prototype.main;

import ro.ase.cts.prototype.clase.PrototypeRezervare;
import ro.ase.cts.prototype.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        PrototypeRezervare rezervare = new Rezervare("Dorel", "16:00", 4, "1234567890");
        PrototypeRezervare rezervareNoua = rezervare.copiaza();

        ((Rezervare)rezervareNoua).setOra("14:00");
        ((Rezervare)rezervareNoua).setNrPersoane(2);

        System.out.println(rezervare);
        System.out.println(rezervareNoua);
    }
}
