package ExecucaoMusicas;

public abstract class Pop  extends InteracaoUsuario  {
	
	String musicasPop;
	
	public abstract void pop();{
		System.out.println("The Kid LAROI - STAY\r\n"
				+ "Sub Urban - Cradles\r\n"
				+ "Rihanna - Stay\r\n"
				+ "Lil Nas X - MONTERO\r\n"
				+ "Sub Urban - Freak\r\n");	
		
	}
		public String getMusicasPop() {
			return musicasPop;
		}
		public void setMusicasPop(String musicasPop) {
			this.musicasPop = musicasPop;
	}
}
