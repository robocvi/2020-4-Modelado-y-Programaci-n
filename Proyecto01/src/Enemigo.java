/**
 * Clase para representar al enemigo al que se enfrentara el ejercito
 */
public class Enemigo{
	String nombre;
	double vida;

	/**
	 * Crea al enemigo
	 */
	public Enemigo(){
		this.nombre = "Mounstro >:)";
		this.vida = 2000.0;
	}

	/**
	 * Le da un nombre al enemigo
	 * @param s el nombre
	 */
	public void setNombre(String s){
		nombre = s;
	}

	/**
	 * Le da una vida al enemigo
	 * @param d la vida
	 */
	public void setVida(double d){
		vida = d;
	}

	/**
	 * Devuelve el nombre del enemigo
	 * @return el nombre
	 */
	public String getNombre(){
		return nombre;
	}

	/**
	 * devuelve la vida del enemigo
	 * @return la vida
	 */
	public double getVida(){
		return vida;
	}
	
}
