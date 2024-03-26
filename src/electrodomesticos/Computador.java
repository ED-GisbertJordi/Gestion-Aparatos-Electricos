package electrodomesticos;

/**
 * @author Jordi Gisbert y Jean Marc 
 */
public class Computador extends Dispositivo{
    private int memoriaRAM;
    private double velocidadCPU;
    private int tamañoDisco;

    public Computador(String numeroSerie, int memoriaRAM, double velocidadCPU, int tamañoDisco) {
        super(numeroSerie);
        this.memoriaRAM = memoriaRAM;
        this.velocidadCPU = velocidadCPU;
        this.tamañoDisco = tamañoDisco;
    }
    
    @Override
    public String toString() {
        return super.toString()+"RAM: "+this.memoriaRAM+", Velocidad CPU: "+this.velocidadCPU+", Tamaño HD: "+this.tamañoDisco;
    }
}
