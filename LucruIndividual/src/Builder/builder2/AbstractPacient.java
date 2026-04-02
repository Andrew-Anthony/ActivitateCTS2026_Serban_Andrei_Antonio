package Builder.builder2;

public interface AbstractPacient {
    Pacient build();
    AbstractPacient setPat(boolean hasPat);
    AbstractPacient setMicDejun(boolean hasMicDejun);
    AbstractPacient setPapuci(boolean hasPapuci);
    AbstractPacient setHalat(boolean hasHalat);
}
