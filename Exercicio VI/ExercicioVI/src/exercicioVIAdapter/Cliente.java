package exercicioVIAdapter;

public class Cliente {
	public static void main(String[] args) {
		Imagem recente = new ImagemPNG();
		ImagemTarget imagem = new ImagemAdapter(recente);
		recente.carregarImagem();
		imagem.carregarImagem();
	}
}
