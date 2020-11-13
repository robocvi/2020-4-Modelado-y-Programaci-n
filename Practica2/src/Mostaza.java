public class Mostaza extends IngredienteDecorador{
	Baguettes baguette;
	public Mostaza(Baguettes baguette){
		this.baguette = baguette;
	}
	
	public String getDescripcion(){
		return baguette.getDescripcion() + ", Mostaza $7.50";
	}
	
	public double costo(){
		return baguette.costo() + 7.50;
	}

}