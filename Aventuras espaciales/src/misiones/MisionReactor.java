package misiones;

import bodega.Bodega;

public class MisionReactor extends Mision {

	public MisionReactor(){
		super("Estabilizacion del reactor",170);
	}
	
	@Override
	public boolean puedeCompletarse(Bodega bodega){
		return bodega.contarRecurso("Gas") >=2 && bodega.contarRecurso("Plasma")>=1;
	}
	
	@Override
	public void descontarRecursos(Bodega bodega){
		bodega.eliminarRecurso("Gas", 2);
		bodega.eliminarRecurso("Plasma", 1);
	}
	
	@Override
	public void mostrarRequisitos(Bodega bodega){
		System.out.println("Requisitos: 2 Gases (Tenes: " +bodega.contarRecurso("Gas")+") y 1 Plasma (Tenes: "+bodega.contarRecurso("Plasma")+")" );
	}

}
