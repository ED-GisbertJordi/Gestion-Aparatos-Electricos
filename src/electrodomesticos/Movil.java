package electrodomesticos;

/**
 * @author Jordi Gisbert y Jean Marc 
 */
public class Movil extends Dispositivo{
    private MemoriaInterna memoriaInterna;
    private String marca;
    private String modelo;

    public Movil(String numeroSerie, MemoriaInterna memoriaInterna, String marca, String modelo) {
        super(numeroSerie);
        this.memoriaInterna = memoriaInterna;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return super.toString()+"Memoria: "+this.memoriaInterna+", Marca: "+this.marca+", Modelo: "+this.modelo;
    }
    
    
    public enum MemoriaInterna {
        Gb64  {
            @Override
            public String toString() {
                return "64Gb";
            }
        }, 
        Gb128  {
            @Override
            public String toString() {
                return "128Gb";
            }
        }, 
        Gb256 {
            @Override
            public String toString() {
                return "256Gb";
            }
        }, 
        Gb512 {
            @Override
            public String toString() {
                return "512Gb";
            }
        }, 
        Tb1 {
            @Override
            public String toString() {
                return "1Tb";
            }
        }, 
        Tb2 {
            @Override
            public String toString() {
                return "2Tb";
            }
        }
    }
    
    
    
}


