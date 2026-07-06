package controladores;

import jugador.Jugador;
import naves.Nave;
import utilidades.Entrada;

public class ControladorReparacion {

    public static void gestionarReparacion(Jugador jugador, Nave nave, Entrada entrada) {
        System.out.println("\n Reparacion de la nave");
        System.out.println("Estado actual de la nave: " + nave.getVida() + "% de vida.");
        
        if (nave.getVida() >= 100) {
            System.out.println("Tu nave ya se encuentra al 100% de vida. No necesita reparaciones.");
            return;
        }

        int vidaFaltante = 100 - nave.getVida();

        int tramosMaximosPosibles = (int) Math.ceil(vidaFaltante / 10.0);

        System.out.println("Cada tramo de 10% de reparación cuesta 25 créditos espaciales.");
        System.out.println("Puedes reparar como máximo: " + tramosMaximosPosibles + " tramos.");
        System.out.print("¿Cuántos tramos de 10% deseas reparar? (Ingresa 0 para cancelar): ");
        
  
        int tramosElegidos = entrada.ingresarEntero(0, tramosMaximosPosibles);

        if (tramosElegidos == 0) {
            System.out.println("Reparación cancelada.");
            return;
        }

        int costoTotal = tramosElegidos * 25;
        int porcentajeReparacion = tramosElegidos * 10;


        if (jugador.getCreditos() >= costoTotal) {
            jugador.restarCreditos(costoTotal); 
            

            nave.repararNave(porcentajeReparacion);
            
            System.out.println("Reparacion exitosa!");
            System.out.println("Se reparó un " + porcentajeReparacion + "% de vida por " + costoTotal + " creditos.");
            System.out.println("Vida actual de la nave: " + nave.getVida() + "%");
        } else {
            System.out.println("No tenes creditos suficientes. Esta reparación cuesta " + costoTotal + " creditos y tenes " + jugador.getCreditos());
        }
    }
}