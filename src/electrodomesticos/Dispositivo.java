package electrodomesticos;

/**
 * @author Jordi Gisbert y Jean Marc 
 */
public abstract class Dispositivo extends AparatoElectrico{
    private boolean conectadoInternet = false;

    public Dispositivo(String numeroSerie) {
        super(numeroSerie);
    }
    
    private String getEstadoInternet(){
        return (this.conectadoInternet)?"Conectado a Internet, ": "No conectado a Internet, ";
    }
    
    @Override
    public String toString() {
        return super.toString()+this.getEstadoInternet(); 
    }
    
}
