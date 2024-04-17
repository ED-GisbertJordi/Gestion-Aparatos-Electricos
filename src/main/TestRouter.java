package main;
import electrodomesticos.*;

/**
 * @author Jordi Gisbert y Jean Marc 
 */
public class TestRouter {

    public static void main(String[] args) {

        Television television = new Television("1234C", "SuperGuay", "LG", 45);
        Computador computadora = new Computador("1234E", 2048, 5000, 1024);
        Movil movil = new Movil("1234G", Movil.MemoriaInterna.Gb256, "Samsung", "Galaxy S21");

        System.out.println("----------Aparatos conectables creados ----------\n" + television + "\n" + computadora + "\n" + movil);

        System.out.println("\n----------Encender televisión, móvil y ordenador----------\n");

        television.activar();
        computadora.activar();
        movil.activar();

        System.out.println("\n-----------Conectar televisión a una regleta y encender la TV----------\n");
        Regleta regleta = new Regleta();

        if (regleta.enchufar(television)) {
            System.out.println("[Televisión] Aparato enchufado");
        } else {
            System.out.println("[Televisión] Aparato encendido");
        }

        television.activar();
        television.habilitarWifi();

        System.out.println("\n-----------Crear router y emparejar los tres aparatos. Televisión no podrá por no tener habilitado Wifi----------\n");
        Router internet = new Router("1234C");

        if (internet.emparejar(television)) {
            System.out.println("[Televisión] No se ha podido establecer la conexión (sin corriente, apagado o la interfaz wifi no está habilitada)");
        } else {
            System.out.println("[Televisión] Se ha establecido la conexión");
        }

        if (internet.emparejar(computadora)) {
            System.out.println("[Computador] Aparato emparejado con éxito");
        } else {
            System.out.println("[Computador] No se ha podido establecer la conexión");
        }

        if (internet.emparejar(movil)) {
            System.out.println("[Móvil] Aparato emparejado con éxito");
        } else {
            System.out.println("[Móvil] No se ha podido establecer la conexión");
        }

        System.out.println("\n----------Habilitar Wifi para televisión y emparejar con router----\n");
        if (!internet.emparejar(television)) {
            System.out.println("[Televisión] Aparato emparejado con éxito");
        } else {
            System.out.println("[Televisión] No se ha podido establecer la conexión (sin corriente, apagado o la interfaz wifi no está habilitada)");
        }

        System.out.println("\n----------Desemparejar móvil y mostrar los aparatos emparejados ----------\n");
        if (internet.desemparejar(movil)) {
            System.out.println("[Móvil]Aparato desemparejado con éxito");
        } else {
            System.out.println("[Móvil] No se ha podido desemparejar");
        }

        internet.listarDispositivosEmparejados();

        System.out.println("\n----------Desenchufar televisión y listar aparatos emparejados ----------\n");
        if (!regleta.desenchufar(television)) {
            System.out.println("[Televisión] Aparato desenchufado");
        } else {
            System.out.println("[Televisión] No se ha podido desenchufar");
        }

        internet.actualizarDispositivosEmparejados();
        internet.listarDispositivosEmparejados();
    }
}
