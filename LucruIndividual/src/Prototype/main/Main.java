package Prototype.main;

import Prototype.clase.PrototypeReteta;
import Prototype.clase.Reteta;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> solutii = Arrays.asList("ingredient1", "ingredient2");
        List<String> solutii2 = Arrays.asList("ingredient2", "ingredient3", "ingredient4");
        PrototypeReteta reteta = new Reteta("Paracetamol", solutii);
        System.out.println(reteta);

        PrototypeReteta retetaCopy = null;
//        retetaCopy = reteta.shallowCopy();\
        retetaCopy = reteta.deepCopy();
        ((Reteta)retetaCopy).setNume("parasinus");
        ((Reteta)retetaCopy).getSolutii().set(0, "bomb");

        System.out.println(reteta);
        System.out.println(retetaCopy);
    }
}
