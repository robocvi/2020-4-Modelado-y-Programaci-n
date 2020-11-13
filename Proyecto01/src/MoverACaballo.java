/**
 * Clase que define el comportamiento de mover para los soldados que se mueven a
 * caballo
 * Patron Strategy
 */
public class MoverACaballo implements MovementBehaviour {

    @Override
    public String mover(Soldado s) {
        if (s.getDistancia() > 0) {
        	s.setDistancia(s.getDistancia() - 25.00);
            return "El soldado " + s.getNombre() + " con id " + s.getId() + " se mueve hacia el enemigo en caballo.";
        } else {
            return "El soldado " + s.getNombre() + " con id " + s.getId() + " ya alcanzo al enemigo, listo para atacar!";
        }
    }

}