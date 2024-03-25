package electrodomesticos;

/**
 * @author Jordi Gisbert y Jean Marc 
 */
public class Lavadora extends Electrodomestico{
    private boolean estaEncendida = false;
    private double carga = 7;

    public Lavadora(int numeroSerie, String marca, String modelo, Color color, ClaseEnergia claseEnergia) {
        super(numeroSerie, marca, modelo, color, claseEnergia);
    }
    
    
}
