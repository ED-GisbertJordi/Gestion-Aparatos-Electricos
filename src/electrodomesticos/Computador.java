package electrodomesticos;

/**
 * @author Jordi Gisbert y Jean Marc 
 */
public class Computador extends AparatoElectrico{
    private int memoriaRAM;
    private double velocidadCPU;
    private double tamañoDisco;

    public Computador(int memoriaRAM, double velocidadCPU, double tamañoDisco, int numeroSerie, String marca, String modelo) {
        super(numeroSerie, marca, modelo);
        this.memoriaRAM = memoriaRAM;
        this.velocidadCPU = velocidadCPU;
        this.tamañoDisco = tamañoDisco;
    }
    
    
}
