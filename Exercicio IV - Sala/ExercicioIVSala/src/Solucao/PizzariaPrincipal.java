package Solucao;


public class PizzariaPrincipal {
	protected PizzaStoreBuilder montarpizza;
	
	public PizzariaPrincipal (PizzaStoreBuilder montarpizza) {
		this.montarpizza = montarpizza;
		
	}

	public void montarPizzaQueijo() {
		montarpizza.buildCriarMassa("Massa Fina");
		montarpizza.buildCriarMolho("Molho de Tomate");
		montarpizza.buildCriarQueijo("Queijo Chedder");
		
	}
	
	public void montarPizzaPeperoni() {
		montarpizza.buildCriarMassa("Massa Fina");
		montarpizza.buildCriarMolho("Molho de Tomate");
		montarpizza.buildCriarQueijo("Queijo Chedder");
		montarpizza.buildCriarPepperoni("Pepperoni Suave");
	}
	
	public void montarPizzaMexilhao() {
		montarpizza.buildCriarMassa("Massa Fina");
		montarpizza.buildCriarMolho("Molho de Tomate");
		montarpizza.buildCriarQueijo("Queijo Chedder");
		montarpizza.buildCriarPepperoni("Pepperoni Picante");
		montarpizza.buildCriarMexilhao("Camarao");
	}
	
	public PizzaStoreAF getPizza() {
		return montarpizza.getPizza();
	}
	
}
