/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ASUS
 */
public class Tickect {
    private String NroTickect;

    public Tickect(String boleto) {
        this.NroTickect = boleto;
    }
    /**
     * @return the NroTickect
     */
    public String getNroTickect() {
        return NroTickect;
    }

    /**
     * @param NroTickect the NroTickect to set
     */
    public void setNroTickect(String NroTickect) {
        this.NroTickect = NroTickect;
    } 
}
