public class Pepperoni extends IngredienteDecorador{
	Baguettes baguette;
	public Pepperoni(Baguettes baguette){
		this.baguette = baguette;
	}
	
	public String getDescripcion(){
		return baguette.getDescripcion() + ", Pepperoni $12";
	}
	
	public double costo(){
		return baguette.costo() + 12;
	}

}
