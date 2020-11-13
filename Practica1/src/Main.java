
/*El metodo main nos sirve para llevar a cabo la simulacion del chat.*/
public class Main{
	public static void main(String[] args){
		Chat chat = new Chat();

		System.out.print("\n");
		Usuario s1 = new Mexicano("Luis", chat);
		Usuario s2 = new Espaniol("Iniesta", chat);
		Usuario s3 = new Britanico("James", chat);
		Usuario s4 = new Mexicano("Gerardo", chat);

		chat.setUltimoMensaje("Hola amigos ¿Como estan?", s1);
		chat.setUltimoMensaje("Muy bien, tio", s2);

		/*Tambien se puede utilizar: chat.remover(s4)*/
		s4.dejarChat();

		chat.setUltimoMensaje("Why he left?", s3);

	}
}