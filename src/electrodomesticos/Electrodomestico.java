package electrodomesticos;

/**
 * @author Jordi Gisbert y Jean Marc 
 */
public abstract class Electrodomestico extends AparatoElectrico{
    private Color color = Color.BLANCO;
    private ClaseEnergia claseEnergia = ClaseEnergia.F;
    private static final int precioBase = 100;
    private String marca;
    private String modelo;
    private double pesoKg = 5;

    public Electrodomestico(String numeroSerie, String marca, String modelo) {
        super(numeroSerie);
        this.marca = marca;
        this.modelo = modelo;
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
        return super.toString()+"Marca: "+this.marca+", Modelo: '"+this.modelo+"', Tipo Consumo: "+this.claseEnergia+", Color: "+this.color+
                ", Precio Base: "+Electrodomestico.precioBase+", Precio Final: "+this.obtenerPrecioVenta(); 
    }
    
}

enum Color {BLANCO,NEGRO,ROJO,AZUL,GRIS}
enum ClaseEnergia { A,B,C,D,E,F}
