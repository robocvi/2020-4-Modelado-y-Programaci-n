public abstract class Baguettes{
	String descripcion = "Baguette basico";
	
	public String getDescripcion(){
		return descripcion;
	}
	
	public abstract double costo();

	public void ticket(){
		System.out.println(this.getDescripcion() + " Total: $" + this.costo());
	}
	
}