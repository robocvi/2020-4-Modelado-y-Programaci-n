
/*Interfaz que nos ayuda a implementar el patron Observer, puedo registrar o eliminar Observadores (Soldados) 
y los notifica cuando se haya dado una nueva orden*/
public interface Sujeto{

	/**
	 * Añade un comandante
	 * @param c el comandante
	 */
	public void add(Comandante c);

	/**
	 * elimina un comandante
	 * @param c el comandante
	 */
	public void remove(Comandante c);

	/**
	 * Recibe una orden y la notifica
	 * @param i la orden: 1 es atacar, 2 es moverse y 3 es reportar
	 */
	public void notificaOrden(int i);

	/**
	 * Notifica al ejercito para que muestre su informacion.
	 */
	public void notificaInfoEjercito();
}