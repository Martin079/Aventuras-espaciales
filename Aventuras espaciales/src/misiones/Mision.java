package misiones;

import bodega.Bodega;
import jugador.Jugador;

public abstract class Mision {
	
	private String nombre; 
	private int recompensa;
	private boolean completada;
	
	public Mision(String nombre, int recompensa){
		this.nombre=nombre;
		this.recompensa=recompensa;
		this.completada=false;
	}
	
	
		public abstract boolean puedeCompletarse(Bodega bodega);
		public abstract void descontarRecursos(Bodega bodega);
		public abstract void mostrarRequisitos(Bodega bodega);
		
		public boolean entregarMision(Bodega bodega, Jugador jugador){
			if(completada){
				System.out.println("La mision ya fue completada");
				return false;
			}
			
			if(puedeCompletarse(bodega)){
				descontarRecursos(bodega);
				jugador.sumarCreditos(recompensa);
				this.completada=true;
				System.out.println("Mision " +nombre+ "completada, recibiste " +recompensa+" creditos");
				return true;
			}else{
				System.out.println("No tenes los recursos necesarios para " +nombre);
				return false;
			}
		}
		
		public String getNombre(){
			return nombre;
		}
		
		public boolean isCompletada(){
			return completada;
		}
		
		public void mostrarDetalles(Bodega bodega){
			String estado= completada? "COMPLETADA" : "PENDIENTE";
			System.out.println(" Mision: " +nombre+ " " +estado);
			mostrarRequisitos(bodega);
			System.out.println("Recompensa " +recompensa+ " creditos");
		}

}
