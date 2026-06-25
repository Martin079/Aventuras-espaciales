package planetas;

import recursos.*;
import utilidades.Aleatorio;

public class Volcanico extends Planeta{

	public Volcanico(){
		super("Volcanico");
	}

	@Override
	public Recurso minar() {
		int probabilidad = Aleatorio.generarEntero(1, 100);
		
		if(probabilidad<=50){
			return new Lava();
		}else if(probabilidad<=80){
			return new Obsidiana();
		}else{
			return new NucleoEnergetico();
		}
	}
	
	
}
