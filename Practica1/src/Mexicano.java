
/*Clase que hereda de Usuario, esta clase va a utilizar la clase EspaniolMex*/ 
public class Mexicano extends Usuario{

	public Mexicano(String nombre, Chat chat){
		this.nombre = nombre;
		this.chat = chat;
		mensaje = chat.getUltimoMensaje();
		this.id = new EspaniolMex();
		chat.registrar(this);
		
	}
}