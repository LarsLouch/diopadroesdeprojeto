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
public class SingletonLazyHolder {
    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    public SingletonLazyHolder() {
    }
    
    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
    
}
