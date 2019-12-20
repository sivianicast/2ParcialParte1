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
public class Perro extends Animal{
    public Perro() {
    }
    public Perro(String sonido, int contador) {
        super(sonido, contador);
    }
    @Override
    public ArrayList<String> getListaAnimales() {
        return listaAnimales;
    }
    @Override
     public String hablar() {
     return "Perro " + contador + " " + this.sonido;
     } 
}
