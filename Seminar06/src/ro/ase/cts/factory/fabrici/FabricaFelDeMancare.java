package ro.ase.cts.factory.fabrici;

import ro.ase.cts.factory.clase.FelDeMancare;
import ro.ase.cts.factory.enums.TipFelDeMancare;

public interface FabricaFelDeMancare {
    FelDeMancare creeareFelDeMancare(TipFelDeMancare tipFelDeMancare, int gramaj, double pret);
    FelDeMancare creeareFelDeMancare(TipFelDeMancare tipFelDeMancare, int gramaj, double pret, int nrCalorii);
}
