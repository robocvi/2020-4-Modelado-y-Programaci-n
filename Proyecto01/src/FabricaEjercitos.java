/**
 * Clase para unificar la creacion de los distintos ejercitos
 * Patron Factory
 */
public class FabricaEjercitos {

    /**
     * Nos regresa un ejercito
     * @param ejercito el tipo de ejercito que se requiere: kamikaze/default/explorador
     * @return el ejercito especificado
     */
    public Ejercito getEjercito(String ejercito) {
        if(ejercito.equalsIgnoreCase("kamikaze")) {
            return new EjercitoKamikaze();
        }
        if(ejercito.equalsIgnoreCase("default")) {
            return new EjercitoDefault();
        }
        if(ejercito.equalsIgnoreCase("explorador")) {
            return new EjercitoExplorador();
        }
        return null;
    }
}