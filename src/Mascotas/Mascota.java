package Mascotas;

import enums.Tipos;

public class Mascota{
	String nombre;
	protected Tipos tipo;
	int energia = 100, felicidad = 80, hambre = 0, suciedad = 10;
	public Mascota(String nombre, Tipos tipo) {
		this.nombre = nombre;
		this.tipo  = tipo;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getTipo() {
		// TODO Auto-generated method stub
		return tipo.getNombreTipo();
	}
}
