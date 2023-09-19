package br.com.caio.singleton;

/**
 * Singleton preguiçosoooo
 *
 * @author caio farias
 */

public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
