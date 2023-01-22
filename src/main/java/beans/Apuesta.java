package beans;

public class Apuesta {
	
	private String apostante, administrador;
	int[] jugador= new int[6];
	int reintegro;
	public Apuesta(String apostante, String administrador, int[] jugador, int reintegro) {
		this.apostante = apostante;
		this.administrador = administrador;
		if(jugador.length==6) {
			this.jugador = jugador;
		}
		else {
			
		}
		
		this.reintegro = reintegro;
		
		
	}
	
	
	
}
