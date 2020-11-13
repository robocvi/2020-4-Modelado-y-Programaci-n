/**
 * Clase que utilizaremos para implemebtar los patrones de Composite y Strategy,
 * tambien es la clase base para Comandante y los tres tipos de soldado que
 * existen.
 */

public abstract class Soldado {

	String id;
	String name;
	private double distancia;
	private double vida;
	private AttackBehaviour ataque;
	private MovementBehaviour movimiento;
	private ReportBehaviour reporte;

	/**
	 * Añade un soldado a la lista de subordinados de un soldado comandante
	 * 
	 * @param s el soldado
	 */
	public void add(Soldado s) {
	}

	/**
	 * Elimina un soldado de la lista de subordinados de un soldado comandante
	 * 
	 * @param s el soldado
	 */
	public void remove(Soldado s) {
	}

	/**
	 * Devuelve al soldado subordinado en la posicion i de la lista de subordinados
	 * 
	 * @param i la posicion
	 * @return
	 */
	public Soldado getChild(int i) {
		return null;
	}

	/**
	 * Modifica la vida del soldado
	 * 
	 * @param vida nueva vida
	 */
	public void setVida(double vida) {
		this.vida = vida;
	}

	/**
	 * Modifica la distancia del soldado
	 * 
	 * @param a la nueva distancia
	 */
	public void setDistancia(double a) {
		distancia = a;
	}

	/**
	 * Modifica el comportamiento al atacar
	 * 
	 * @param a el comportamiento
	 */
	public void setAtaque(AttackBehaviour a) {
		ataque = a;
	}

	/**
	 * Modifica que tanto avanza al moverse, el comportamiento de moviemiento
	 * 
	 * @param a el comportamiento
	 */
	public void setMovimiento(MovementBehaviour a) {
		movimiento = a;
	}

	/**
	 * Modifica el comportamiento al reportarse
	 * 
	 * @param a el comportamiento
	 */
	public void setReporte(ReportBehaviour a) {
		reporte = a;
	}

	/**
	 * Recibe una orden, si es un comandante la pasa a sus subordinados si no, solo
	 * la cumple
	 * 
	 * @param i la orden: 1 para atacar, 2 para moverse, 3 para reportarse
	 * @param e el enemigo que tiene asignado
	 */
	public abstract void ordenar(int i, Enemigo e);

	/**
	 * Regresa el id del soldado
	 * 
	 * @return el id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Regresa el nombre del soldado
	 * 
	 * @return el nombre
	 */
	public String getNombre() {
		return name;
	}

	/**
	 * Regresa la distancia del soldado
	 * 
	 * @return la distancia
	 */
	public double getDistancia() {
		return distancia;
	}

	/**
	 * Regresa la vida del soldado
	 * 
	 * @return la vida
	 */
	public double getVida() {
		return vida;
	}

	/**
	 * Hace la accion correspondiente de atacar
	 * 
	 * @param e el enemigo al que ataca
	 */
	public void ataca(Enemigo e) {
		System.out.println(ataque.atacar(this, e));
	}

	/**
	 * Hace la accion correspondiente de atacar
	 */
	public void moverse() {
		System.out.println(movimiento.mover(this));
	}

	/**
	 * Hace la accion correspondiente de reportarse
	 */
	public void reportarse() {
		System.out.println(reporte.reportar(this));
	}

	/**
	 * Nos regresa la informacion del soldado, si este es un comandante tambien nos
	 * regresa la informacion de todos sus subordinados
	 * @return la informacion del solda
	 */
	public abstract void getInfo();

}