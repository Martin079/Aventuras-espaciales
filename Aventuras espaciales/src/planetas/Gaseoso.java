package planetas;

import recursos.*;
import utilidades.Aleatorio;

public class Gaseoso extends Planeta{

		@Override
    public void mostrarRecursosDisponibles() {
        System.out.println("Recursos disponibles en el planeta gaseoso:");
        System.out.println("Gas: 60%");
        System.out.println("Plasma: 25%");
        System.out.println("Cristal: 15%");
    }

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
