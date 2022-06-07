package controlador.tda.cola;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import controlador.tda.lista.NodoLista;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modelo.DescripcionPelicula;
import vista.tabla.TablaLibros;

/**
 *
 * @author ASUS
 */
public class ControllerDescription {
    private ColaServices listaPeliculas = new ColaServices(50);
    

    public ControllerDescription(ColaServices listaPeliculas) {
        this.listaPeliculas = new ColaServices(20);
    }

    public ControllerDescription() {
    }
    
    public ColaServices Guardar(ColaServices colita, String titulo, String year, String clasi, String fecha, String duracion, String genero, String direc, String escri, String actor, String plot, String idioma, String pais, String nomina, String poster, String meta, String imbrati, String imbVot, String ID, String Type, String dvd, String box, String produc, String web, String respon){
        DescripcionPelicula listaPelicula = new DescripcionPelicula(colita, titulo, year, clasi, fecha, duracion, genero, direc, escri, actor, plot, idioma, pais, nomina, poster, meta, imbrati, imbVot, ID, Type, dvd, box, produc, web, respon);
        if (listaPeliculas.queue(listaPelicula)) {
            JOptionPane.showMessageDialog(null, "Guardado exitoso UwU");
        }else{
            JOptionPane.showMessageDialog(null, "No se guardo 7u7");
        }
        return listaPeliculas;
    }
    
    public ColaServices Json() {
        try {
            Gson json = new GsonBuilder().setPrettyPrinting().create();
            String jsonString = json.toJson(listaPeliculas);
            FileWriter jsonGenerado = new FileWriter("Peliculas.json");
            jsonGenerado.write(jsonString);
            jsonGenerado.flush();
            JOptionPane.showMessageDialog(null, "ARCHIVO GENERADO CON EXITO <3");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL GENERAR ARCHIVO :c");
        }
        return listaPeliculas;
    }
    
    public void cargarTabla(JTable tablita) {
        TablaLibros miTablita = new TablaLibros();
        miTablita.setLista(listaPeliculas);
        tablita.setModel(miTablita);
        tablita.updateUI();
    }
}
