package enums;

public enum Tipos {
	FUEGO("Fuego"), TIERRA("Tierra"), AGUA("Agua");

	String nombreTipo;

	private Tipos(String nombreTipo) {
		this.nombreTipo = nombreTipo;
	}

	public String getNombreTipo() {
		return nombreTipo;
	}
}
