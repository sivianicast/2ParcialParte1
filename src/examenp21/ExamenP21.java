/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenp21;

import entidades.Animal;
import entidades.Gallo;
import entidades.Gato;
import entidades.Perro;
import entidades.Vaca;

/**
 *
 * @author siviany
 */
public class ExamenP21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int interador = 0, random = 0, contadoGato = 0, contadorPerro = 0, contadorGallo = 0, contadorVaca = 0;
        Animal animal = new Animal();
        do {
            for (int i = 0; i < 4; i++) {
                random = (int) Math.floor(Math.random()* 4);
                switch (random) {
                    case 0:
                        contadoGato += 1;
                        Animal gato = new Gato("MIAU", contadoGato);
                        gato.setListaAnimales(gato.hablar());
                        break;
                    case 1:
                        contadorPerro += 1;
                        Animal perro = new Perro("GUAU", contadorPerro);
                        perro.setListaAnimales(perro.hablar());
                        break;
                    case 2:
                        contadorGallo += 1;
                        Animal gallo = new Gallo("kikiriki", contadorGallo);
                        gallo.setListaAnimales(gallo.hablar());
                        break;
                    case 3:
                        contadorVaca += 1;
                        Animal vaca = new Vaca("MUU", contadorVaca);
                        vaca.setListaAnimales(vaca.hablar());
                        break;
                }
            }
            interador += 1;
            System.out.println("***Interacion " + interador+"***");
            System.out.println(animal.getListaAnimales().get(animal.getListaAnimales().size()-4));
            System.out.println(animal.getListaAnimales().get(animal.getListaAnimales().size()-3));
            System.out.println(animal.getListaAnimales().get(animal.getListaAnimales().size()-2));
            System.out.println(animal.getListaAnimales().get(animal.getListaAnimales().size()-1));
            System.out.println("---------------------------------------------------------------------------------------------------------\n");
        } while (true);
    }
}
