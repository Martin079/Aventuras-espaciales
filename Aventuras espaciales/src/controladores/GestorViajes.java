package controladores;

import java.util.ArrayList;
import jugador.Jugador;
import naves.Nave;
import bodega.Bodega;
import utilidades.Menu;
import utilidades.Entrada;
import planetas.Planeta;
import planetas.Rocoso;
import planetas.Gaseoso;
import planetas.Volcanico;
import recursos.Recurso;

public class GestorViajes {
	
	
public static String gestionarViaje(Jugador jugador, Nave nave, Bodega bodega, Entrada entrada, Menu menu) {
        
        System.out.println("\n  MAPA ESTELAR: ");
        System.out.println("1- Viajar a Planeta Rocoso");
        System.out.println("2- Viajar a Planeta Gaseoso");
        System.out.println("3- Viajar a Planeta Volcánico");
        System.out.print("Elija su destino: ");
        int eleccionPlaneta = entrada.ingresarEntero(1, 3);

        Planeta planetaActual = null;
        if (eleccionPlaneta == 1) {
            planetaActual = new Rocoso(); 
        } else if (eleccionPlaneta == 2) {
            planetaActual = new Gaseoso(); 
        } else {
            planetaActual = new Volcanico(); 
        }

        peligros.GestorPeligros.evaluarPeligroViaje(nave);

        if (nave.getVida() <= 0) {
            System.out.println("Tu nave fue destruida durante el viaje");
            return "Derrota"; 
        }

        boolean enPlaneta = true;

        while (enPlaneta) {
            menu.mostrarDatos(jugador, nave, bodega);
            menu.menuPlaneta(planetaActual);
            
            int opcionPlaneta = entrada.ingresarEntero(1, 4);

            switch (opcionPlaneta) {
                case 1:
                    int energiaRequerida = utilidades.Aleatorio.generarEntero(10, 25);
                    System.out.println("Energia requerida para minar: " + energiaRequerida + "%");
                    if (jugador.getEnergia() >= energiaRequerida) {
                        jugador.restarEnergia(energiaRequerida);
                        
                        Recurso recursoEncontrado = planetaActual.minar(); 
                        System.out.println("Minado exitoso! Encontraste: " + recursoEncontrado.getNombre());
                        
                        boolean entro = bodega.agregarRecurso(recursoEncontrado); 
                        
                        if (!entro) {
                            System.out.println("La bodega está llena! El recurso se perdio");
                        } else {
                            System.out.println("El recurso: " + recursoEncontrado.getNombre() + " fue almacenado correctamente.");
                        }
                    } else {
                        System.out.println("No tenes suficiente energia (" + jugador.getEnergia() + "%). Tenes que volver a la base a descansar.");
                    }
                    break;

                case 2:
                    System.out.println("Viaje a otro planeta");
                    System.out.println("1- Planeta Rocoso | 2- Planeta Gaseoso | 3- Planeta Volcánico");
                    int nuevoPlaneta = entrada.ingresarEntero(1, 3);
                    
                    if (nuevoPlaneta == 1) planetaActual = new Rocoso();
                    else if (nuevoPlaneta == 2) planetaActual = new Gaseoso();
                    else planetaActual = new Volcanico();

                    peligros.GestorPeligros.evaluarPeligroViaje(nave);
                    
                    if (nave.getVida() <= 0) {
                        System.out.println("Tu nave exploto en el viaje");
                        return "Derrota";
                    }
                    break;

                case 3:
                    System.out.println("Volviendo a la Base Espacial...");
                    peligros.GestorPeligros.evaluarPeligroViaje(nave);
                    
                    if (nave.getVida() <= 0) {
                        System.out.println("Tu nave se destruyo.");
                        return "Derrota";
                    }
                    enPlaneta = false;
                    break;

                case 4:
                    System.out.println();
                    planetaActual.mostrarRecursosDisponibles();
                    System.out.println();
                    break;
            }
        }
        
        return "Sigue";
    }
}