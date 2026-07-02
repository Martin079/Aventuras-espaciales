package peligros;

import naves.Nave;

public abstract class Peligro {
	
	private String nombre;
	
	public Peligro(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return nombre;
	} 
	
	
	public abstract void aplicarEfecto(Nave nave);

}
