package naves;

public enum VelocidadNave {
	BAJA(60),
	MEDIA(40), 
	ALTA(20);
	
	private final int probabilidadPeligro;
	
	VelocidadNave(int probabilidadPeligro){
		this.probabilidadPeligro=probabilidadPeligro;
	}
	
	public int getProbabilidadPeligro(){
		return probabilidadPeligro;
	}
}
