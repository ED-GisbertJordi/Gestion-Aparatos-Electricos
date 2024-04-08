package electrodomesticos;

/**
 * @author Jordi Gisbert Ferriz
 */
public class Regleta{
    private Enchufable[] aparatos = new Enchufable[10]; 
    
    public boolean enchufar(AparatoElectrico aparato) {
        for (int i = 0; i < aparatos.length; i++) {
            if (aparatos[i].equals(null)) {
                aparatos[i] = aparato;
                darEnergia();
                return true;
            }
        }
        return  false;
    }
    
    public boolean desenchufar(AparatoElectrico aparato) {
        for (int i = 0; i < aparatos.length; i++) {
            if (aparatos[i].equals(aparato)) {
//                quitarEnergia();
                aparatos[i] = null;
                return true;
            }
        }
        return  false;
    }
    
    public void darEnergia() {
        for (Enchufable aparato : aparatos) {
            AparatoElectrico a = (AparatoElectrico) aparato;
            a.tieneCorreinteElecctrica = true;
        }
    }

    public void quitarEnergia(int numeroEnchufe) {
        
    }
    
    public void obtenetNumeroTomasLibres() {
        
    }
    
    public void listarConectados() {
        
    }


    
}
