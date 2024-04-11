package electrodomesticos;

/**
 * @author Jordi Gisbert Ferriz
 */
public class Regleta {

    private Enchufable[] aparatos = new Enchufable[10];

    public boolean enchufar(AparatoElectrico aparato) {
        if (aparatoExistente(aparato)) {
            return false;
        }
        for (int i = 0; i < aparatos.length; i++) {
            if (aparatos[i] == null) {
                aparatos[i] = aparato;
                aparatos[i].darEnergia();
                return true;
            }
        }
        return false;
    }

    private boolean aparatoExistente(AparatoElectrico aparato) {
        for (Enchufable a : aparatos) {
            if (a == null) {
                continue;
            }
            if (a.equals(aparato)) {
                return true;
            }
        }
        return false;
    }

    public boolean desenchufar(AparatoElectrico aparato) {
        for (int i = 0; i < aparatos.length; i++) {
            if (aparatos[i] == null) {
                continue;
            }
            if (aparatos[i].equals(aparato)) {
                aparatos[i].quitarEnergia();
                aparatos[i] = null;
                return true;
            }
        }
        return false;
    }

    public int obtenetNumeroTomasLibres() {
        int tomasLibres = 0;
        for (Enchufable toma : aparatos) {
            if (toma == null) {
                tomasLibres++;
            }
        }
        return tomasLibres;
    }

    public void listarConectados() {
        for (Enchufable toma : aparatos) {
            if (toma == null) {
                break;
            }
            System.out.println(toma);
        }
    }

}
