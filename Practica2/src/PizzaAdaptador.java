public class PizzaAdaptador extends Baguettes{
	Pizza pizza;
	public PizzaAdaptador(Pizza p){
		pizza = p;
		descripcion = pizza.nombrePizza();
	}

	public double costo(){
		return pizza.precio();
	}

	public void ticket(){
		System.out.println(this.getDescripcion() + ", hecha con: " + pizza.tipoQueso()
		+ ", " + pizza.tipoCarne() + " y " + pizza.tipoMasa() + "\n Total: $" + this.costo());
	}
}