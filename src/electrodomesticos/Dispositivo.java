package electrodomesticos;

/**
 * @author Jordi Gisbert y Jean Marc
 */
public abstract class Dispositivo extends AparatoElectrico implements Conectable, Encendible {

    private boolean conectadoInternet = false;

    public Dispositivo(String numeroSerie) {
        super(numeroSerie);
    }

    private String getEstadoInternet() {
        return (this.conectadoInternet) ? "Conectado a Internet, " : "No conectado a Internet, ";
    }

    @Override
    public String toString() {
        return super.toString() + this.getEstadoInternet();
    }

    @Override
    public void activar() {
        estaEncendido = true;
        System.out.println("[" + getClass().getSimpleName() + "]  Aparato encendido");
    }

    @Override
    public void desactivar() {
        estaEncendido = false;
        System.out.println("[" + getClass().getSimpleName() + "]  Aparato apagado");
    }

    public boolean sePermiteConexion() {
        return false;
    }

    public void establecerConexion() {

    }

    public void quitaConexion() {

    }

}
