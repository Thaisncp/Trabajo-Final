/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.tda.cola;

import controlador.tda.lista.NodoLista;
import java.util.Date;
import modelo.Tickect;

/**
 *
 * @author ASUS
 */
public class ControllerTickect {
    private ColaServices listaTckects;

    public ControllerTickect(){
      this.listaTckects=new ColaServices(20);
    }
    
    public void guardar(String boleto){
        Tickect nroBoletos=new Tickect(boleto);
        listaTckects.queue(nroBoletos);
    }
    
    public String listar(){
    String lista = "";
        NodoLista<Tickect> aux = listaTckects.getCola().getCabecera();
        for (int i = 0; i < listaTckects.getCola().getSize(); i++) {
            lista += ("| "+aux.getDato().getNroTickect()+ "\t|\n");
            aux = aux.getSiguiente();
        }
        return lista;
    }   
    
    /**public static void main(String[] args) {
        ControllerTickect datoComando=new ControllerTickect();
        for (int i = 0; i < 10; i++) {
            //datoComando.renorvarCola();
            datoComando.guardar("boleto"+i);
        }
        datoComando.listar();
   }*/
}
