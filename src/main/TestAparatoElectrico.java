package main;

import electrodomesticos.*;

/**
 * @author Jordi Gisbert y Jean Marc 
 */
public class TestAparatoElectrico {
//    // Array para almacenar los aparatos elÃ©ctricos
//    private AparatoElectrico[] aparatos;
//
//    public TestAparatoElectrico() {
//        aparatos = new AparatoElectrico[6];
//
//        // Crear dos aparatos de cada tipo
//        aparatos[0] = new Television(/* valores deseados */);
//        aparatos[1] = new Television(/* valores deseados */);
//        aparatos[2] = new Lavadora(/* valores deseados */);
//        aparatos[3] = new Lavadora(/* valores deseados */);
//        aparatos[4] = new Computador(/* valores deseados */);
//        aparatos[5] = new Computador(/* valores deseados */);
//
//        // Mostrar la lista de aparatos
//        verListado();
//    }
//
//    public void verListado() {
//        for (AparatoElectrico aparato : aparatos) {
//            System.out.println(aparato.toString());
//        }
//    }
//
//    public static void main(String[] args) {
//        new TestAparatoElectrico();
//    }
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

        System.out.println(aparatos[aparatos.length-1]);
    }
}