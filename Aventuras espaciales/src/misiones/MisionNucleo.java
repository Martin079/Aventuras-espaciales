package misiones;

import bodega.Bodega;
import recursos.NucleoEnergetico;
import recursos.Obsidiana;

public class MisionNucleo extends Mision {

	public MisionNucleo(){
		super("Nucleo de energía principal",250);
	}
	
	@Override
	public boolean puedeCompletarse(Bodega bodega){
		return bodega.contarRecurso(NucleoEnergetico.class) >=1 && bodega.contarRecurso(Obsidiana.class)>=2;
	}
	
	@Override
	public void descontarRecursos(Bodega bodega){
		bodega.eliminarRecurso(NucleoEnergetico.class, 1);
		bodega.eliminarRecurso(Obsidiana.class, 2);
	}
	
	@Override
	public void mostrarRequisitos(Bodega bodega){
		System.out.println("Requisitos: Nucleo energetico (Tenes: " +bodega.contarRecurso(NucleoEnergetico.class)+") y 1 Obsidiana (Tenes: "+bodega.contarRecurso(Obsidiana.class)+")" );
	}

}
