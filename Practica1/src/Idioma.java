/*Interfaz que nos ayudara a implementar el patron Strategy, esta interfaz 
la utilizaremos para que los mensajes que manda el programa al usuario sean en un lenguaje 
correspondiente a su nacionalidad
mensaje1: nuevo mensaje.
mensaje2: alguien se unio al chat.
mensaje3: alguien abandono el chat.
*/
public interface Idioma{
	public void mensaje1(String n,String s, String m);
	public void mensaje2(String n,String s);
	public void mensaje3(String n,String s);
}