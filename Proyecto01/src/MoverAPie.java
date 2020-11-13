/**
 * Clase que define el comportamiento de mover para los soldados que se mueven a
 * pie
 * Patron Strategy
 */
public class MoverAPie implements MovementBehaviour {

    @Override
    public String mover(Soldado s) {
        if (s.getDistancia() > 0) {
        	s.setDistancia(s.getDistancia() - 15.00);
            return "El soldado " + s.getNombre() + " con id " + s.getId() + " se mueve hacia el enemigo a pie.";
        } else {
            return "El soldado " + s.getNombre() + " con id " + s.getId() + " ya alcanzo al enemigo, listo para atacar!";
        }
    }

}