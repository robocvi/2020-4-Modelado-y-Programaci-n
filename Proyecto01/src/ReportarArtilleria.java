/**
 * Clase que define el comportamiento de reportarse para los artilleros.
 * Patron Strategy
 */
public class ReportarArtilleria implements ReportBehaviour{

	@Override
	public String reportar(Soldado s){
		return "Soy el soldado " + s.getNombre() + " con id " + s.getId() + ", soy un Infante," 
				+ " estoy a una distancia de " + s.getDistancia() + " y tengo " + s.getVida() + " de vida.";
	}
}