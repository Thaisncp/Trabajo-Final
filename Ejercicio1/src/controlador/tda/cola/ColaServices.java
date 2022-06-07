/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.tda.cola;

import controlador.tda.lista.exception.EstructuraDataVaciaExpetion;
import controlador.tda.lista.exception.PosicionException;
import controlador.tda.lista.exception.TopeException;

/**
 *
 * @author sebastian
 */
public class ColaServices <E> {
    private Cola<E> cola;

    public ColaServices(Integer tope) {
       cola = new Cola<>(tope);
    }
    public boolean queue(E dato) {
        try {
            getCola().queue(dato);
            return true;
        } catch (TopeException | PosicionException e) {
            System.out.println("Error "+e);
        }
        return false;
    }
    
    public E dequeue(Integer pos) {
        try {
            return getCola().dequeue(pos);
            
        } catch (EstructuraDataVaciaExpetion | PosicionException e) {
            System.out.println("Error "+e);
        }
        return null;
    }
    
    public Integer getSize() {
        return getCola().getSize();
    }
    
    public Integer getTope() {
        return getCola().getTope();
    }

    /**
     * @return the cola
     */
    public Cola<E> getCola() {
        return cola;
    }
    
}
