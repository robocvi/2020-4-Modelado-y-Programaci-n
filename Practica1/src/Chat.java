import java.util.ArrayList;
import java.util.List;

/*Clase para el chat, va a implementar al sujeto del patron Observer, avisara a cada uno de los usuarios cuando
se envie un mensaje, alguien se una o alguien abandone el chat.*/
public class Chat implements Sujeto{

	List<Usuario> usuarios = new ArrayList<Usuario>();
	String ultimoMensaje;
	String ultimoUsuario;

	public Chat(){}

	public List<Usuario> getUsuarios(){
		return usuarios;
	}

	public String getUltimoMensaje(){
		return ultimoMensaje;
	}

	public String getUltimoUsuario(){
		return ultimoUsuario;
	}

	/*Se utiliza para inidicar cuando que se ha mandado un nuevo mensaje y para notificar a los 
	usuarios del chat de este nuevo mensaje.*/
	public void setUltimoMensaje(String nuevoMensaje, Usuario us){
		ultimoMensaje = nuevoMensaje;
		ultimoUsuario = us.getNombre();
		System.out.println("\n" + "-- " + ultimoUsuario + " Mando un nuevo mensaje: " + ultimoMensaje);
		notificarMen();
	}

	public void registrar(Usuario u){
		usuarios.add(u);
		System.out.println("\n" + "-- " + u.getNombre() + " se unio al chat");
		ultimoUsuario = u.getNombre();
		notificarInicioSesion();
	}

	public void remover(Usuario u){
		System.out.println("\n" + "-- " + u.getNombre() + " abandono el chat");
		usuarios.remove(u);
		ultimoUsuario = u.getNombre();
		notificarFinSesion();
	}
	/*Metodo que notifica a los usuarios sobre un nuevo mensaje.*/
	public void notificarMen(){
		for(Usuario u : usuarios){
			u.updateMen();
		}
	}
	/*Metodo que notifica a los usuarios sobre un nuevo usuario en el chat.*/
	public void notificarInicioSesion(){
		for(Usuario u : usuarios){
			u.updateInicioSesion();
		}
	}
	/*Metodo que notifica a los usuarios cuando un usuario ha abandonado el chat.*/
	public void notificarFinSesion(){
		for(Usuario u : usuarios){
			u.updateFinSesion();
		}
	}
}