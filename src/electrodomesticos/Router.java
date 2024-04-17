package electrodomesticos;

/**
 * @author Jordi Gisbert y Jean Marc
 */
public class Router extends AparatoElectrico {
    Conectable[] conexiones = new Conectable[5];

    public Router(String numeroSerie) {
        super(numeroSerie);
    }

    public boolean emparejar(Conectable aparato) {
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
        return false;
    }

    private boolean aparatoExistente(Conectable aparato) {
        for (Conectable a : conexiones) {
            if (a != null&&a.equals(aparato)) {
                return true;
            }
        }
        return false;
    }

    public boolean desemparejar(Conectable aparato) {
        for (int i = 0; i < conexiones.length; i++) {
            if (conexiones[i] != null&&aparato.equals(conexiones[i])) {
                conexiones[i].quitaConexion();
                conexiones[i] = null;
                return true;
            }
        }
        return false;
    }

    public int obtenerNumeroDeDispositivosEmparejados() {
        int contador = 0;
        for (Conectable conexion : conexiones) {
            if (conexion != null) {
                contador++;
            }
        }
        return contador;
    }

    public void listarDispositivosEmparejados() {
        for (Conectable conexion : conexiones) {
            if (conexion != null) {
                System.out.println(conexion);
            }
        }
    }

    public void actualizarDispositivosEmparejados() {
        for (Conectable conexion : conexiones) {
            if (conexion != null && !conexion.sePermiteConexion()) {
                this.desemparejar(conexion);
            }
        }
    }

}
