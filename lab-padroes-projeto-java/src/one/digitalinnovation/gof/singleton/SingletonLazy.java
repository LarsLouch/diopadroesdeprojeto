/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package one.digitalinnovation.gof.singleton;

/**
 *
 * @author Igor
 */
public class SingletonLazy {
    private static SingletonLazy instancia;

    public SingletonLazy() {
    }

    public static SingletonLazy getInstancia() {
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
    
    
}
