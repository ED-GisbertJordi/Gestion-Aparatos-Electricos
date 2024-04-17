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

        System.out.println("\n----------Aparatos conectables creados ----------\n");
        System.out.println(l1 + "\n" + l2 + "\n" + t1 + "\n" + t2 + "\n" + c1 + "\n" + c2 + "\n" + m1 + "\n" + m2);

        System.out.println("\n----------Encender televisión, móvil y ordenador----------\n");
        t1.activar();
        m1.activar();
        c1.activar();

        System.out.println("\n-----------Conectar televisión a una regleta y encender la TV----------\n");

        if (regleta.enchufar(t2)) {
            System.out.println("[Televisión] Aparato enchufado");
        } else {
            System.out.println("[Televisión] No se ha podido enchufar");
        }
        t2.activar();

        System.out.println("\n-----------Crear router y emparejar los tres aparatos. Televisión no podrá por no tener habilitado Wifi----------\n");
        t1.deshabilitarWifi();

        internet.emparejar(t1);

        internet.emparejar(m2);

        internet.emparejar(c2);

        System.out.println("\n----------Habilitar Wifi para televisión y emparejar con router----------\n");
        t1.habilitarWifi();

        internet.emparejar(t1);

        System.out.println("\n----------Desemparejar móvil y mostrar los aparatos emparejados----------\n");
        internet.desemparejar(m2);
        internet.listarDispositivosEmparejados();

        System.out.println("\n----------Desenchufar televisión y listar aparatos emparejados----------\n");
        t1.activar();
        internet.listarDispositivosEmparejados();
        internet.listarDispositivosEmparejados();

        System.out.println("\n----------Aparatos conectables creados----------\n");
        System.out.println(l1 + "\n" + l2 + "\n" + t1 + "\n" + t2 + "\n" + c1 + "\n" + c2 + "\n" + m1 + "\n" + m2);

        System.out.println("\n----------Encender televisión, móvil y ordenador----------\n");
        t1.activar();
        m1.activar();
        c1.activar();

        System.out.println("\n-----------Conectar televisión a una regleta y encender la TV----------\n");
        if (regleta.enchufar(t1)) {
            System.out.println("[Televisión] Aparato enchufado");
        } else {
            System.out.println("[Televisión] No se ha podido enchufar");
        }
        t1.activar();
        
        System.out.println("\n-----------Crear router, conectarlo a la regleta y encenderlo----------------\n");
        if (regleta.enchufar(internet)) {
            System.out.println("[Router] Aparato enchufado");
        } else {
            System.out.println("[Router] No se ha podido enchufar");
        }
        internet.activar();
   
        System.out.println("\n-----------Emparejar los tres aparatos. Televisión no podrá por no tener habilitado Wifi----------\n");
        if (internet.emparejar(t2)) {
            System.out.println("[Televisión] No se ha podido establecer la conexión (sin corriente, apagado o la interfaz wifi no está habilitada)");
        } else {
            System.out.println("[Televisión] Conexion establecida");
        }

        if (internet.emparejar(c1)) {
            System.out.println("[Computador] Aparato emparejado con éxito");
        } else {
            System.out.println("[Computador] Aparato no emparejado");
        }
        if (internet.emparejar(m1)) {
            System.out.println("[Móvil] Aparato emparejado con éxito");
        } else {
            System.out.println("[Móvil] Aparato no emparejado");
        }

        System.out.println("\n----------Habilitar Wifi para televisión y emparejar con router----------\n");
        t2.habilitarWifi();
        if (!internet.emparejar(t2)) {
            System.out.println("[Televisión] Aparato emparejado con éxito");
        } else {
            System.out.println("[Televisión] Aparato no emparejado");
        }

        System.out.println("\n----------Desemparejar móvil y mostrar los aparatos emparejados----------\n");
        if (internet.desemparejar(m1)) {
            System.out.println("[Móvil] Aparato desemparejado con éxito");
        } else {
            System.out.println("[Móvil] No se ha podido desemparejar");
        }
        internet.listarDispositivosEmparejados();

        System.out.println("\n----------Desenchufar televisión y listar aparatos emparejados----------\n");
        if (regleta.desenchufar(t2)) {
            System.out.println("[Televisión] Aparato desenchufado");
        } else {
            System.out.println("[Televisión] Aparato no desenchufado");
        }
        internet.actualizarDispositivosEmparejados();
        internet.listarDispositivosEmparejados();

    }
    
}