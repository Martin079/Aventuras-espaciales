package peligros;

import naves.Nave;
import naves.VelocidadNave;
import utilidades.Aleatorio;

public class TormentaCosmica extends Peligro{
	
	public TormentaCosmica(){
		super("Tormenta Cosmica");
	}
	
	@Override
	public void aplicarEfecto(Nave nave){
		int danioBase = Aleatorio.generarEntero(5, 20);
		
		System.out.println("TORMENTA COSMICA: tu nave es daniada");
		
		
		nave.recibirDanio(danioBase);
		System.out.println("La nave "+nave.getNombre()+ " recibio " +danioBase+ "% de danio");
	}
	

}
