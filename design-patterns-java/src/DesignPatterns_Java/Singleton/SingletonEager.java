package DesignPatterns_Java.Singleton;

/**
 * Singleton "apressado"
 *
 * @author JaqueBRSilva
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}