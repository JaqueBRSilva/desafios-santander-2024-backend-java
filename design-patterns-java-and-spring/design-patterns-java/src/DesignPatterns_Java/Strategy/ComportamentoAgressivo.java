package DesignPatterns_Java.Strategy;

public class ComportamentoAgressivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("MOVENDO-SE AGRESSIVAMENTE...");
    }
}
