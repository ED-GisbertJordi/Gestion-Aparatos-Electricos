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

    /*
    private double obtenerPrecioVenta(){
        
        
        
        
        return super.obtenerPrecioVenta()+();
    }
    */

}