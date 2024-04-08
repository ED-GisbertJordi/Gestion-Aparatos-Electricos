package electrodomesticos;

/**
 * @author Jordi Gisbert y Jean Marc 
 */
public class Lavadora extends Electrodomestico{
    private double carga = 7;

    public Lavadora(String numeroSerie, String marca, String modelo) {
        super(numeroSerie, marca, modelo);
    }
    
    public Lavadora(String numeroSerie, String marca, String modelo, double carga) {
        super(numeroSerie, marca, modelo);
        this.carga = carga;
    }

    @Override
    public String toString() {
        return super.toString()+", Carga: "+this.carga;
    }
    
    @Override
    public double obtenerPrecioVenta(){
        return (this.carga>=10)? super.obtenerPrecioVenta()+50: super.obtenerPrecioVenta();
    }

    @Override
    public void darEnergia() {

    }

    @Override
    public void quitarEnergia() {

    }

}