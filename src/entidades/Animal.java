/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author siviany
 */
public class Animal {
    protected String sonido;
    protected int contador;
    protected static ArrayList<String> listaAnimales = new ArrayList<>();
    public Animal() {
    }
    public Animal(String sonido, int contador) {
        this.sonido = sonido;
        this.contador = contador;
    }
    public ArrayList<String> getListaAnimales() {
        return listaAnimales;
    }
    public void setListaAnimales(String datos) {
        listaAnimales.add(datos);
    }   
    public String hablar() {
        return "";
    }
}
