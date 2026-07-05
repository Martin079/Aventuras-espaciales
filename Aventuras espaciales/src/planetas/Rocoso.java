package planetas;

import recursos.*;
import utilidades.Aleatorio;

public class Rocoso extends Planeta{

	@Override
    public void mostrarRecursosDisponibles() {
        System.out.println("Recursos disponibles en el planeta rocoso:");
        System.out.println("Mineral común: 60%");
        System.out.println("Cristal: 25%"); 
        System.out.println("Nucleo energetico: 15%");
    }

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
