package misiones;

import bodega.Bodega;
import recursos.Gas;
import recursos.Plasma;

public class MisionReactor extends Mision {

	public MisionReactor(){
		super("Estabilizacion del reactor",170);
	}
	
	@Override
	public boolean puedeCompletarse(Bodega bodega){
		return bodega.contarRecurso(Gas.class) >=2 && bodega.contarRecurso(Plasma.class)>=1;
	}
	
	@Override
	public void descontarRecursos(Bodega bodega){
		bodega.eliminarRecurso(Gas.class, 2);
		bodega.eliminarRecurso(Plasma.class, 1);
	}
	
	@Override
	public void mostrarRequisitos(Bodega bodega){
		System.out.println("Requisitos: 2 Gases (Tenes: " +bodega.contarRecurso(Gas.class)+") y 1 Plasma (Tenes: "+bodega.contarRecurso(Plasma.class)+")" );
	}

}
