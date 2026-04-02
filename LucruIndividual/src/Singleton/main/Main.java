package Singleton.main;

import Singleton.classes.ConexiuneMinisterThreadSafe;


public class Main {
    public static void main(String[] args) {
        ConexiuneMinisterThreadSafe conexiuneMinister = ConexiuneMinisterThreadSafe.getInstance("amogus.ro/crazy", true);
        ConexiuneMinisterThreadSafe conexiuneMinister2 = ConexiuneMinisterThreadSafe.getInstance("amogus.com/sus", false);

        System.out.println(conexiuneMinister.getEndpoint());
        System.out.println(conexiuneMinister2.getEndpoint());
        System.out.println(conexiuneMinister2.isActive());

    }
}
