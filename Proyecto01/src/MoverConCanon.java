/**
 * Clase que define el comportamiento de mover para los soldados que se mueven
 * con canon
 * Patron Strategy
 */
public class MoverConCanon implements MovementBehaviour {

    @Override
    public String mover(Soldado s) {
        if (s.getDistancia() > 0) {
        	s.setDistancia(s.getDistancia() - 10.00);
            return "El soldado " + s.getNombre() + " con id " + s.getId() + " se mueve hacia el enemigo con su canon.";
        } else {
            return "El soldado " + s.getNombre() + " con id " + s.getId() + " ya alcanzo al enemigo, listo para atacar!";
        }
    }

}