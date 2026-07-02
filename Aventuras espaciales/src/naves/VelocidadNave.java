package naves;

public enum VelocidadNave {
	BAJA(60),
	MEDIA(40), 
	ALTA(20);
	
	private final int pobabilidadPeligro;
	
	VelocidadNave(int probabilidadPeligro){
		this.pobabilidadPeligro=probabilidadPeligro;
	}
	
	public int getProbabilidadPeligro(){
		return pobabilidadPeligro;
	}
}
