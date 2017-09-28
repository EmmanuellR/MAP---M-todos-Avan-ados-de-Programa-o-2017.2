package exercicioVIAdapter;

public class ImagemAdapter implements ImagemTarget {
	private Imagem imagem;

	public ImagemAdapter(Imagem recente) {
		// TODO Auto-generated constructor stub
		this.setImagem(recente);
	}

	@Override
	public void carregarImagem() {
		// TODO Auto-generated method stub
		this.carregarImagem();
	}

	@Override
	public void desenharImagem() {
		// TODO Auto-generated method stub
		this.desenharImagem();
	}

	public Imagem getImagem() {
		return imagem;
	}

	public void setImagem(Imagem imagem) {
		this.imagem = imagem;
	}

}
