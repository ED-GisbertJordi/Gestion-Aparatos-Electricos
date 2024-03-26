package electrodomesticos;

/**
 * @author Jordi Gisbert y Jean Marc 
 */
public abstract class AparatoElectrico {
    protected String numeroSerie;
    protected boolean estaEncendido = false;
    protected boolean tieneCorreinteElecctrica = false;

    public AparatoElectrico(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
}
