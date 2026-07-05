import utilidades.Menu;
import jugador.Jugador;
import naves.Nave;
import utilidades.Entrada;
import bodega.Bodega;

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
        nave = new naves.Fenix();
    } else if (opcionNave == 2) {
        nave = new naves.Eclipse();
    } else {
        nave = new naves.Galaxian();
    }

    Bodega bodega = nave.getBodega();

    
    java.util.ArrayList<misiones.Mision> listaMisiones = new java.util.ArrayList<>();
    listaMisiones.add(new misiones.MisionCasco());
    listaMisiones.add(new misiones.MisionReactor());
    listaMisiones.add(new misiones.MisionNucleo());

    boolean jugando = true;

    while(jugando) {
        menu.mostrarDatos(jugador, nave, bodega);
        menu.menuBaseEspacial();
        int opcion = entrada.ingresarEntero(1, 8); 
        
        switch (opcion) {
            case 1:
                System.out.println("En desarrollo...");
                break;
            case 2:
                bodega.mostrarContenido();
                break;
                
                
            case 7:
                jugador.descansar();
                System.out.println("Has descansado. Energía restaurada al 100%.");
                break;
            case 8:
                System.out.println("Saliendo del juego...");
                jugando = false;
                break;
        }
    }
    
    entrada.cerrarScanner(); 
}

}
