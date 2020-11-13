/**
 * Representa un soldado de la clase infanteria
 */
public class Infanteria extends Soldado{

	/**
	 * Crea un infante
	 * @param id el id del soldado
	 * @param n el nombre del soldado
	 * @param dist la distancia
	 */
	public Infanteria(String id, String n, int dist){
		this.id = id;
		this.name = n;
		this.setVida(100);
		this.setDistancia(dist); 
		this.setMovimiento(new MoverAPie());
		this.setAtaque(new AtacarConPistola());
		this.setReporte(new ReportarInfanteria());
	}

	public void ordenar(int i, Enemigo e){
		switch(i){
			case 1:
				ataca(e);
				break;
			case 2:
				moverse();
				break;
			case 3:
				reportarse();
				break;
			default: 
				return;
		}
	}

	@Override
	public void getInfo() {
		System.out.print("   Soldado/a de tipo Infanteria " + name + " con id " + id + "."); 
	}
}