package entidades;

import Mascotas.Mascota;
import enums.Mascotas;

public class Jugador {
	private String nombre;
	private Mascota mascota;
	private int dinero = 10000;

	public Jugador(String nombre, Mascota mascota) {
		this.nombre = nombre;
		this.mascota = mascota;
	}

	public Mascota getMascota() {
		return mascota;
	}
	public String getNombre() {
		return nombre;
	}
}
