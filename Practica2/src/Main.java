import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		System.out.println("Buenos dias, desea una pizza o un baguette? b/p");
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.print("Introduzca texto: ");
		s = sc.nextLine();
		if(s.equals("b")){
			System.out.println("--Ticket:\n");

			seleccionPan();

		}else if(s.equals("p")){
			seleccionPizza();
		}
	}

	public static void seleccionPizza(){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("1 - Pizza ChesPollo\n");
		System.out.print("2 - Pizza ManJam\n");
		System.out.print("3 - Pizza ChedJam\n");
		System.out.print("4 - Pizza ManPollo\n");
		System.out.print("5 - Pizza ManSalch\n");
		System.out.println("Seleccione su pizza presionando el numero correspondiente: ");
		n = sc.nextInt();
		switch(n){
			case 1:
				System.out.println("Ticket:\n");
				Pizza a = new PizzaChesPollo();
				Baguettes dis1 = new PizzaAdaptador(a);
				dis1.ticket();
				break;
			case 2:
				System.out.println("Ticket:\n");
				Pizza b = new PizzaManJam();
				Baguettes dis2 = new PizzaAdaptador(b);
				dis2.ticket();
				break;
			case 3:
				System.out.println("Ticket:\n");
				Pizza c = new PizzaChedJam();
				Baguettes dis3 = new PizzaAdaptador(c);
				dis3.ticket();
				break;
			case 4:
				System.out.println("Ticket:\n");
				Pizza d = new PizzaManPollo();
				Baguettes dis4 = new PizzaAdaptador(d);
				dis4.ticket();
				break;
			case 5:
			  	System.out.println("Ticket:\n");
				Pizza e = new PizzaManSalch();
				Baguettes dis5 = new PizzaAdaptador(e);
				dis5.ticket();
				break;
		}
	}

	public static void seleccionPan(){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("1 - Pan Blanco\n");
		System.out.print("2 - Pan de Ajo\n");
		System.out.print("3 - Pan Integral\n");
		System.out.print("4 - Pan de Oregano\n");
		System.out.println("Seleccione el tipo de pan presionando el numero correspondiente: ");
		n = sc.nextInt();
		switch(n){
			case 1:
				Baguettes a = new PanBlanco();
				seleccionIngredientes(a);
				break;
			case 2:
				Baguettes b = new PanDeAjo();
				seleccionIngredientes(b);
				break;
			case 3:
				Baguettes c = new PanIntegral();
				seleccionIngredientes(c);
				break;
			case 4:
				Baguettes d = new PanOregano();
				seleccionIngredientes(d);
				break;

		}
	}

	public static void seleccionIngredientes(Baguettes a){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("0 - Salir de ingredientes\n");
		System.out.print("1 - Jamon\n");
		System.out.print("2 - Jitomate\n");
		System.out.print("3 - Cebolla\n");
		System.out.print("4 - Mayonesa\n");
		System.out.print("5 - Mostaza\n");
		System.out.print("6 - Catsup\n");
		System.out.print("7 - Pepperoni\n");
		System.out.print("8 - Lechuga\n");
		System.out.print("9 - Pollo\n");
		System.out.println("Seleccione los ingredientes presionando el numero correspondiente: ");
		n = sc.nextInt();
		switch(n){
			case 0:
				a.ticket();
				break;
			case 1:
					Baguettes b = new Jamon(a);
					seleccionIngredientes(b);
					break;
			case 2:
					Baguettes c = new Jitomate(a);
					seleccionIngredientes(c);
					break;
			case 3:
					Baguettes d = new Cebolla(a);
					seleccionIngredientes(d);
					break;
			case 4:
					Baguettes e = new Mayonesa(a);
					seleccionIngredientes(e);
					break;
			case 5:
					Baguettes f = new Mostaza(a);
					seleccionIngredientes(f);
					break;
			case 6:
					Baguettes g = new Catsup(a);
					seleccionIngredientes(g);
					break;
			case 7:
					Baguettes h = new Pepperoni(a);
					seleccionIngredientes(h);
					break;
			case 8:
					Baguettes i = new Lechuga(a);
					seleccionIngredientes(i);
					break;
			case 9:
					Baguettes j = new Pollo(a);
					seleccionIngredientes(j);
					break;

		}

	}
}