package ExecucaoMusicas;

public abstract class Infantil extends InteracaoUsuario{

	
	String musicasInfantil;
	
	
	public abstract void infantil();{
		System.out.println("Super Fant�stico � A turma do bal�o m�gico\r\n"
				+ "A Galinha magricela � Eliana\r\n"
				+ "Dedinhos - Eliana\r\n"
				+ "Livre Estou � Taryn Szpilman\r\n"
				+ "O patinho colorido � Bento e Tot�\r\n"
				+ "Vestido Azul � Floribella \r\n"
				+ "Uni Duni T� � Trem da Alegria ");
	}
		public String getMusicasInfantil() {
			return musicasInfantil;
		}
		public void setMusicasInfantil(String musicasInfantil) {
			this.musicasInfantil = musicasInfantil;
	}
	
}
