package exercicioStrategy;

public class Funcionario {
		
	private Gratificacao cargo;
	protected double salarioBase;
    protected int nivel;
   
    
    
public Funcionario( Gratificacao cargo,double salarioBase, int nivel) {
	this.cargo = cargo;
	this.salarioBase = salarioBase;
	this.nivel = nivel;
	}



public Gratificacao getCargo() {
	return cargo;
}



public void setCargo(Gratificacao cargo) {
	this.cargo = cargo;
}



public double getSalarioBase() {
	return salarioBase;
}



public void setSalarioBase(double salarioBase) {
	this.salarioBase = salarioBase;
}



public int getNivel() {
	return nivel;
}



public void setNivel(int nivel) {
	this.nivel = nivel;
}





}
