package utilidades;

import jugador.Jugador;
import misiones.Mision;
import naves.Nave;
import java.util.ArrayList;
import bodega.Bodega;
import planetas.Planeta;

public class Menu {
	
	/*Antes de mostrar cualquier menú*/
	public void mostrarDatos(Jugador jugador, Nave nave, Bodega bodega){
		System.out.println("");
		System.out.println("------Informacion de la partida-------");
		System.out.println("Nombre jugador: "+jugador.getNombre());
		System.out.println("Energia actual: " +jugador.getEnergia());
		System.out.println("Creditos espaciales: "+jugador.getCreditos());
		System.out.println("Nombre de la nave: " +nave.getNombre());
		System.out.println("Velocidad de la nave: " +nave.getVelocidad());
		System.out.println("Vida de la nave: " + nave.getVida() + "%");
		System.out.println("Capacidad de carga de la nave: " +nave.getCapacidad());
		System.out.println("Carga actual en la bodega: " +bodega.calcularPesoActual());
		System.out.println("-----------------------");
		System.out.println("");	
	}


	public void menuBaseEspacial() {
		System.out.println("");
		System.out.println("------Base espacial-------");
		System.out.println("1- Viajar a un planeta");
		System.out.println("2- Ver bodega de carga");
		System.out.println("3- Vender recursos");
		System.out.println("4- Ver misiones disponibles");
		System.out.println("5- Entregar recursos para mision");
		System.out.println("6- Reparar nave");
		System.out.println("7- Descansar");
		System.out.println("8- Salir");
		System.out.println("-----------------------");
		System.out.println("");	
	}


	public void menuPlaneta(Planeta planeta){
		System.out.println("");
		System.out.println("------Planeta" +planeta.getNombre()+ "-------");
		System.out.println("1- Minar");
		System.out.println("2- Viajar otro planeta");
		System.out.println("3- Volver a la base");
		System.out.println("4- Recursos");
		System.out.println("-----------------------");
		System.out.println("");	
	}
	
    public void mostrarResumenFinal(Jugador jugador, Nave nave, ArrayList<Mision> listaMisiones, String resultado) {
        System.out.println("\n______________________________________________");
        System.out.println("           RESUMEN FINAL DE LA PARTIDA       ");
        System.out.println("Nombre del jugador : " + jugador.getNombre()); 
        System.out.println("Nave utilizada        : " + nave.getNombre());
        System.out.println("Creditos obtenidos    : " + jugador.getCreditos()); 
        
        int misionesCompletadas = 0;
        for (Mision m : listaMisiones) {
            if (m.isCompletada()) {
                misionesCompletadas++;
            }
        }
        System.out.println("Misiones completadas  : " + misionesCompletadas + " / 3");
        
        System.out.println("\nRecursos restantes en la bodega:"); 
        nave.getBodega().mostrarContenido();
        System.out.println("");
        
        if (resultado.equals("Victoria")) {
            System.out.println("GANASTE!!! Lograste reparar la estación espacial!!. ");
        } else if (resultado.equals("Derrota")) {
            System.out.println("PERDISTE. Tu nave fue destruida.");
        } else {
            System.out.println("Saliste voluntariamente de la partida.");
        }
        
        System.out.println("Gracias por jugar");
        System.out.println("______________________________________________\n");
    }
}
