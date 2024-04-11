package electrodomesticos;

/**
 * @author Jordi Gisbert y Jean Marc 
 */
public abstract class AparatoElectrico implements Enchufable{
    protected String numeroSerie;
    protected boolean estaEncendido = false;
    protected boolean tieneCorrienteElectrica = false;

    public AparatoElectrico(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    
    private String getCorriente(){
        return (this.tieneCorrienteElectrica)?" (Con corriente eléctrica), ": " (Sin corriente eléctrica), ";
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
        tieneCorrienteElectrica = true;
    }

    @Override
    public void quitarEnergia() {
        tieneCorrienteElectrica = false;
    }
    
    @Override
    public boolean equals(Object ob) {
        AparatoElectrico a = (AparatoElectrico) ob;
        return a.numeroSerie.equals(this.numeroSerie);
    }
    
    
}
