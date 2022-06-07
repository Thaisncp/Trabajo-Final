package controlador.tda.cola;

import controlador.tda.cola.ColaServices;
import modelo.Valoracion;

/**
 *
 * @author Thais Cartuche
 */
public class ControllerValue {
    private ColaServices listaValue = new ColaServices(1);

    public ColaServices getListaValue() {
        return listaValue = new ColaServices(1);
    }

    public void setListaValue(ColaServices listaValue) {
        this.listaValue = listaValue;
    }

    public ColaServices guardar2(String value, String ratings){
       Valoracion Listavalo = new Valoracion(value, ratings);
       listaValue.queue(Listavalo);
       return listaValue;
    }
    
    public ColaServices actualizar(String value, String Ratings){
        if (listaValue.getSize() == 1) {
            listaValue = new ColaServices(1);
            guardar2(value, Ratings);
        }else{
            guardar2(value, Ratings);
        }
        return listaValue;
    }
}
