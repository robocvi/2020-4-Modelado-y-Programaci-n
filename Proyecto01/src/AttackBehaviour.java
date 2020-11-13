/**
 * Interfaz para definir el metodo atacar en sus diferentes comportamientos para los soldados
 * Patron Strategy
 */
public interface AttackBehaviour {

    /**
     * Hace que un soldado ataque, cada tipo de soldado lo hace de manera diferente
     * @param s el soldado.
     * @param e el enemigo a atacar.
     * @return el string que se mostrara en consola con la informacion de la accion
     */
    public String atacar(Soldado s, Enemigo e);

}