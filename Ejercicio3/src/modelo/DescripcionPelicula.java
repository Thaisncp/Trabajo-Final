package modelo;

import controlador.tda.cola.ColaServices;

/**
 *
 * @author Thais Cartuche
 */
public class DescripcionPelicula {
    private ColaServices listaValue;
    private String title;
    private String year;
    private String clasificacionEdad;
    private String estreno;
    private String duracion;
    private String genero;
    private String director;
    private String escritor;
    private String actorPrincipal;
    private String sinopsis;
    private String idioma;
    private String Pais;
    private String nominaciones;
    private String poster;
    private String metasCore;
    private String imbdRating;
    private String imbdVotes;
    private String imbdID;
    private String type;
    private String DVD;
    private String boxOffice;
    private String produccion;
    private String wedSite;
    private String response;

    public DescripcionPelicula(ColaServices listaValue, String title, String year, String clasificacionEdad, String estreno, String duracion, String genero, String director, String escritor, String actorPrincipal, String sinopsis, String idioma, String Pais, String nominaciones, String poster, String metasCore, String imbdRating, String imbdVotes, String imbdID, String type, String DVD, String boxOffice, String produccion, String wedSite, String response) {
        this.listaValue = listaValue;
        this.title = title;
        this.year = year;
        this.clasificacionEdad = clasificacionEdad;
        this.estreno = estreno;
        this.duracion = duracion;
        this.genero = genero;
        this.director = director;
        this.escritor = escritor;
        this.actorPrincipal = actorPrincipal;
        this.sinopsis = sinopsis;
        this.idioma = idioma;
        this.Pais = Pais;
        this.nominaciones = nominaciones;
        this.poster = poster;
        this.metasCore = metasCore;
        this.imbdRating = imbdRating;
        this.imbdVotes = imbdVotes;
        this.imbdID = imbdID;
        this.type = type;
        this.DVD = DVD;
        this.boxOffice = boxOffice;
        this.produccion = produccion;
        this.wedSite = wedSite;
        this.response = response;
    }

    public ColaServices getListaValue() {
        return listaValue;
    }

    public void setListaValue(ColaServices listaValue) {
        this.listaValue = listaValue;
    }
       
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getClasificacionEdad() {
        return clasificacionEdad;
    }

    public void setClasificacionEdad(String clasificacionEdad) {
        this.clasificacionEdad = clasificacionEdad;
    }

    public String getEstreno() {
        return estreno;
    }

    public void setEstreno(String estreno) {
        this.estreno = estreno;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getNominaciones() {
        return nominaciones;
    }

    public void setNominaciones(String nominaciones) {
        this.nominaciones = nominaciones;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getMetasCore() {
        return metasCore;
    }

    public void setMetasCore(String metasCore) {
        this.metasCore = metasCore;
    }

    public String getImbdRating() {
        return imbdRating;
    }

    public void setImbdRating(String imbdRating) {
        this.imbdRating = imbdRating;
    }

    public String getImbdVotes() {
        return imbdVotes;
    }

    public void setImbdVotes(String imbdVotes) {
        this.imbdVotes = imbdVotes;
    }

    public String getImbdID() {
        return imbdID;
    }

    public void setImbdID(String imbdID) {
        this.imbdID = imbdID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDVD() {
        return DVD;
    }

    public void setDVD(String DVD) {
        this.DVD = DVD;
    }

    public String getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(String boxOffice) {
        this.boxOffice = boxOffice;
    }

    public String getProduccion() {
        return produccion;
    }

    public void setProduccion(String produccion) {
        this.produccion = produccion;
    }

    public String getWedSite() {
        return wedSite;
    }

    public void setWedSite(String wedSite) {
        this.wedSite = wedSite;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
