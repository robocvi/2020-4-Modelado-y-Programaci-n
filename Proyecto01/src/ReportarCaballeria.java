/**
 * Clase que define el comportamiento de reportarse para los caballeros.
 * Patron Strategy
 */

public class ReportarCaballeria implements ReportBehaviour{

	@Override
	public String reportar(Soldado s){
		return "Soy el soldado " + s.getNombre() + " con id " + s.getId() + ", soy un Caballero," 
				+ " estoy a una distancia de " + s.getDistancia() + " y tengo " + s.getVida() + " de vida.";
	}
}