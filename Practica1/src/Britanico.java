
/*Clase que hereda de Usuario, esta clase va a utilizar la clase Ingles*/ 
public class Britanico extends Usuario{

	public Britanico(String nombre, Chat chat){
		this.nombre = nombre;
		this.chat = chat;
		mensaje = chat.getUltimoMensaje();
		this.id = new Ingles();
		chat.registrar(this);
		
	}
}