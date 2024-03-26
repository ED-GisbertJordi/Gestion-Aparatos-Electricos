package electrodomesticos;

/**
 * @author Jordi Gisbert y Jean Marc 
 */
public class Lavadora extends Electrodomestico{
    private double carga = 7;

    public Lavadora(String numeroSerie, String marca, String modelo) {
        super(numeroSerie, marca, modelo);
    }

    @Override
    public String toString() {
        return "";
    }

}