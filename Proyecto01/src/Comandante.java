import java.util.ArrayList;

/**
 * Clase que representa a un comandante
 * Patron composite/strategy/observer
 */
public class Comandante extends Soldado implements Observador {

	ArrayList<Soldado> subordinados;

	/**
	 * Crea un comandante
	 * @param id el id del soldado
	 * @param n el nombre del soldado
	 * @param dist la distancia
	 */
	public Comandante(String id, String n, int dist) {
		this.subordinados = new ArrayList<Soldado>();
		this.name = n;
		this.id = id;
		this.setVida(100);
		this.setDistancia(dist);
	}

	public void add(Soldado s) {
		subordinados.add(s);
	}

	public void remove(Soldado s) {
		subordinados.remove(s);
	}

	public Soldado getChild(int i) {
		return (Soldado) subordinados.get(i);
	}

	public void updateOrden(int i, Enemigo e){
		this.ordenar(i,e);
	}

	public void ordenar(int i, Enemigo e) {
		switch (i) {
			case 1:
				System.out.println("Comandante " + name + ": Les ordeno atacar!");
				ataca(e);
				for (Soldado soldado : subordinados) {
					soldado.ordenar(i,e);
				}
				break;
			case 2:
				System.out.println("Comandante " + name + ": Les ordeno moverse!");
				moverse();
				for (Soldado soldado : subordinados) {
					soldado.ordenar(i,e);
				}
				break;
			case 3:
				System.out.println("Comandante " + name + ": Les ordeno reportarse!");
				reportarse();
				for (Soldado soldado : subordinados) {
					soldado.ordenar(i,e);
				}
				break;
			default:
				return;
		}

	}

	public void updateInfo(){
		this.getInfo();
	}

	@Override
	public void getInfo() {
		System.out.print(" Comandante " + name + " con id " + id + "." + "\n");
		for (Soldado soldado : subordinados) {
			soldado.getInfo();
			System.out.print("\n");
		} 
	}
}