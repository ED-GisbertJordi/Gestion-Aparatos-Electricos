package electrodomesticos;

/**
 * @author Jordi Gisbert y Jean Marc 
 */
public class Television extends Electrodomestico implements Conectable, Encendible{
    private boolean estaWifiHabilitado = false;
    private boolean estaConectadaAInternet = false;
    private double resoluciónPulgadas = 20;

    
    public Television(String numeroSerie, String marca, String modelo) {
        super(numeroSerie, marca, modelo);
    }
    
    public void habilitarWifi(){
        estaWifiHabilitado = true;
    }
    
    public void deshabilitarWifi(){
        estaWifiHabilitado = false;
    }
    
    public Television(String numeroSerie, String marca, String modelo, double resoluciónPulgadas) {
        super(numeroSerie, marca, modelo);
        this.resoluciónPulgadas = resoluciónPulgadas;
    }

    private String getEstadoWifi(){
        return (this.estaWifiHabilitado)?"Wifi habilitado, ": "Wifi deshabilitado, ";
    }
    
    private String getEstadoInternet(){
        return (this.estaConectadaAInternet)?"Conectado a Internet, ": "No conectado a Internet, ";
    }
    
    @Override
    public double obtenerPrecioVenta(){
        return (this.resoluciónPulgadas>=40)? super.obtenerPrecioVenta()*1.3: super.obtenerPrecioVenta();
    }
    
    @Override
    public String toString() {
        return super.toString()+", "+this.getEstadoWifi()+getEstadoInternet()+"Resolución: "+this.resoluciónPulgadas;
    }

    @Override
    public void activar() {
        if (tieneCorrienteElectrica) {
            estaEncendido = true;
            System.out.println("[Televisión] Aparato encendido");
         }else{
            System.out.println("[Televisión] No se puede encender (no hay corriente)");
        }
    }

    @Override
    public void desactivar() {
         if (tieneCorrienteElectrica) {
            estaEncendido = false;
            System.out.println("[Televisión] Aparato apagado");
         }else{
            System.out.println("[Televisión] No se puede apagar (no hay corriente)");
        }
    }

    @Override
    public boolean sePermiteConexion() {
        return tieneCorrienteElectrica && estaEncendido && estaWifiHabilitado;
    }

    @Override
    public void establecerConexion() {
        if (tieneCorrienteElectrica && estaEncendido && estaWifiHabilitado) {
            estaConectadaAInternet = true;
         }
    }

    @Override
    public void quitaConexion() {
        estaConectadaAInternet = false;
    }

    
    
}