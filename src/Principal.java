import enums.Mascotas;
import enums.Menu;
import pantallas.PantallaMenu;
import utiles.Utiles;
import entidades.Jugador;
public class Principal {

	public static void main(String[] args) {
		String name;
		Jugador jugador;
		int opc = 0;
		System.out.println("Bienvenido al simulador de mascota virtual");
		System.out.println("Ingrese su nombre:");
		name = Utiles.s.next();
		System.out.println("Elija una mascota: ");
		Mascotas.mostrarOpciones();
		opc = (Utiles.ingresarEntero(1, Mascotas.values().length) - 1);
		jugador = new Jugador(name, Mascotas.getMascota(opc));
		System.out.println("Bienvenido, " + jugador.getNombre() + ", tu mascota es un " + jugador.getMascota().getNombre() + ",de tipo " + jugador.getMascota().getTipo());
		PantallaMenu pantallaMenu = new PantallaMenu();
		pantallaMenu.ejecutar();
	}
}
