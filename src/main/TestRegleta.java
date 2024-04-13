/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import electrodomesticos.*;

/**
 *
 * @author Jordi Gisbert y Jean Marc 
 */
public class TestRegleta {

    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora("1234A", "V1", "Bosch", 5);
        Television television = new Television("1234C", "SuperGuay", "LG", 45);
        Computador computadora = new Computador("1234E", 2048, 5000, 1024);
        Movil movil = new Movil("1234G", Movil.MemoriaInterna.Gb256, "Samsung", "Galaxy S21");

        Regleta regleta = new Regleta();
        System.out.println(regleta.obtenerNumeroTomasLibres());

        System.out.print("----------Crear regleta y conectar los cuatro aparatos----------\n");

        if (regleta.enchufar(lavadora)) {
            System.out.println("[Lavadora] Aparato enchufado");
        } else {
            System.out.println("[Lavadora] El aparato no está enchufado a la regleta");
        }

        if (regleta.enchufar(television)) {
            System.out.println("[Television] Aparato enchufado");
        } else {
            System.out.println("[Television] El aparato no está enchufado a la regleta");
        }

        if (regleta.enchufar(computadora)) {
            System.out.println("[Computadora] Aparato enchufado");
        } else {
            System.out.println("[Computadora] El aparato no está enchufado a la regleta");
        }

        if (regleta.enchufar(movil)) {
            System.out.println("[Movil] Aparato enchufado");
        } else {
            System.out.println("[Movil] El aparato no está enchufado a la regleta");
        }

        regleta.listarConectados();

        System.out.println("Numero de tomas libres: " + regleta.obtenerNumeroTomasLibres());

        System.out.println("----------Desconectar lavadora y televisión----------");
        if (regleta.desenchufar(lavadora)) {
            System.out.println("[Lavadora] Aparato desenchufado");
        } else {
            System.out.println("[Lavadora] No se ha podido desenchufar");
        }

        if (regleta.desenchufar(television)) {
            System.out.println("[Televisión] Aparato desenchufado");
        } else {
            System.out.println("[Televisión] No se ha podido desenchufar");
        }
        regleta.listarConectados();

        System.out.println("----------Crear móvil con número de serie 1234G ----------");
        System.out.println(movil);

        System.out.println("----------Enchufar móvil anterior y obtener mensaje de error----------");

        if (!regleta.enchufar(movil)) {
            System.out.println("[Móvil] El aparato ya está enchufado a la regleta");

        }
        System.out.println("----------Desconectar aparato no enchufado (la lavadora)----------");

        if (!regleta.desenchufar(lavadora)) {
            System.out.println("[Lavadora] El aparato no está enchufado a la regleta");

        }

    }
}
