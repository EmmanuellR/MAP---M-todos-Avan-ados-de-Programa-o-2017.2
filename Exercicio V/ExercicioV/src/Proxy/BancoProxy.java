package Proxy;

public class BancoProxy implements BancoUsuarios{
	
	protected String usuario, senha;
	private Cliente usuarios;

	public BancoProxy(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	@Override
	public String getNumeroDeUsuarios() {
		if(this.temPermissaoDeAcesso()) {
			return new String("Total de Clientes conectados: " + this.usuarios.getQuantidadeDeUsuarios());
		}
		return null;
	}

	@Override
	public String getUsuariosConectados() {
		if(this.temPermissaoDeAcesso()) {
			return new String("Clientes conectados: " + this.usuarios.getUsuariosConectados());
		}
		return null;
	}

	private boolean temPermissaoDeAcesso() {
		return usuario == "admin" && senha == "admin";
	}

	public Cliente getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Cliente usuarios) {
		this.usuarios = usuarios;
	}
	

}
