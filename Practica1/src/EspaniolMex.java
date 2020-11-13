
/*Clase que usa la interfaz Idioma, esta clase hace que los mensajes aparezcan en espaniol de Mexico.*/
public class EspaniolMex implements Idioma{
	public void mensaje1(String n,String s, String m){
		if(n.equals(s)){
			System.out.println(n + ", mandaste un mensaje: " + m);
		}else{
			System.out.println(n + ", el usuario " + s +
			" ha mandado un mensaje, contestale rapidito: " + m);
		}
	}

	public void mensaje2(String n,String s){
		if(n.equals(s)){
			System.out.println(n + ", Te has unido al chat");
		}else{
			System.out.println(n + ", conseguiste un amigo, el usuario " + s + " se ha unido al chat, saludalo.");
		}
	}

	public void mensaje3(String n,String s){
		System.out.println(n + ", perdiste un amigo, el usuario " + s + " ha abandonado el chat.");
	}
}