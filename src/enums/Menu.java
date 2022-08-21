package enums;

import pantallas.PantallaMenu;

public enum Menu {
	VEROPCIONES("Ver opciones"), SALIR("Salir");

	private String leyenda;
	private int opc;
	private Menu(String leyenda) {
		this.leyenda = leyenda;
	}

	private String getLeyenda() {
		return leyenda;
	}

	public static void mostrarOpcs() {
		for (int i = 0; i < values().length; i++) {
			System.out.println((i + 1) + ") " + values()[i].getLeyenda());
		}

	}

	public static void elegirOpc(int opc) {
		switch (opc) {
		case 0:
			System.out.println("En construccion");
			System.out.println("1) Volver");
			opc = utiles.Utiles.ingresarEntero(1, 1);
			break;
		case 1:
			System.out.println("Adeus!");
			PantallaMenu.setSalir(true);
			break;
		}
	}
}
