package utilidades;

public class Menu {
	
	/*Antes de mostrar cualquier menú*/
	//------info de datos usando getters
	public void mostrarDatos(){
		System.out.println("");
		System.out.println("------Informacion de la partida-------");
		System.out.println("Nombre jugador: ");
		System.out.println("Energia actual: ");
		System.out.println("Creditos espaciales: ");
		System.out.println("Nombre de la nave: ");
		System.out.println("Velocidad de la nave: ");
		System.out.println("Capacidad de carga de la nave: ");
		System.out.println("Carga actual en la bodega: ");
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


	public void menuPlaneta(){
		System.out.println("");
		System.out.println("------Planeta (tipo)-------");
		System.out.println("1- Minar");
		System.out.println("2- Viajar otro planeta");
		System.out.println("3- Volver a la base");
		System.out.println("-----------------------");
		System.out.println("");	
	}
}
