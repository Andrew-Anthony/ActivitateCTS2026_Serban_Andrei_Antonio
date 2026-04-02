package RegistryOfSingletons.clase;

import java.util.HashMap;

public class ContClient {
    private String nume;
    private static HashMap<String, ContClient> registru = new HashMap<>();

    private ContClient(String nume) {
        this.nume = nume;
    }

    public static ContClient getCont(String name) {
        if(!registru.containsKey(name)) {
            System.out.println("creeare cont nou " + name);
            ContClient client = new ContClient(name);
            registru.put(name, client);
        } else {
            System.out.println("cont deja existent " + name);
        }

        return registru.get(name);
    }

}
