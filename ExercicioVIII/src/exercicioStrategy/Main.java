package exercicioStrategy;

public class Main {
	public static void main (String[] args) {
		
		Funcionario func1 = new Funcionario(EnumerationCargo.DBA, 1000, 1);
		System.out.println(func1.getCargo().calcularGratificacao(func1));
		
		Funcionario func2 = new Funcionario(EnumerationCargo.DESENVOLVEDOR,1000,3);
		System.out.println(func2.getCargo().calcularGratificacao(func2));
		
		Funcionario func3 = new Funcionario(EnumerationCargo.GERENTE, 1000, 1);
		System.out.println(func3.getCargo().calcularGratificacao(func3));
		
		Funcionario func4 = new Funcionario(EnumerationCargo.LIDER, 1000, 1);
		System.out.println(func4.getCargo().calcularGratificacao(func4));

		
}
}