package ro.ase.cts;

import ro.ase.cts.animale.Lion;
import ro.ase.cts.animale.Otter;
import ro.ase.cts.animale.Zebra;
import ro.ase.cts.zoo.Zoo;
import ro.ase.cts.zoo.ZooKeeper;

public class Seminar01 {
    public static void main(String[] args) {
        ZooKeeper keeper = new ZooKeeper("popescu");
        Zoo zoo = new Zoo("Baneasa",keeper);
        zoo.addAnimal(new Lion("Leu1",2,"carne",20));
        zoo.addAnimal(new Lion("Leu2",3,"carne",30));
        zoo.addAnimal(new Zebra("Zebra1",2,"iarba",200));
        zoo.addAnimal(new Zebra("Zebra2",3,"iarba",210));
        zoo.addAnimal(new Otter("Otter1",2,"mancare","lac"));
        zoo.feedAllAnimals();

    }
}
