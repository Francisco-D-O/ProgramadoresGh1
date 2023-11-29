package programadoresEquipo;

public class Programador {

	private String nombre;
	private String apellidos;

	Programador(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

}
