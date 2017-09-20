package classesHeranca;

public class Aviao extends Transporte{
	private String Prefixo;
	private int numTurbinas;
	
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
	
	

}
