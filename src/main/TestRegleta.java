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
        Lavadora lavadora = new Lavadora("1234A", "V1", "Bosch", 5);
        Television television = new Television("1234C", "SuperGuay", "LG", 45);
        Computador computadora = new Computador("1234E", 2048, 5000, 1024);
        Movil movil = new Movil("1234G", Movil.MemoriaInterna.Gb256, "Samsung", "Galaxy S21");

        Regleta r = new Regleta();
        System.out.println(r.obtenerNumeroTomasLibres());

        System.out.print("----------Crear regleta y conectar los cuatro aparatos----------\n");
        
        if (r.enchufar(lavadora)) {
            System.out.println("[Lavadora] Aparato enchufado");
        } else {
            System.out.println("[Lavadora] El aparato no está enchufado a la regleta");
        }

        if (r.enchufar(television)) {
            System.out.println("[Television] Aparato enchufado");
        } else {
            System.out.println("[Television] El aparato no está enchufado a la regleta");
        }

        if (r.enchufar(computadora)) {
            System.out.println("[Computadora] Aparato enchufado");
        } else {
            System.out.println("[Computadora] El aparato no está enchufado a la regleta");
        }

        if (r.enchufar(movil)) {
            System.out.println("[Movil] Aparato enchufado");
        } else {
            System.out.println("[Movil] El aparato no está enchufado a la regleta");
        }

        r.listarConectados();

        System.out.println("Numero de tomas libres: " + r.obtenerNumeroTomasLibres());

        System.out.println("----------Desconectar lavadora y televisión----------");
        if (r.desenchufar(lavadora)) {
            System.out.println("[Lavadora] Aparato desenchufado");
        } else {
            System.out.println("[Lavadora] No se ha podido desenchufar");
        }

        if (r.desenchufar(television)) {
            System.out.println("[Televisión] Aparato desenchufado");
        } else {
            System.out.println("[Televisión] No se ha podido desenchufar");
        }

    }
}
