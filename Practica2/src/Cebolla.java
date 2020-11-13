public class Cebolla extends IngredienteDecorador{
	Baguettes baguette;
	public Cebolla(Baguettes baguette){
		this.baguette = baguette;
	}
	
	public String getDescripcion(){
		return baguette.getDescripcion() + ", Cebolla $5";
	}
	
	public double costo(){
		return baguette.costo() + 5;
	}

}