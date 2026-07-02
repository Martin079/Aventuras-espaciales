package peligros;

import naves.Nave;
import naves.VelocidadNave;
import utilidades.Aleatorio;

public class PirataEspacial extends Peligro{
	
	public PirataEspacial(){
		super("Pirata espacial");
	}
	
	@Override
	public void aplicarEfecto(Nave nave){
		int danioBase = Aleatorio.generarEntero(3, 15);
		
		if(nave.getVelocidad() == VelocidadNave.ALTA){
			danioBase*=2;
			System.out.println("PIRATAS ESPACIALES: Como la nave es velocidad alta se duplica el danio");
		}else{
			System.out.println("PIRATAS ESPACIALES: Atacaron tu nave");
		}
		
		nave.recibirDanio(danioBase);
		System.out.println("La nave "+nave.getNombre()+ " recibio " +danioBase+ "% de danio");
	}
	
	
}
