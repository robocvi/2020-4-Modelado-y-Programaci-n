
/*Interfaz que nos ayuda a implementar el patron Observer, tiene metodos para actualizar 
el ultimo mensaje recibido, actualizar cuando alguien se haya unido al chat y para actualizar cuando alguien haya
abandonado.*/
public interface Observador{
	public void updateMen();
	public void updateInicioSesion();
	public void updateFinSesion();
}