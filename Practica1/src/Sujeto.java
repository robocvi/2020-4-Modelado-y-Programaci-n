
/*Interfaz que nos ayuda a implementar el patron Observer, puedo registrar o eliminar Observadores (Usuarios) 
y los notifica cuando se haya mandado un nuevo mensaje, se haya unido alguien al chat o lo haya abandonado.*/
public interface Sujeto{
	public void registrar(Usuario u);
	public void remover(Usuario u);
	public void notificarMen();
	public void notificarInicioSesion();
	public void notificarFinSesion();
}