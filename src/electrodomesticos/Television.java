package electrodomesticos;

/**
 * @author Jordi Gisbert y Jean Marc 
 */
public class Television extends Electrodomestico{
    private boolean estaEncendida = false;
    private boolean estaWifiHabilitado = false;
    private boolean estaConectadaAInternet = false;
    private double resoluciónPulgadas = 20;

    
    public Television(int numeroSerie, String marca, String modelo, Color color, ClaseEnergia claseEnergia) {
        super(numeroSerie, marca, modelo, color, claseEnergia);
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