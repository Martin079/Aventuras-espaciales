package misiones;

import bodega.Bodega;
import recursos.Cristal;
import recursos.MineralComun;

public class MisionCasco extends Mision {

	public MisionCasco(){
		super("Reparar casco exterior",120);
	}
	
	@Override
	public boolean puedeCompletarse(Bodega bodega){
		return bodega.contarRecurso(MineralComun.class) >=3 && bodega.contarRecurso(Cristal.class)>=1;
	}
	
	@Override
	public void descontarRecursos(Bodega bodega){
		bodega.eliminarRecurso(MineralComun.class, 3);
		bodega.eliminarRecurso(Cristal.class, 1);
	}
	
	@Override
	public void mostrarRequisitos(Bodega bodega){
		System.out.println("Requisitos: 3 Mineral comun (Tenes: " +bodega.contarRecurso(MineralComun.class)+") y 1 Cristal (Tenes: "+bodega.contarRecurso(Cristal.class)+")" );
	}
	
}
