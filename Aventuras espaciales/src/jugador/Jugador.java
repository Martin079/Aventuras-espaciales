
package jugador;

public class Jugador {
	private String nombre; 
	private int energia=100;
	private int creditos = 0;
	
	public Jugador(String nombre){
		this.nombre=nombre;
	}
	
	

	//getters
	public String getNombre(){
		return nombre;
	}
	
	public int getEnergia(){
		return energia;
	}
	
	public int getCreditos(){
		return creditos;
	}
	
	
	//funciones
	public void descansar(){
		energia=100;
	}
	
	public void sumarCreditos(int cantidad){
		creditos+=cantidad;
	}
	
	public void restarCreditos(int cantidad){
		creditos-=cantidad;
	}
	public void restarEnergia(int cantidad) {
        this.energia -= cantidad;
        if (this.energia < 0) {
            this.energia = 0;
        }
    }
}





