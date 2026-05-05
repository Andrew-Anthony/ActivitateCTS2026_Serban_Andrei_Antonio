package ro.ase.cts.Command.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> listaComenzi = new ArrayList<>();

    public void inregistreazaComanda(Command command) {
        listaComenzi.add(command);
    }

    public void executaFISA() {
        if(!listaComenzi.isEmpty()) {
            listaComenzi.getFirst().executa();
            listaComenzi.removeFirst();
        }
    }
}
