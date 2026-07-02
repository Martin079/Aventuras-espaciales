import utilidades.Menu;
import jugador.Jugador;
import naves.Nave;
import utilidades.Entrada;
import bodega.Bodega;

public class Main {

	public static void main(String[] args) {
		
		/*falta ingresar nombre y elegir nave. hasta que no este da error*/
		
		Menu menu = new Menu();
		boolean jugando = true;

		
		while (jugando) {
		
		    Jugador jugador = null;
			Nave nave = null;
			Entrada entrada = null; 
			Bodega bodega = null;
			
			menu.mostrarDatos(jugador, nave, bodega);;
		    
		    menu.menuBaseEspacial();
		    
		    int opcion = entrada.ingresarEntero(0, 8);
		    
		    switch (opcion) {
		        case 1:
		           //viaje
		            break;
		        case 2:
		            bodega.mostrarContenido();
		            break;
		        case 3:
		            //venta
		            break;
		        case 7:
		            jugador.descansar();
		            break;
		        case 8:
		            System.out.println("Saliendo del juego...");
		            jugando = false;
		            break;
		    }
		}

	}

}
