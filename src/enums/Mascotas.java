package enums;

import java.lang.reflect.InvocationTargetException;

import Mascotas.Mascota;

public enum Mascotas {
	KIBBO("Kibo", "Kibo", "Fuego"), MECCA("Mecca", "Mecca", "Tierra"), KOI("Koi", "Koi", "Koi");
	
	String nombre, clase, tipo;

	private Mascotas(String nombre, String clase, String tipo) {
		this.nombre = nombre;
		this.clase = clase;
		this.tipo = tipo;
	}
	
	private  String getNombre() {
		return nombre;
	}
	
	private String  getClase() {
		return clase;
	}
	
	private String  getTipo() {
		return tipo;
	}
	
	public static void mostrarOpciones() {
		for (int i = 0; i < values().length; i++) {
			Mascotas mascota = values()[i];
			System.out.println((i+1) + "):");
			System.out.println("Nombre: " + mascota.getNombre());
			System.out.println("Tipo: " + mascota.getTipo() + "\n");
		}
	}
	public static Mascota getMascota(int opc) {
		Class<?> clase;
		Mascota mascota = null;
			try {
				clase = Class.forName("Mascotas." + values()[opc].getClase());
				mascota = (Mascota) clase.getDeclaredConstructor().newInstance();
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException | SecurityException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("Error inesperado durante la creacion de la mascota");
			}
		return mascota;
	}
}
