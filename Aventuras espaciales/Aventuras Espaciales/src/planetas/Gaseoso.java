package planetas;

import recursos.*;
import utilidades.Aleatorio;

public class Gaseoso extends Planeta{

	public Gaseoso(){
		super("Gaseoso");
	}

	@Override
	public Recurso minar() {
		int probabilidad = Aleatorio.generarEntero(1, 100);
		
		if(probabilidad<=60){
			return new Gas();
		}else if(probabilidad<=85){
			return new Plasma();
		}else{
			return new Cristal();
		}
	}
	
	
	
}
