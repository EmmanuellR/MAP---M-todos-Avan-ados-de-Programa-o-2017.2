package decorator;

public class Chave extends Numero{

	public Chave(numeroUm numeroDecorator) {
		super(numeroDecorator);
		// TODO Auto-generated constructor stub
	}
	public void saida () {
		String impressao = Chaves();
		numeroDecorator.impessao(impressao);
	}
	private String Chaves() {
		// TODO Auto-generated method stub
		String chaveAberta = "{";
		String chaveFechada = "}";
		
		return chaveAberta + 1 + chaveFechada;
	}

}
