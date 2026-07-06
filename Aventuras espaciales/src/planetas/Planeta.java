package planetas;
import recursos.Recurso;

public abstract class Planeta {
	
	private String nombre;
	
	public Planeta(String nombre){
		this.nombre=nombre;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public abstract Recurso minar();
	
	public abstract void mostrarRecursosDisponibles();
	
	
}
