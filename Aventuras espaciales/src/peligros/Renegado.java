package peligros;

import naves.Nave;
import naves.VelocidadNave;
import utilidades.Aleatorio;

public class Renegado extends Peligro{
	
	public Renegado(){
		super("Renegado");
	}
	
	@Override
	public void aplicarEfecto(Nave nave){
		int danioBase = Aleatorio.generarEntero(3, 15);
		
		if(nave.getVelocidad() == VelocidadNave.BAJA){
			danioBase*=2;
			System.out.println("RENEGADO: Como la nave es velocidad baja se duplica el danio");
		}else{
			System.out.println("RENEGADO: Atacaron tu nave");
		}
		
		nave.recibirDanio(danioBase);
		System.out.println("La nave "+nave.getNombre()+ " recibio " +danioBase+ "% de danio");
	}
	

}
