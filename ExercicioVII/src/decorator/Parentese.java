package decorator;

public class Parentese extends Numero{

	public Parentese(numeroUm numeroDecorator) {
		super(numeroDecorator);
		// TODO Auto-generated constructor stub
	}
	public void saida () {
		String impressao = Parenteses();
		numeroDecorator.impessao(impressao);
	}
	private String Parenteses() {
		// TODO Auto-generated method stub
		String parentesesAberta = "(";
		String parentesesFechada = ")";
		
		return parentesesAberta + 1 + parentesesFechada;
	}

}
