package ExecucaoMusicas;

public abstract class Samba extends InteracaoUsuario{
	
	String musicasSamba;
	
	public abstract void samba();{
		System.out.println(""
				+ "O show tem que continuar - Fundo de quintal\r\n"
				+ "Tá escrito -  Xande de pilares\r\n"
				+ "Verdade - Zeca Pagodinho\r\n"
				+ "O meu lugar - Arlindo Cruz\r\n"
				+ "Espelho - João Nogueira\r\n"
				+ "Deixa a vida me levar - Zeca Pagodinho");
	
		
	}
		public String getMusicasSamba() {
			return musicasSamba;
		}
		public void setMusicasSamba(String musicasSamba) {
			this.musicasSamba = musicasSamba;
		
		
	}
}
