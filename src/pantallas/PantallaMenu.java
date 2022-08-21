package pantallas;

import enums.Menu;
import interfaces.Screen;
import utiles.Utiles;

public class PantallaMenu implements Screen{
	static int opc = 0;
	static boolean salir = false;
	public PantallaMenu() {
	}
	
	public void ejecutar() {
		do {
			enums.Menu.mostrarOpcs();
			opc = (Utiles.ingresarEntero(1, enums.Menu.values().length) - 1);
			Menu.elegirOpc(opc);
		} while (!salir);
	}

	public static  void setSalir(boolean salir) {
		PantallaMenu.salir = salir;
	}

}
