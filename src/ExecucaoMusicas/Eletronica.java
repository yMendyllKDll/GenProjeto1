package ExecucaoMusicas;

public abstract class Eletronica  extends InteracaoUsuario {
	
	String musicasEletronica;
	
	public abstract void eletronica();
	{
		System.out.println("Love Tonight - David Guetta\r\n"
				+ " Pressure -  Martin Garrix e Tove lo\r\n"
				+ "Alive and Feeling Fine - The Suncatchers\r\n"
				+ " Faded - Alan Walker\r\n"
				+ "Lean On - Major Lazer, MØ, DJ Snake\r\n"
				+ "Titanium- David Guetta");
		
	}
			public String getMusicasEletronica() {
				return musicasEletronica;
			}
			public void setMusicasEletronica(String musicasEletronica) {
				this.musicasEletronica = musicasEletronica;
	}
}
	
