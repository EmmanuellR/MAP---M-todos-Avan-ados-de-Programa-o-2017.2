package decorator;

public class Colchetes extends Numero{

	public Colchetes(numeroUm numeroDecorator) {
		super(numeroDecorator);
		// TODO Auto-generated constructor stub
	}
	public void saida () {
		String impressao = Colchete();
		numeroDecorator.impessao(impressao);
	}
	private String Colchete() {
		// TODO Auto-generated method stub
		String colcheteAberta = "[";
		String colcheteFechada = "]";
		
		return colcheteAberta + 1 + colcheteFechada;
	}


}
