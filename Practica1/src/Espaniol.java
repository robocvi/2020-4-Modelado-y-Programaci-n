
/*Clase que hereda de Usuario, esta clase va a utilizar la clase EspaniolEsp*/ 
public class Espaniol extends Usuario{

	public Espaniol(String nombre, Chat chat){
		this.nombre = nombre;
		this.chat = chat;
		mensaje = chat.getUltimoMensaje();
		this.id = new EspaniolEsp();
		chat.registrar(this);
		
	}
}