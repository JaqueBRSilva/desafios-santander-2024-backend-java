package DesignPatterns_Java.Strategy;

public class ComportamentoDefensivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("MOVENDO-SE DEFENSIVAMENTE...");
    }
}
