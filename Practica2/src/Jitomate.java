public class Jitomate extends IngredienteDecorador{
	Baguettes baguette;
	public Jitomate(Baguettes baguette){
		this.baguette = baguette;
	}
	
	public String getDescripcion(){
		return baguette.getDescripcion() + ", Jitomate $4";
	}
	
	public double costo(){
		return baguette.costo() + 4;
	}

}