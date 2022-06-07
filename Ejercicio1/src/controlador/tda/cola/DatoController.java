package controlador.tda.cola;

import controlador.tda.lista.NodoLista;
import java.util.Date;
import modelo.Dato;

/**
 *
 * @author ASUS
 */
public class DatoController {
    private String[] fechaActual;
    int pos;//
    private ColaServices listaComandos;


    public DatoController(){
      this.listaComandos=new ColaServices(5);
      this.fechaActual=new String[5];
      this.pos=0;
    }
    
    public void guardar(String datoComando){
        Dato comando=new Dato(datoComando);
        String fecha = new Date().toString();
        fechaActual[pos]=fecha+" | ";
        listaComandos.queue(comando);
         pos++;
    }
    
    public void renorvarCola(){
        if(listaComandos.getSize()==5){
           listaComandos.dequeue(0);
        }
        if(pos == 5){
            pos = 0;
        }
    }
    
    public String listar(){
    String lista = "";
        NodoLista<Dato> aux = listaComandos.getCola().getCabecera();
        for (int i = 0; i < listaComandos.getCola().getSize(); i++) {
            lista += ("| "+aux.getDato().getComando()+ "\t| "+fechaActual[i]+"\n");
            aux = aux.getSiguiente();
        }
        return lista;
    }   
}

