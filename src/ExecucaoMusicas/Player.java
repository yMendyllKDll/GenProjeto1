package ExecucaoMusicas;

public interface Player {
	
	public abstract void iniciar();
	public abstract void play();
	public abstract void pause();
	public abstract void upVolume();
	public abstract void downVolume();
	public abstract void proximaMusica();
	public abstract void musicaAnterior();
	public abstract void finalizarServiço();
	
	
}