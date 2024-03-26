package electrodomesticos;

/**
 * @author Jordi Gisbert y Jean Marc 
 */
public class Television extends Electrodomestico{
    private boolean estaWifiHabilitado = false;
    private boolean estaConectadaAInternet = false;
    private double resoluciónPulgadas = 20;

    
    public Television(String numeroSerie, String marca, String modelo) {
        super(numeroSerie, marca, modelo);
    }

    
    @Override
    public double obtenerPrecioVenta(){
        return (this.resoluciónPulgadas>=40)? super.obtenerPrecioVenta()*1.3: super.obtenerPrecioVenta();
    }
    
    @Override
    public String toString() {
        return "";
    }

}