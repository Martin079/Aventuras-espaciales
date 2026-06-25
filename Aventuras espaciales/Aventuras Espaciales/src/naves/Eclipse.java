/*2. Eclipse
Velocidad: media
Capacidad de carga: 100 toneladas
Vida inicial: 100%*/

package naves;

public class Eclipse extends Nave{
	
	public Eclipse(){
	super(
			"Eclipse",
			100,
			new VelocidadNave[] {VelocidadNave.MEDIA}			
	);
	}

}
