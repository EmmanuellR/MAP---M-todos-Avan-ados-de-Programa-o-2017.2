package classesComposicao;

public class Aviao {
	private String Prefixo;
	private int numTurbinas;
	private Transporte transporte;
	
	public String getPrefixo() {
		return Prefixo;
	}
	public void setPrefixo(String prefixo) {
		Prefixo = prefixo;
	}
	public int getNumTurbinas() {
		return numTurbinas;
	}
	public void setNumTurbinas(int numTurbinas) {
		this.numTurbinas = numTurbinas;
	}
	public Transporte getTransporte() {
		return transporte;
	}
	public void setTransporte(Transporte transporte) {
		this.transporte = transporte;
	}
	
	

}
