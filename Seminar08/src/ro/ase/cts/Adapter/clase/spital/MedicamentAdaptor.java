package ro.ase.cts.Adapter.clase.spital;

import ro.ase.cts.Adapter.clase.farmacie.Medicament;

public class MedicamentAdaptor extends Medicament {
    private ro.ase.cts.Adapter.clase.spital.Medicament medicamentSpital;

    public MedicamentAdaptor(ro.ase.cts.Adapter.clase.spital.Medicament medicamentSpital) {
        super(medicamentSpital.getNume());
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
