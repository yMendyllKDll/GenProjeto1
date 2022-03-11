package ExecucaoMusicas;

public abstract class HeavyMetal  extends InteracaoUsuario{
	
	
	String musicasHeavyMetal;

	
	public abstract void heavyMetal();{
		
		System.out.println("The Scarecrow - Avantasia\r\n"
				+ "The Clansman - Iron Maiden\r\n"
				+ "Senjutsu - Iron Maiden\r\n"
				+ "Wuthering Heights - Angra\r\n"
				+ "A Tale That Wasn’t Right - Helloween\r\n");
	}
		public String getMusicasHeavyMetal() {
			return musicasHeavyMetal;
		}
	
		public void setMusicasHeavyMetal(String musicasHeavyMetal) {
			this.musicasHeavyMetal = musicasHeavyMetal;
	}
	
	
}

