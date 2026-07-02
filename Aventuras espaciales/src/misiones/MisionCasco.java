package misiones;

import bodega.Bodega;

public class MisionCasco extends Mision {

	public MisionCasco(){
		super("Reparar casco exterior",120);
	}
	
	@Override
	public boolean puedeCompletarse(Bodega bodega){
		return bodega.contarRecurso("Mineral Comun") >=3 && bodega.contarRecurso("Cristal")>=1;
	}
	
	@Override
	public void descontarRecursos(Bodega bodega){
		bodega.eliminarRecurso("Mineral Comun", 3);
		bodega.eliminarRecurso("Cristal", 1);
	}
	
	@Override
	public void mostrarRequisitos(Bodega bodega){
		System.out.println("Requisitos: 3 Mineral comun (Tenes: " +bodega.contarRecurso("Mineral Comun")+") y 1 Cristal (Tenes: "+bodega.contarRecurso("Cristal")+")" );
	}
	
}
