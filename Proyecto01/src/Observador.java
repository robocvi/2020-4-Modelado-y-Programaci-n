
/*Interfaz que nos ayuda a implementar el patron Observer, tiene metodos para actualizar 
cuando se una orden nueva.*/
public interface Observador{

	/**
	 * Hace la accion correspondiente a la orden.
	 * @param i la orden
	 * @param e el enemigo asignado
	 */
	public void updateOrden(int i, Enemigo e);

	/**
	 * Da su informacion.
	 */
	public void updateInfo();
}