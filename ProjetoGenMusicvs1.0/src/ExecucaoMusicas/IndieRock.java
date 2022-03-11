package ExecucaoMusicas;

public abstract class IndieRock  extends InteracaoUsuario{
	
	String musicasIndieRock;
	
	public abstract void indieRock();{
		System.out.println("MGMT - Electric Feel\r\n"
				+ "Arctic Monkeys - When The Sun Goes Down\r\n"
				+ "Arctic Monkeys - Arabela\r\n"
				+ "The Kooks - Bad Habit\r\n"
				+ "The Black Keys - Lonely Boy\r\n"
				+ "Foster The People - Helena Beat");
		
	}
		public String getMusicasIndieRock() {
			return musicasIndieRock;
		}
		public void setMusicasIndieRock(String musicasIndieRock) {
			this.musicasIndieRock = musicasIndieRock;
		}
	
}