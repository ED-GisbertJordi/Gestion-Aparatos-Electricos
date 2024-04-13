package main;

import electrodomesticos.*;

/**
 * @author Jordi Gisbert y Jean Marc
 */
public class TestRouter {
    
    public static void main(String[] args) {

        Lavadora l1 = new Lavadora("1234A", "V1", "Bosch", 5);
        Lavadora l2 = new Lavadora("1234B", "F22", "Fagor", 12);
        Television t1 = new Television("1234C", "SuperGuay", "LG", 45);
        Television t2 = new Television("1234D", "MásChulaA", "Sony", 14);
        Computador c1 = new Computador("1234E", 2048, 5000, 1024);
        Computador c2 = new Computador("1234F", 1024, 10000, 2048);
        Movil m1 = new Movil("1234G", Movil.MemoriaInterna.Gb256, "Samsung", "Galaxy S21");
        Movil m2 = new Movil("1234H", Movil.MemoriaInterna.Gb512, "Iphone", "21");

        Regleta regleta = new Regleta();
        Router internet = new Router("1233C");

        System.out.println("----------Aparatos conectables creados ----------");
        System.out.println(l1 + "\n" + l2 + "\n" + t1 + "\n" + t2 + "\n" + c1 + "\n" + c2 + "\n" + m1 + "\n" + m2);

        System.out.println("----------Encender televisión, móvil y ordenador----------");
        t1.activar();
        m1.activar();
        c1.activar();

        System.out.println("-----------Conectar televisión a una regleta y encender la TV----------");

        if (regleta.enchufar(t2)) {
            System.out.println("[Televisión] Aparato enchufado");
        } else {
            System.out.println("[Televisión] No se ha podido enchufar");
        }
        t2.activar();

        System.out.println("-----------Crear router y emparejar los tres aparatos. Televisión no podrá por no tener habilitado Wifi----------");
        t1.deshabilitarWifi();

        if (internet.emparejar(t1)) {
            System.out.println("El router no está disponible (sin corriente o no encendido)");
        } else {
            System.out.println("El router está disponible");
        }

        if (internet.emparejar(m2)) {
            System.out.println("El router no está disponible (sin corriente o no encendido)");
        } else {
            System.out.println("El router está disponible");
        }

        if (internet.emparejar(c2)) {
            System.out.println("El router no está disponible (sin corriente o no encendido)");
        } else {
            System.out.println("El router está disponible");
        }

        System.out.println("----------Habilitar Wifi para televisión y emparejar con router----------");
        t1.habilitarWifi();

       internet.emparejar(t1);
        
        System.out.println("----------Desemparejar móvil y mostrar los aparatos emparejados----------");
        internet.desemparejar(m2);
        internet.listarDispositivosEmparejados();
         
    }
    
    
}