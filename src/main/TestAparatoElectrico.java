package main;

import electrodomesticos.*;

/**
 * @author Jordi Gisbert y Jean Marc 
 */
public class TestAparatoElectrico {
    public static void main(String[] args) {
        AparatoElectrico[] aparatos = {
            new Lavadora("1234A", "V1", "Bosch", 5),
            new Lavadora("1234B","F22", "Fagor", 12),
            new Television("1234C", "SuperGuay", "LG", 45),
            new Television("1234D", "MásChulaA", "Sony", 14),
            new Computador("1234E", 2048, 5000, 1024),
            new Computador("1234F", 1024, 10000, 2048),
            new Movil("1234G", Movil.MemoriaInterna.Gb256, "Samsung", "Galaxy S21"),
            new Movil("1234H", Movil.MemoriaInterna.Gb512, "Iphone", "21")
        };

        System.out.println("----------Listar aparatos enchufados----------");
        for (AparatoElectrico aparato : aparatos) {
            System.out.println(aparato);
        }
        
    }
}