package Solucao;


public class Main {
	public static void main(String[] args) {
		PizzariaPrincipal pizzaria = new PizzariaPrincipal(new PizzariaDoEmmanuell());
		
		pizzaria.montarPizzaQueijo();
		PizzaStoreAF pizzaqueijo = pizzaria.getPizza();
		System.out.println("Pizza Queijo ou Massa " + pizzaqueijo.Massa);
		System.out.println("Molho: " + pizzaqueijo.Molho + " Queijo: " + pizzaqueijo.Queijo);
		
	}
	
	/*		
	pizzaria.montarPizzaCheese();
	PizzaProduct pizzaCheese = pizzaria.getPizza();
	System.out.println("Pizza: Queijo" + "/" + "Massa:" + pizzaCheese.Dough + "/" + "Molho:" + pizzaCheese.Sauce +  "/" + "Queijo:" + pizzaCheese.Cheese);
	
	pizzaria.montarPizzaPepperoni();
	PizzaProduct pizzaPepperoni = pizzaria.getPizza();
	System.out.println("Pizza: Pepperoni" + "/" + "Massa:" + pizzaPepperoni.Dough + "/" + "Molho:" + pizzaPepperoni.Sauce +  "/" + "Queijo:" + pizzaPepperoni.Cheese +  "/" + "Pepperoni:" + pizzaPepperoni.Pepperoni);

	
	pizzaria.montarPizzaOstra();
	PizzaProduct pizzaClams = pizzaria.getPizza();
	System.out.println("Pizza: Ostra" + "/" + "Massa:" + pizzaClams.Dough + "/" + "Molho:" + pizzaClams.Sauce +  "/" + "Queijo:" + pizzaClams.Cheese +  "/" + "Queijo:" + pizzaClams.Clams);
*/

}



