package ro.ase.cts.Adapter.main;

import ro.ase.cts.Adapter.clase.spital.Medicament;
import ro.ase.cts.Adapter.clase.spital.MedicamentAdaptor;

public class Main {
    public static void main(String[] args) {
        Medicament medicamentSpital = new Medicament("Nurofen reteta", 10);
        ro.ase.cts.Adapter.clase.farmacie.Medicament medicamentFarmacie = new ro.ase.cts.Adapter.clase.farmacie.Medicament("Algocalmin");

        medicamentSpital.achizitioneazaMedicament();
        medicamentFarmacie.cumparaMedicament();
        procuraMedicament(medicamentFarmacie);
//        procuraMedicament(medicamentSpital);

        MedicamentAdaptor medicamentAdaptor = new MedicamentAdaptor(medicamentSpital);
        procuraMedicament(medicamentAdaptor);
    }

    private static void procuraMedicament(ro.ase.cts.Adapter.clase.farmacie.Medicament medicament) {
        medicament.cumparaMedicament();
    }
}
