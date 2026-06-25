/*La nave comenzará con:
• vida al 100%;
• una bodega vacía para transportar recursos.
El usuario deberá elegir una nave espacial:
*/

/*velocidad  nave en enum. 
 * Cada valor del enum deberá tener asociada
la probabilidad de que ocurra un peligro espacial durante un viaje??? (que es??).*/
package naves;

public class Nave {

	private String nombre;
	private int vida=100;
	private int capacidad;
	private VelocidadNave[] velocidad;
	
	
	protected Nave(String nombre, int capacidad, VelocidadNave[] velocidad){
		this.nombre=nombre;
		this.capacidad=capacidad;
		this.velocidad=velocidad;		
	}
}




/*-----La opción reparar nave permite recuperar vida de la nave. Cada 10% de vida reparada cuesta 25 créditos espaciales.
El jugador deberá indicar cuántos tramos de 10% desea reparar. No se puede reparar por encima del 100% de vida. Si
el jugador no tiene créditos suficientes, no podrá reparar la nave.*/