/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.tabla;

import controlador.tda.cola.ColaServices;
import controlador.tda.lista.ListaEnlazadaServices;
import javax.swing.event.EventListenerList;
import javax.swing.table.AbstractTableModel;
import modelo.DescripcionPelicula;

/**
 *
 * @author sebastian
 */
public class TablaLibros extends AbstractTableModel {
    private ColaServices lista = new ColaServices(50);

    public ColaServices getLista() {
        return lista;
    }

    public void setLista(ColaServices lista) {
        this.lista = lista;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public void setListenerList(EventListenerList listenerList) {
        this.listenerList = listenerList;
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public int getRowCount() {
        return lista.getSize();
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0: return "Titulo";
            case 1: return "Año";
            case 2: return "Duracion";
            case 3: return "Genero";
            case 4: return "Director";
            case 5: return "Protagonista";
            case 6: return "Idioma";
            default: return null;
        }
    }

    @Override
    public Object getValueAt(int arg0, int arg1) {
        DescripcionPelicula peli = (DescripcionPelicula) lista.obtenerDato(arg0);
        switch(arg1) {
            case 0: return peli.getTitle();
            case 1: return peli.getYear();
            case 2: return peli.getDuracion();
            case 3: return peli.getGenero();
            case 4: return peli.getDirector();
            case 5: return peli.getActorPrincipal();
            case 6: return peli.getIdioma();
            default: return null;
        }
    }
    
    
    
    
}
