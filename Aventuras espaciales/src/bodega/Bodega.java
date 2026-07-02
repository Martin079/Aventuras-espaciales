package bodega;

import java.util.ArrayList;
import recursos.Recurso;

public class Bodega {

	private ArrayList<Recurso> listaRecursos;
	private int capacidadMaxima;
	
	
	public Bodega(int capacidadMaxima){
		this.listaRecursos = new ArrayList<>();
		this.capacidadMaxima = capacidadMaxima;
	}
	
	public int calcularPesoActual(){
		int pesoTotal=0;
		for(Recurso r : listaRecursos){
			pesoTotal+= r.getPeso();
		}
		return pesoTotal;
	}
	
	public boolean agregarRecurso(Recurso nuevoRecurso){
		if(calcularPesoActual() + nuevoRecurso.getPeso() <= capacidadMaxima){
			listaRecursos.add(nuevoRecurso);
			return true;
		}else{
		System.out.println("No hay suficiente espacio en la bodega para "+ nuevoRecurso.getNombre());
		return false;
		}
	}
	
	public void mostrarContenido(){
		if(listaRecursos.isEmpty()){
			System.out.println("La bodega esta vacia");
		}else{
			System.out.println("");
			System.out.println("-------------------");
			System.out.println("Contenido de la bodega:");
			for(Recurso r : listaRecursos){
				System.out.println("Recurso: " +r.getNombre() + "Peso: " + r.getPeso() + "Valor: " +r.getValorVenta());
			}
		}
	}
	
	public int vaciarBodega(){
		int creditosTotales = 0;
		
		for(Recurso r : listaRecursos){
			creditosTotales+= r.getValorVenta();
		}
		
		listaRecursos.clear();
		
		return creditosTotales;
	}
	
	public int eliminarRecurso(String nombreRecurso, int cantidadAEliminar){
		
		int creditosObtenidos = 0;
		int cantidadEliminada = 0;
		
		java.util.Iterator<Recurso> it = listaRecursos.iterator();
		
		while(it.hasNext() && cantidadEliminada < cantidadAEliminar){
			Recurso r = it.next();
			
			
			if(r.getNombre().equalsIgnoreCase(nombreRecurso)){
				creditosObtenidos += r.getValorVenta();
				it.remove();
				cantidadEliminada++;
			}
		}
		
		return creditosObtenidos;
		
	}
	
	public int contarRecurso(String nombreRecurso){
		int contador = 0;
		for(Recurso r : listaRecursos){
			if(r.getNombre().equalsIgnoreCase(nombreRecurso)){
				contador++;
			}
		}
		
		return contador;
	}
	
}
