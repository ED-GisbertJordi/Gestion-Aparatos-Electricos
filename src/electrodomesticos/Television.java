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
    
    public Television(String numeroSerie, String marca, String modelo, double resoluciónPulgadas) {
        super(numeroSerie, marca, modelo);
        this.resoluciónPulgadas = resoluciónPulgadas;
    }

    private String getEstadoWifi(){
        return (this.estaWifiHabilitado)?"Wifi habilitado, ": "Wifi deshabilitado, ";
    }
    
    private String getEstadoInternet(){
        return (this.estaWifiHabilitado)?"Conectado a Internet, ": "No conectado a Internet, ";
    }
    
    @Override
    public double obtenerPrecioVenta(){
        return (this.resoluciónPulgadas>=40)? super.obtenerPrecioVenta()*1.3: super.obtenerPrecioVenta();
    }
    
    @Override
    public String toString() {
        return super.toString()+", "+this.getEstadoWifi()+getEstadoInternet()+"Resolución: "+this.resoluciónPulgadas;
    }

}