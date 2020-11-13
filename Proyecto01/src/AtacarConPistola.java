/**
 * Clase que define el comportamiento para atacar para los soldados que atacan
 * con pistola Patron Strategy
 */
public class AtacarConPistola implements AttackBehaviour {

    @Override
    public String atacar(Soldado s, Enemigo e) {
    	if(s.getVida() == 0){
    		return "El soldado " + s.getNombre() + " con id " + s.getId() + " no puede atacar al enemigo,"
    				+ " ya que ha perdido todos sus puntos de vida";
    	} else if (s.getDistancia() > 0) {
            return "El soldado " + s.getNombre() + " con id " + s.getId()
                    + " aun no puede atacar al enemigo, se encuentra a una distancia de " + s.getDistancia();
        }
        e.setVida(e.getVida() - 40.0);
        return "El soldado " + s.getNombre() + " con id " + s.getId() + " atacó al enemigo con su pistola e hizo 40 puntos de daño";
    }

}