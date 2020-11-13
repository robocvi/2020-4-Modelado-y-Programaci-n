public class Catsup extends IngredienteDecorador{
	Baguettes baguette;
	public Catsup(Baguettes baguette){
		this.baguette = baguette;
	}
	
	public String getDescripcion(){
		return baguette.getDescripcion() + ", Catsup $6.50";
	}
	
	public double costo(){
		return baguette.costo() + 6.50;
	}

}