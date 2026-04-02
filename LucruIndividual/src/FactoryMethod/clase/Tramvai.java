package FactoryMethod.clase;

public class Tramvai implements MijlocTransport{
    @Override
    public void pornesteInCursa(int traseu) {
        System.out.println("Tramvaiul porneste pe traseul " + traseu);
    }
}
