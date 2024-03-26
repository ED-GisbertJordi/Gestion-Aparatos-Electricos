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
        return "";
    }
    
    
    public enum MemoriaInterna {
        Gb64  {
            @Override
            public String toString() {
                return "";
            }
        }, 
        Gb128  {
            @Override
            public String toString() {
                return "";
            }
        }, 
        Gb256 {
            @Override
            public String toString() {
                return "";
            }
        }, 
        Gb512 {
            @Override
            public String toString() {
                return "";
            }
        }, 
        Tb1 {
            @Override
            public String toString() {
                return "";
            }
        }, 
        Tb2 {
            @Override
            public String toString() {
                return "2GB";
            }
        }
    }
    
    
    
}


