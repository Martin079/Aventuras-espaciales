package utilidades;

public class Aleatorio {

	public static int generarEntero(int minimo, int maximo) {
        return (int) (Math.random() * (maximo - minimo + 1)) + minimo;
    }
	
}
