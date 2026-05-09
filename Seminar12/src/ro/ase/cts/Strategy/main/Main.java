package ro.ase.cts.Strategy.main;

import ro.ase.cts.Strategy.clase.ProbaOrala;
import ro.ase.cts.Strategy.clase.ProbaScrisa;
import ro.ase.cts.Strategy.clase.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("dorel");
        student.examinare();

        student.setModSustinere(new ProbaScrisa());
        student.examinare();

        student.setModSustinere(new ProbaOrala());
        student.examinare();
    }
}
