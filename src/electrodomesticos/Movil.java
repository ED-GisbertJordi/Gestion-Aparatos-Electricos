package electrodomesticos;

/**
 * @author Jordi Gisbert y Jean Marc 
 */
public class Movil extends AparatoElectrico{
    private MemoriaInterna memoriaInterna;

    public Movil(MemoriaInterna memoriaInterna, int numeroSerie, String marca, String modelo) {
        super(numeroSerie, marca, modelo);
        this.memoriaInterna = memoriaInterna;
    }

    @Override
    public String toString() {
        return "";
    }
    
}

enum MemoriaInterna {Mb64, Mb128, Mb256, Mb512, Gb1, Gb2}
