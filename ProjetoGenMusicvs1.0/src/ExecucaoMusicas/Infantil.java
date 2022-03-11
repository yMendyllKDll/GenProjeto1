package ExecucaoMusicas;

public abstract class Infantil extends InteracaoUsuario{

	
	String musicasInfantil;
	
	
	public abstract void infantil();{
		System.out.println("Super Fantástico – A turma do balão mágico\r\n"
				+ "A Galinha magricela – Eliana\r\n"
				+ "Dedinhos - Eliana\r\n"
				+ "Livre Estou – Taryn Szpilman\r\n"
				+ "O patinho colorido – Bento e Totó\r\n"
				+ "Vestido Azul – Floribella \r\n"
				+ "Uni Duni Tê – Trem da Alegria ");
	}
		public String getMusicasInfantil() {
			return musicasInfantil;
		}
		public void setMusicasInfantil(String musicasInfantil) {
			this.musicasInfantil = musicasInfantil;
	}
	
}
