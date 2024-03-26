package electrodomesticos;

/**
 * @author Jordi Gisbert y Jean Marc 
 */
public class Movil extends Dispositivo{
    private MemoriaInterna memoriaInterna;
    private String marca;
    private String modelo;

    public Movil(MemoriaInterna memoriaInterna, String numeroSerie, String marca, String modelo) {
        super(numeroSerie);
        this.memoriaInterna = memoriaInterna;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "";
    }
    
}

enum MemoriaInterna {
    
    Mb64  {
        @Override
        public String toString() {
            return "";
        }
    }, 
    Mb128  {
        @Override
        public String toString() {
            return "";
        }
    }, 
    Mb256 {
        @Override
        public String toString() {
            return "";
        }
    }, 
    Mb512 {
        @Override
        public String toString() {
            return "";
        }
    }, 
    Gb1 {
        @Override
        public String toString() {
            return "";
        }
    }, 
    Gb2 {
        @Override
        public String toString() {
            return "2GB";
        }
    }



}
