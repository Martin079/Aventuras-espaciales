package controladores;

import jugador.Jugador;
import bodega.Bodega;
import utilidades.Entrada;
import recursos.*;

public class ControladorVentas {

    public static void gestionarVenta(Jugador jugador, Bodega bodega, Entrada entrada) {
        System.out.println("\n Venta de recursos");
        System.out.println("1- Vender un recurso especifico (1 unidad)");
        System.out.println("2- Vender TODO lo que hay en la bodega");
        System.out.print("Elija una opción: ");
        int opcionVenta = entrada.ingresarEntero(1, 2);

        if (opcionVenta == 1) {
            System.out.println("\nQue tipo de recurso desea vender?");
            System.out.println("1- Mineral comun");
            System.out.println("2- Cristal");
            System.out.println("3- Gas");
            System.out.println("4- Plasma");
            System.out.println("5- Obsidiana");
            System.out.println("6- Nucleo energetico");
            System.out.print("Seleccione el recurso: ");
            int tipo = entrada.ingresarEntero(1, 6);

            Class<? extends Recurso> claseElegida = null;
            switch (tipo) {
                case 1: claseElegida = MineralComun.class; break;
                case 2: claseElegida = Cristal.class; break;
                case 3: claseElegida = Gas.class; break;
                case 4: claseElegida = Plasma.class; break;
                case 5: claseElegida = Obsidiana.class; break;
                case 6: claseElegida = NucleoEnergetico.class; break;
            }


            int creditosObtenidos = bodega.eliminarRecurso(claseElegida, 1);

            if (creditosObtenidos > 0) {

                jugador.sumarCreditos(creditosObtenidos); 
                System.out.println("Venta exitosa. Obtuviste " + creditosObtenidos + " creditos.");
            } else {
                System.out.println("No tienes ninguna unidad de ese recurso en la bodega.");
            }

        } else {
  
            int creditos = bodega.vaciarBodega();

            if (creditos > 0) {
                jugador.sumarCreditos(creditos);
                System.out.println("Bodega vendida por completo");
                System.out.println("Ganaste un total de " + creditos + " creditos.");
            } else {
                System.out.println("La bodega ya esta vacia.");
            }
        }
    }
}