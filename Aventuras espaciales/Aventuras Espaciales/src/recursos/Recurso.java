package recursos;

public class Recurso {

	private String nombre;
	private int peso;
	private int valorVenta;
	
	protected Recurso(String nombre, int peso, int valorVenta){
		this.nombre=nombre;
		this.peso=peso;
		this.valorVenta=valorVenta;
	}
}
