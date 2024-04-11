package electrodomesticos;

/**
 * @author Jordi Gisbert y Jean Marc
 */
public interface Conectable {
    boolean sePermiteConexuon();
    void establecerConexion();
    void quitaConexion();
    
}