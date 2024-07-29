package DesignPatterns_Java.Strategy;

public class ComportamentoNormal implements Comportamento {

    @Override
    public void mover() {
        System.out.println("MOVENDO-SE NORMALMENTE...");
    }
}