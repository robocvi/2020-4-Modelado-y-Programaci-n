public class Lechuga extends IngredienteDecorador{
	Baguettes baguette;
	public Lechuga(Baguettes baguette){
		this.baguette = baguette;
	}
	
	public String getDescripcion(){
		return baguette.getDescripcion() + ", Lechuga $3.50";
	}
	
	public double costo(){
		return baguette.costo() + 3.50;
	}

}