package Cafenea.clase;

public class CiocolataCalda extends BauturaAbstracta{
    private String culoareCiocolata;

    public CiocolataCalda(String name, double volum, double pret) {
        super(name, volum, pret);
    }

    public CiocolataCalda(String name, double volum, double pret, String culoareCiocolata) {
        super(name, volum, pret);
        this.culoareCiocolata = culoareCiocolata;
    }

    @Override
    public void metodaDePreparare() {
        System.out.println("se pune plic in lapte cald shshshshshhsh");
    }
}
