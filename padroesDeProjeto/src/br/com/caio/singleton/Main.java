package br.com.caio.singleton;

import br.com.caio.facade.Facade;
import br.com.caio.strategy.*;

public class Main {
    public static void main(String[] args) {

        //Singleton....

        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazyHolder);

        SingletonEager singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);

        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy);

        // Strategy......

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

        // Facade......

        Facade facade = new Facade();
        facade.migrarCliente("Caio", 22792328L);







    }
}