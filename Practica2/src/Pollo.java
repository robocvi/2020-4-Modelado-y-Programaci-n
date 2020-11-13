public class Pollo extends IngredienteDecorador{
	Baguettes baguette;
	public Pollo(Baguettes baguette){
		this.baguette = baguette;
	}
	
	public String getDescripcion(){
		return baguette.getDescripcion() + ", Pollo $10";
	}
	
	public double costo(){
		return baguette.costo() + 10;
	}

}
