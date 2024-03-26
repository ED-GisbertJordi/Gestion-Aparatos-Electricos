package electrodomesticos;

/**
 * @author Jordi Gisbert y Jean Marc 
 */
public abstract class Dispositivo extends AparatoElectrico{
    private boolean conectadoInternet = false;

    public Dispositivo(String numeroSerie) {
        super(numeroSerie);
    }
    
    
}
