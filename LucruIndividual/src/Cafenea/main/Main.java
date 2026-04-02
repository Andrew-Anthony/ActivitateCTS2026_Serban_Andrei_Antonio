package Cafenea.main;

import Cafenea.factory2.BauturaFactory;
import Cafenea.clase.Bautura;
import Cafenea.factory.TipBautura;
import Cafenea.factory2.CafeaFactory;
import Cafenea.factory2.CeaiFactory;
import Cafenea.factory2.CiocolataCaldaFactory;

public class Main {
    public static void main(String[] args) {
        Bautura machiattoo = Cafenea.factory.BauturaFactory.creareBautura(TipBautura.Cafea,"MACHIATTO",300.0,32.5);
        Bautura ceaii = Cafenea.factory.BauturaFactory.creareBautura(TipBautura.Ceai,"ceai",400.0,20.5);
        Bautura ciocoo = Cafenea.factory.BauturaFactory.creareBautura(TipBautura.CiocolataCalda,"cioco",250.0,15.5);

        //factory method
//        BauturaFactoryInterface fabricaCafea = new CafeaFactory();

//        System.out.println(machiattoo);
//        System.out.println(ceaii);
//        System.out.println(ciocoo);
//
//        machiattoo.metodaDePreparare();
//        ceaii.metodaDePreparare();
//        ciocoo.metodaDePreparare();
//
//        PrototypeBauturaPresetata bauturaPresetata = new BauturaPresetata("ciocoloco", 2020.0, 178.25);
//
//        PrototypeBauturaPresetata bautura1 = bauturaPresetata.copiaza();
//        ((BauturaPresetata)bautura1).setName("cafelezi");
//        ((BauturaPresetata)bautura1).setPret(823491.5);
//        ((BauturaPresetata)bautura1).setVolum(11.1);
//
//        System.out.println(bautura1);
//        System.out.println(bauturaPresetata);
//
//        Bautura cafea = fabricaCafea.creareCafea(TipBautura.Cafea, "Latte", 350.0, 21.5);
//
//        System.out.println(cafea);

        //factory method 2
        BauturaFactory fabricaCafea = new CafeaFactory();
        Bautura cafea = fabricaCafea.creareBautura("cafea",100,100);

        BauturaFactory fabricaCiocolata = new CiocolataCaldaFactory();
        Bautura ciocolata = fabricaCiocolata.creareBautura("ciocolata",100,100);

        BauturaFactory fabricaCeai = new CeaiFactory();
        Bautura ceai = fabricaCeai.creareBautura("ceai",100,100);

        System.out.println(cafea);
        System.out.println(ciocolata);
        System.out.println(ceai);
    }
}
