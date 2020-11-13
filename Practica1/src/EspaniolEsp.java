
/*Clase que usa la interfaz Idioma, esta clase hace que los mensajes aparezcan en espaniol de espania.*/
public class EspaniolEsp implements Idioma{
	public void mensaje1(String n,String s,String m){
		if(n.equals(s)){
			System.out.println(n + ", habeis enviado un mensaje: " + m);
		}else{
			System.out.println(n + ", el usuario " + s +
			" ha mandado un mensaje, contestadle rapido: " + m);
		}
	}

	public void mensaje2(String n,String s){
		if(n.equals(s)){
			System.out.println(n + ", Te habeis unido al chat.");
		}else{
			System.out.println(n + ", habeis conseguido un amigo, el usuario " + s + " se ha unido al chat, saludadlo.");
		}
	}

	public void mensaje3(String n,String s){
		System.out.println(n + ", habeis perdido un amigo, el usuario " + s + " ha abandonado el chat.");
	}
}