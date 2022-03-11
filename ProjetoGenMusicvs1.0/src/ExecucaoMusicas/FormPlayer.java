package ExecucaoMusicas;

public class FormPlayer implements Player {

	private int upVolume = 0;
	private boolean proximaMusica, iniciar, play;

	@Override
	public void iniciar() {
		System.out.println("Seja bem vinde ao GenPlay! Aproveite a melhor biblioteca desse bootcamp.");

	}

	@Override
	public void play() {
		this.play = true;
		System.out.println(" ►♫ "); // associar a musica escolhida aqui para printar//

	}

	@Override
	public void pause() {
		this.play = false;
		System.out.println(" ■ ");
	}

	public int getUpVolume() {
		return upVolume;
	}

	public void setUpVolume(int upVolume) {
		this.upVolume = upVolume;
	}

	public boolean isProximaMusica() {
		return proximaMusica;
	}

	public void setProximaMusica(boolean proximaMusica) {
		this.proximaMusica = proximaMusica;
	}

	public boolean isIniciar() {
		return iniciar;
	}

	public void setIniciar(boolean iniciar) {
		this.iniciar = iniciar;
	}

	public boolean isPlay() {
		return play;
	}

	public void setPlay(boolean play) {
		this.play = play;
	}

	@Override
	public void upVolume() {
		this.upVolume++;
		System.out.println(" ▲ ");
	}

	@Override
	public void downVolume() {
		this.upVolume--;
		System.out.println(" ▼ ");
	}

	@Override
	public void proximaMusica() {
		this.proximaMusica = true;
		System.out.println(" ► proxima música "); // associar a musica escolhida aqui para printar//
	}

	@Override
	public void musicaAnterior() {
		this.proximaMusica = false;
		System.out.println(" ◄ música anterior "); // associar a musica escolhida aqui para printar//
	}

	@Override
	public void finalizarServiço() {
		this.iniciar = false;
		System.out.println(" ✪ até breve! ");

	}

}