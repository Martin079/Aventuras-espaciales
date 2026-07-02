package misiones;

import bodega.Bodega;

public class MisionNucleo extends Mision {

	public MisionNucleo(){
		super("Nucleo de energía principal",250);
	}
	
	@Override
	public boolean puedeCompletarse(Bodega bodega){
		return bodega.contarRecurso("Nucleo Energetico") >=1 && bodega.contarRecurso("Obsidiana")>=2;
	}
	
	@Override
	public void descontarRecursos(Bodega bodega){
		bodega.eliminarRecurso("Nucleo Energetico", 1);
		bodega.eliminarRecurso("Obsidiana", 2);
	}
	
	@Override
	public void mostrarRequisitos(Bodega bodega){
		System.out.println("Requisitos: Nucleo energetico (Tenes: " +bodega.contarRecurso("Nucleo Energetico")+") y 1 Obsidiana (Tenes: "+bodega.contarRecurso("Obsidiana")+")" );
	}

}
