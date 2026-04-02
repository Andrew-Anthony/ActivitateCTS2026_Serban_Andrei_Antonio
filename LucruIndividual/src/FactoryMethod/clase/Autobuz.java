package FactoryMethod.clase;

public class Autobuz implements MijlocTransport{
    @Override
    public void pornesteInCursa(int traseu) {
        System.out.println("Autobuzul porneste pe traseul " + traseu);
    }
}
