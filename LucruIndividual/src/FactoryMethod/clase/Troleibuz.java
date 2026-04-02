package FactoryMethod.clase;

public class Troleibuz implements MijlocTransport{
    @Override
    public void pornesteInCursa(int traseu) {
        System.out.println("Troleibuz-ul porneste pe traseul " + traseu);
    }
}
