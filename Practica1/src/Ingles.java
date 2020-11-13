
/*Clase que usa la interfaz Idioma, esta clase hace que los mensajes aparezcan en ingles.*/
public class Ingles implements Idioma{
	public void mensaje1(String n,String s, String m){
		if(n.equals(s)){
			System.out.println(n + ", you send a message: " + m); 
		}else{
			System.out.println(n + ", the user " + s +
			" has sent a message, answer quickly: " + m);
		}
	}

	public void mensaje2(String n,String s){
		if(n.equals(s)){
			System.out.println(n + ", You joined the chat");
		}else{
			System.out.println(n + ", you got a new friend, the user " + s + " has joined the chat, say hi.");
		}
	}

	public void mensaje3(String n,String s){
		System.out.println(n + ", you lost a friend, the user " + s + " has abandoned the chat.");
	}
}