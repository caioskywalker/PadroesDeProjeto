package br.com.caio.singleton;

/**
 * Singleton Apressado
 * @author caio farias
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }
    public static SingletonEager getInstance(){
        return instancia;
    }
}
