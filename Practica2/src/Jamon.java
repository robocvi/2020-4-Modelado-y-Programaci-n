public class Jamon extends IngredienteDecorador{
	Baguettes baguette;
	public Jamon(Baguettes baguette){
		this.baguette = baguette;
	}
	
	public String getDescripcion(){
		return baguette.getDescripcion() + ", Jamon $5";
	}
	
	public double costo(){
		return baguette.costo() + 5;
	}

}
