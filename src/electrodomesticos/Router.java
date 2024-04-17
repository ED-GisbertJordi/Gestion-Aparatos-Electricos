package electrodomesticos;

/**
 * @author Jordi Gisbert y Jean Marc
 */
public class Router extends AparatoElectrico implements Encendible {

    Conectable[] conexiones = new Conectable[5];

    public Router(String numeroSerie) {
        super(numeroSerie);
    }

    public boolean emparejar(Conectable aparato) {

        if (estaEncendido()) {
            if (aparatoExistente(aparato)) {
                return false;
            }
            for (int i = 0; i < conexiones.length; i++) {
                if (conexiones[i] == null) {
                    conexiones[i] = aparato;
                    conexiones[i].establecerConexion();
                    return true;
                }
            }
        } else {
            System.out.println(getClass().getSimpleName() + " no esta disponible (sin corriente o no encendido)");
        }
        return false;
    }

    private boolean aparatoExistente(Conectable aparato) {

        if (estaEncendido()) {
            for (Conectable a : conexiones) {
                if (a != null&&a.equals(aparato)) {
                    return true;
                }
            }
        } else {
            System.out.println(getClass().getSimpleName() + " no esta disponible (sin corriente o no encendido)");
        }
        return false;
    }

    public boolean desemparejar(Conectable aparato) {

        if (estaEncendido()) {
            for (int i = 0; i < conexiones.length; i++) {
                if (conexiones[i] != null&&aparato.equals(conexiones[i])) {
                    conexiones[i].quitaConexion();
                    conexiones[i] = null;
                    return true;
                }
            }
        } else {
            System.out.println(getClass().getSimpleName() + " no esta disponible (sin corriente o no encendido)");
        }
        return false;
    }

    public int obtenerNumeroDeDispositivosEmparejados() {

        if (estaEncendido()) {
            int contador = 0;
            for (Conectable conexion : conexiones) {
                if (conexion != null) {
                    contador++;
                }
            }
            return contador;
        } else {
            System.out.println(getClass().getSimpleName() + " no esta disponible (sin corriente o no encendido)");
            return -1;
        }

    }

    public void listarDispositivosEmparejados() {

        if (estaEncendido()) {
            for (Conectable conexion : conexiones) {
                if (conexion != null) {
                    System.out.println(conexion);
                }
            }
        } else {
            System.out.println(getClass().getSimpleName() + " no esta disponible (sin corriente o no encendido)");
        }

    }

    public void actualizarDispositivosEmparejados() {
        if (estaEncendido()) {
            for (Conectable conexion : conexiones) {
                if (conexion != null&&!conexion.sePermiteConexion()) {
                    this.desemparejar(conexion);
                }
            }
        } else {
            System.out.println(getClass().getSimpleName() + " no esta disponible (sin corriente o no encendido)");
        }

    }

    private boolean estaEncendido() {
        return tieneCorrienteElectrica && estaEncendido;
    }

    @Override
    public void activar() {
        if (tieneCorrienteElectrica) {
            estaEncendido = true;
            System.out.println("[" + getClass().getSimpleName() + "] Aparato encendido");
        } else {
            System.out.println("[" + getClass().getSimpleName() + "] no tiene corriente electrica");
        }
    }

    @Override
    public void desactivar() {
        estaEncendido = false;
    }

}