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
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    public SingletonEager() {
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
