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
public class Gato extends Animal { 
    public Gato() {
    }
    public Gato(String sonido, int contador) {
        super(sonido, contador);
    }
    @Override
    public ArrayList<String> getListaAnimales() {
        return listaAnimales;
    }
    @Override
    public void setListaAnimales(String datos) {
        listaAnimales.add(datos);
    }
    @Override
    public String hablar() {
        return "Gato " + contador + " " + this.sonido;
    }
}
