package electrodomesticos;

/**
 * @author Jordi Gisbert y Jean Marc 
 */
public class Electrodomestico {
    
    private int numeroSerie;
    private static final int precioBase = 100;
    private String marca;
    private String modelo;
    private Color color = Color.blanco;
    private ClaseEnergia claseEnergia = ClaseEnergia.F;
    private double pesoKg = 5;
    
    
    public Electrodomestico(int numeroSerie, String marca, String modelo, Color color, ClaseEnergia claseEnergia) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.claseEnergia = claseEnergia;
    }
    
    public double obtenerPrecioVenta(){
        return Electrodomestico.precioBase + switch (this.claseEnergia) {
            case A -> 100;
            case B -> 80;
            case C -> 60;
            case D -> 50;
            case E -> 30;
            case F -> 10;
        };
    }
    
    @Override
    public String toString() {
        return "";
    }
    
}

enum Color {blanco,negro,rojo,azul,gris}
enum ClaseEnergia { A,B,C,D,E,F}
