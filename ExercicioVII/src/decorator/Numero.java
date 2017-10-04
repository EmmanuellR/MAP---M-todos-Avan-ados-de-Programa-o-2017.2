package decorator;

public class Numero extends numeroUm{
	protected numeroUm numeroDecorator;
	
	public Numero (numeroUm numeroDecorator) {
		this.numeroDecorator = numeroDecorator;
	}

}
