package Solucao;


public abstract class PizzaStoreBuilder {
	protected PizzaStoreAF pizza;
	
	public PizzaStoreBuilder() {
		pizza = new PizzaStoreAF();
	}
	
	public abstract void buildCriarMassa(String tipo);
	public abstract void buildCriarMolho(String tipo);
	public abstract void buildCriarQueijo(String tipo);
	public abstract void buildCriarVegetal(String tipo);
	public abstract void buildCriarPepperoni(String tipo);
	public abstract void buildCriarMexilhao(String tipo);
	
	public PizzaStoreAF getPizza() {
		return pizza;
	}

}
