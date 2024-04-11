/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import electrodomesticos.Computador;
import electrodomesticos.Lavadora;
import electrodomesticos.Movil;
import electrodomesticos.Regleta;
import electrodomesticos.Television;

/**
 *
 * @author jeanm
 */
public class TestRegleta {

    public static void main(String[] args) {
        Lavadora  lavadora = new Lavadora("1234A", "V1", "Bosch", 5);
        Television television = new Television("1234C", "SuperGuay", "LG", 45);
        Computador computadora = new Computador("1234E", 2048, 5000, 1024);
        Movil movil = new Movil("1234G", Movil.MemoriaInterna.Gb256, "Samsung", "Galaxy S21");
        
        Regleta r = new Regleta();
        r.enchufar(lavadora);
        r.enchufar(television);
        r.enchufar(computadora);
        r.enchufar(movil);

        r.listarConectados();
        
        System.out.println(  r.obtenetNumeroTomasLibres());
       
        r.desenchufar(lavadora);
        r.desenchufar(television);
        
        r.listarConectados();
        
        Regleta a = new Regleta();
         a.enchufar(new Lavadora("1234A", "V1", "Bosch", 5));
    }
}
