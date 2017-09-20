package Proxy;

public class Cliente{
	
	private int quantidadeDeUsuarios;
	private int usuariosConectados;
	
	public Cliente() {
		quantidadeDeUsuarios = (int) (Math.random() * 100);
		usuariosConectados = (int) (Math.random() * 10);
	}
	public int getQuantidadeDeUsuarios() {
		return quantidadeDeUsuarios;
	}
	public void setQuantidadeDeUsuarios(int quantidadeDeUsuarios) {
		this.quantidadeDeUsuarios = quantidadeDeUsuarios;
	}
	public int getUsuariosConectados() {
		return usuariosConectados;
	}
	public void setUsuariosConectados(int usuariosConectados) {
		this.usuariosConectados = usuariosConectados;
	}
	
}
