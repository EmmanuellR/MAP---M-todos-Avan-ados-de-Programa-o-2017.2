package decorator;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colchetes colchetes = new Colchetes(new numeroUm());
		colchetes.saida();
		
		Chave chave = new Chave(new numeroUm());
		chave.saida();
		
		Parentese parentese = new Parentese(new numeroUm());
		parentese.saida();

	}

}
