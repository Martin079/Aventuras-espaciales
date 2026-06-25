package planetas;

import recursos.*;
import utilidades.Aleatorio;

public class Rocoso extends Planeta{


	public Rocoso(){
		super("Rocoso");
	}

	@Override
	public Recurso minar() {
		int probabilidad = Aleatorio.generarEntero(1, 100);
		
		if(probabilidad<=60){
			return new MineralComun();
		}else if(probabilidad<=85){
			return new Cristal();
		}else{
			return new NucleoEnergetico();
		}
		
	}
	
	

	
}
