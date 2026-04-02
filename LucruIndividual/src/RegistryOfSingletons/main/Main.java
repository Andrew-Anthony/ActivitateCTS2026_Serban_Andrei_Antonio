package RegistryOfSingletons.main;

import RegistryOfSingletons.clase.ContClient;

public class Main {
    public static void main(String[] args) {
        ContClient dorel = ContClient.getCont("dorel");
        ContClient.getCont("dorel");
        ContClient.getCont("marius");

    }
}
