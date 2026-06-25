package planetas;
import recursos.Recurso;

public abstract class Planeta {
	
	private String nombre;
	
	public Planeta(String nombre){
		this.nombre=nombre;
	}
	
	public abstract Recurso minar();
}
