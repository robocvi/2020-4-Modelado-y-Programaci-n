public class Mayonesa extends IngredienteDecorador{
	Baguettes baguette;
	public Mayonesa(Baguettes baguette){
		this.baguette = baguette;
	}
	
	public String getDescripcion(){
		return baguette.getDescripcion() + ", Mayonesa $6";
	}
	
	public double costo(){
		return baguette.costo() + 6;
	}

}