package ro.ase.cts.factory.fabrici;

import ro.ase.cts.factory.clase.FelDeMancare;
import ro.ase.cts.factory.clase.SupaDeLegume;
import ro.ase.cts.factory.clase.SupaDeVita;
import ro.ase.cts.factory.enums.TipFelDeMancare;
import ro.ase.cts.factory.enums.TipSupa;

public class FabricaSupa implements  FabricaFelDeMancare{
    @Override
    public FelDeMancare creeareFelDeMancare(TipFelDeMancare tipFelDeMancare, int gramaj, double pret) {
        return switch (tipFelDeMancare) {
            case TipSupa.SupaDeLegume -> new SupaDeLegume(gramaj, pret);
            case TipSupa.SupaDeVita -> new SupaDeVita(gramaj, pret);
            default -> null;
        };
    }

    @Override
    public FelDeMancare creeareFelDeMancare(TipFelDeMancare tipFelDeMancare, int gramaj, double pret, int nrCalorii) {
        return creeareFelDeMancare(tipFelDeMancare,gramaj,pret);
    }
}
