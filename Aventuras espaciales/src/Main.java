import java.util.ArrayList;

import utilidades.Menu;
import utilidades.Entrada;
import jugador.Jugador;
import bodega.Bodega;
import naves.Nave;
import naves.Fenix;
import naves.Eclipse;
import naves.Galaxian;
import misiones.Mision;
import misiones.MisionCasco;
import misiones.MisionReactor;
import misiones.MisionNucleo;
import planetas.*;
import recursos.*;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Entrada entrada = new Entrada(); 
        
        System.out.println("Ingresa tu nombre:");
        String nombreUsuario = entrada.ingresarTexto();
        Jugador jugador = new Jugador(nombreUsuario);

        System.out.println("Elige tu nave espacial:");
        System.out.println("1. Fenix (Rapida, 50t carga)");
        System.out.println("2. Eclipse (Media, 100t carga)");
        System.out.println("3. Galaxian (Lenta, 150t carga)");
        int opcionNave = entrada.ingresarEntero(1, 3);

        Nave nave = null;

        if (opcionNave == 1) {
            nave = new Fenix();
        } else if (opcionNave == 2) {
            nave = new Eclipse();
        } else {
            nave = new Galaxian();
        }

        Bodega bodega = nave.getBodega();

        ArrayList<Mision> listaMisiones = new ArrayList<>();
        listaMisiones.add(new MisionCasco());
        listaMisiones.add(new MisionReactor());
        listaMisiones.add(new MisionNucleo());

        boolean jugando = true;
        
        String resultadoFinal = "Salida voluntaria";

        while(jugando) {
        	
        	if (nave.getVida() <= 0) { // 
                resultadoFinal = "Derrota";
                jugando = false;
                break;
            }
            
            boolean todasCompletadas = true;
            for (Mision m : listaMisiones) {
                if (!m.isCompletada()) {
                    todasCompletadas = false;
                    break;
                }
            }
            
            if (todasCompletadas) {
                resultadoFinal = "Victoria"; // 
                jugando = false;
                break;
            }        	
        	
            menu.mostrarDatos(jugador, nave, bodega);;
            menu.menuBaseEspacial();
            int opcion = entrada.ingresarEntero(1, 8); 
            
            switch (opcion) {
            case 1:
               
                String estadoViaje = controladores.GestorViajes.gestionarViaje(jugador, nave, bodega, entrada, menu);
                
                if (estadoViaje.equals("Derrota")) {
                    resultadoFinal = "Derrota";
                    jugando = false;
                }
                break;
                
                case 2:
                    bodega.mostrarContenido();
                    break;
                    
                case 3:
                    controladores.ControladorVentas.gestionarVenta(jugador, bodega, entrada);
                    break;
                    
                case 4:
                    System.out.println("\n Misiones de la estacion espacial:");
                    for (int i = 0; i < listaMisiones.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        listaMisiones.get(i).mostrarDetalles(bodega);
                    }
                    System.out.println("");
                    break;
                    
                case 5:
                    System.out.println("Que misiones queres entregar? (1-3)");
                    int numMision = entrada.ingresarEntero(1, 3);

                    Mision misionSeleccionada = listaMisiones.get(numMision - 1);
                    misionSeleccionada.entregarMision(bodega, jugador);
                    break;
                    
                case 6:
                    controladores.ControladorReparacion.gestionarReparacion(jugador, nave, entrada);
                    break;
                    
                case 7:
                    jugador.descansar();
                    System.out.println("Has descansado. Energia restaurada al 100%.");
                    break;
                    
                case 8:
                    System.out.println("Saliendo del juego...");
                    jugando = false;
                    break;
            }
        }
        
        menu.mostrarResumenFinal(jugador, nave, listaMisiones, resultadoFinal);
        
        entrada.cerrarScanner(); 
    }
    
    
}