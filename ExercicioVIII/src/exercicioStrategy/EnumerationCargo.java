package exercicioStrategy;

public enum EnumerationCargo implements Gratificacao{
	
	DBA{
		@Override
		public double calcularGratificacao(Funcionario umfuncionario) {
			if (umfuncionario.getNivel() >= 2) {
	              return umfuncionario.getSalarioBase() * 1.30;
	          }
	          return umfuncionario.getSalarioBase() * 1.20;
		}
	},
	
	DESENVOLVEDOR{
		@Override
        public double calcularGratificacao(Funcionario umFuncionario) {
              if (umFuncionario.getNivel() >= 2) {
                  return umFuncionario.getSalarioBase() * 1.25;
              }
              return umFuncionario.getSalarioBase() * 1.15;
		}
		
	},
	
	GERENTE{
		@Override
		public double calcularGratificacao(Funcionario umFuncionario) {
	          if (umFuncionario.getNivel() >= 2) {
	              return umFuncionario.getSalarioBase() * 1.45;
	          }
	          return umFuncionario.getSalarioBase() * 1.30;
		}
		
	},
	
	LIDER{
		@Override
		public double calcularGratificacao(Funcionario umFuncionario) {
	          if (umFuncionario.getNivel() >= 2) {
	              return umFuncionario.getSalarioBase() * 1.35;
	          }
	          return umFuncionario.getSalarioBase() * 1.25;
		}
		
	};
}
