/*1. Fénix
Velocidad: alta
Capacidad de carga: 50 toneladas
Vida inicial: 100%*/

package naves;


public class Fenix extends Nave{
	
	public Fenix(){
	super(
			"Fenix",
			50,
			new VelocidadNave[] {VelocidadNave.ALTA}			
	);
	}
}
