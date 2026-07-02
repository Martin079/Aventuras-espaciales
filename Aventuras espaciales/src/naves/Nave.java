package naves;

import 	bodega.Bodega;


public class Nave {

	private String nombre;
	private int vida=100;
	private int capacidad;
	private VelocidadNave velocidad;
	private Bodega bodega;
	
	
	protected Nave(String nombre, int capacidad, VelocidadNave velocidad){
		this.nombre=nombre;
		this.capacidad=capacidad;
		this.velocidad=velocidad;		
		this.bodega= new Bodega(capacidad);
	}
	
	//getters
	public String getNombre(){
		return nombre;
	}
	
	public VelocidadNave getVelocidad(){
		return velocidad;
	}
	
	public int getCapacidad(){
		return capacidad;
	}
	
	public int getVida(){
		return vida;
	}
	
	//funciones
	
	public void recibirDanio(int cantidad){
		this.vida -=cantidad;
		if(this.vida<0){
			this.vida=0;
		}
	}
	
	public void repararNave(int cantidad){
		this.vida+=cantidad;
		if(this.vida>100){
			this.vida=100;
		}
	}
}