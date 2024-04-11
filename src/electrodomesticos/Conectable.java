package electrodomesticos;

/**
 * @author Jordi Gisbert y Jean Marc
 */
public interface Conectable {
    boolean sePermiteConexion();
    void establecerConexion();
    void quitaConexion();
    
}