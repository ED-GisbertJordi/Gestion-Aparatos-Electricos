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
    
    private String getCorriente(){
        return (this.tieneCorreinteElecctrica)?" (Con corriente eléctrica), ": " (Sin corriente eléctrica), ";
    }
    
    private String getEncendido(){
        return (this.estaEncendido)?"Está encendido, ": "No está encendido, ";
    }
    
    @Override
    public String toString() {
        return "["+getClass().getSimpleName()+"] Núm.Serie: "+this.numeroSerie+getCorriente()+getEncendido(); 
    }
}
