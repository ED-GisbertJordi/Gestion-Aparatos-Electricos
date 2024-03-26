package electrodomesticos;

/**
 * @author Jordi Gisbert y Jean Marc 
 */
public class AparatoElectrico {
    private int numeroSerie;
    private boolean encendido = false;
    private boolean tieneCorreinteElecctrica = false;
    private boolean conectadoInternet = false;
    private String marca;
    private String modelo;

    public AparatoElectrico(int numeroSerie, String marca, String modelo) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    
    @Override
    public String toString() {
        return "";
    }
    
    
}
