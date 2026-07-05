package planetas;

import recursos.*;
import utilidades.Aleatorio;

public class Volcanico extends Planeta{

	@Override
    public void mostrarRecursosDisponibles() {
        System.out.println("Recursos disponibles en el planeta Volcanico:");
        System.out.println("Lava: 50%");
        System.out.println("Obsidiana: 30%");
        System.out.println("Nucleo energético: 20%");
    }

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
