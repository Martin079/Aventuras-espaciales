package peligros;

import naves.Nave;
import utilidades.Aleatorio;

public class GestorPeligros {

	public static void evaluarPeligroViaje(Nave nave){
		
		int probabilidadPeligro = nave.getVelocidad().getProbabilidadPeligro();
		
		int numeroProbabilidad = Aleatorio.generarEntero(0, 100);
		
		if(numeroProbabilidad<=probabilidadPeligro){
			
			System.out.println("");
			System.out.println("-------------------------");
			System.out.println("Se aproxima un peligro!!");
			
			int tipoPeligro = Aleatorio.generarEntero(1, 3);
			Peligro peligroOcurrido;
			
			switch(tipoPeligro){
			case 1:
				peligroOcurrido = new PirataEspacial();
				break;
				
			case 2:
				peligroOcurrido = new Renegado();
				break;
			
			default:
				peligroOcurrido = new TormentaCosmica();
				break;
			
			}
			
			peligroOcurrido.aplicarEfecto(nave);		
			
		}else{
			System.out.println("El viaje se realizo con exito");
		}
		
	}
	
}
