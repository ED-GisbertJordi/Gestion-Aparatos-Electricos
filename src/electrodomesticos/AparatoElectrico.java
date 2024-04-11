package electrodomesticos;

/**
 * @author Jordi Gisbert y Jean Marc 
 */
public abstract class AparatoElectrico implements Enchufable{
    protected String numeroSerie;
    protected boolean estaEncendido = false;
    protected boolean tieneCorreinteElectrica = false;

    public AparatoElectrico(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    
    private String getCorriente(){
        return (this.tieneCorreinteElectrica)?" (Con corriente eléctrica), ": " (Sin corriente eléctrica), ";
    }
    
    private String getEncendido(){
        return (this.estaEncendido)?"Está encendido, ": "No está encendido, ";
    }
    
    @Override
    public String toString() {
        return "["+getClass().getSimpleName()+"] Núm.Serie: "+this.numeroSerie+getCorriente()+getEncendido(); 
    }
    
    @Override
    public void darEnergia() {
        tieneCorreinteElectrica = true;
    }

    @Override
    public void quitarEnergia() {
        tieneCorreinteElectrica = false;
    }
    
    @Override
    public boolean equals(Object ob) {
        AparatoElectrico a = (AparatoElectrico) ob;
        return a.numeroSerie.equals(this.numeroSerie);
    }
    
    
}
