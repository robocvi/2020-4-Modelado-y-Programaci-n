/**
 * Representa un soldado del tipo artilleria
 * Patron composite/strategy
 */
public class Artilleria extends Soldado{

	/**
	 * Crea un artillero
	 * @param id el id del soldado
	 * @param n el nombre del soldado
	 * @param dist la distancia que se encuentra del enemigo
	 */
	public Artilleria(String id, String n, int dist){
		this.id = id;
		this.name = n;
		this.setVida(100);
		this.setDistancia(dist);
		this.setMovimiento(new MoverConCanon());
		this.setAtaque(new AtacarConCanon());
		this.setReporte(new ReportarArtilleria());
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
		System.out.print("   Soldado/a de tipo Artillero " + name + " con id " + id + "."); 
	}
}