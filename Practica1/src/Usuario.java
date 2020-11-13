
/*Clase para el usuario, va a implementar al observador del patron Observer, recibe actualizaciones del chat (Sujeto)
cuando alguien ha mandado un mensaje, se ha unido al chat o lo ha abandonado.*/
public abstract class Usuario implements Observador{

	String nombre;
	Chat chat;
	String mensaje;
	String usuarioMensaje;
	Idioma id;

	/*Nos permite establecer o cambiar el idioma de algun usuario*/
	public void setIdioma(Idioma i){
		id = i;
	}

	@Override
	public void updateMen(){
		mensaje = chat.getUltimoMensaje();
		usuarioMensaje = chat.getUltimoUsuario();
		mostrarMensaje1(usuarioMensaje);
	}

	@Override
	public void updateInicioSesion(){
		usuarioMensaje = chat.getUltimoUsuario();
		mostrarMensaje2(usuarioMensaje);
	}

	@Override
	public void updateFinSesion(){
		usuarioMensaje = chat.getUltimoUsuario();
		mostrarMensaje3(usuarioMensaje);
	}

	public String getNombre(){
		return nombre;
	}

	public void dejarChat(){
		chat.remover(this);
	}

	/*Para un mensaje nuevo*/
	public void mostrarMensaje1(String us){
		id.mensaje1(nombre,us,mensaje);
	}

	/*Para cuando se una un nuevo usuario*/
	public void mostrarMensaje2(String us){
		id.mensaje2(nombre,us);
	}

	/*Para cuando abandone un usuario*/
	public void mostrarMensaje3(String us){
		id.mensaje3(nombre,us);
	}
	
}