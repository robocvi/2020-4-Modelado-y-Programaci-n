/**
 * Interfaz para definir el metodo mover en sus diferentes comportamientos para los soldados
 * Patron Strategy
 */
public interface MovementBehaviour {

    /**
     * Hace que un soldado se mueva, cada tipo de soldado lo hace de manera diferente
     * @param s el soldado
     * @return el string que se mostrara en consola con la informacion de la accion
     */
    public String mover(Soldado s);

}