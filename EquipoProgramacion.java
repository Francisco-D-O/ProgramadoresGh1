package programadoresEquipo;

import java.util.ArrayList;

import java.util.Scanner;

public class EquipoProgramacion {

	private String nombreEquipo;
	private String universidad;
	private String lenguajeProgramacion;
	private int numdProgramadores;
	private ArrayList<Programador> listaProgramadores;
	
	public EquipoProgramacion(String nombreEquipo, String universidad,
			String lenguajedeProgramacion,int numdProgramadores) {
		this.nombreEquipo=nombreEquipo;
		this.universidad=universidad;
		this.lenguajeProgramacion=lenguajedeProgramacion;
		this.numdProgramadores=numdProgramadores;
		this.listaProgramadores=new ArrayList<>();
		
		// TODO Apéndice de constructor generado automáticamente
	}
	
	

	public EquipoProgramacion(int numdProgramadores) {
		
		this.numdProgramadores=numdProgramadores;
		// TODO Apéndice de constructor generado automáticamente
	}

	public boolean estaCompleto() {
		return listaProgramadores.size() == numdProgramadores;
	}

	public void agregarProgramador(Programador programador) throws Exception {
		if (estaCompleto()) {
			throw new Exception("El equipo está completo. no se pueden agregar más programadores: ");
		} else {
			listaProgramadores.add(programador);
		}

	}

	public void validarDatos(String nombre, String apellidos) throws Exception {

		if (nombre.matches(".*\\d.") || apellidos.matches(".*\\d.")) {
			throw new Exception("Error, los nombres y apellidos deben contener solo texto. ");

		}
		if (nombre.length() >= 20 || apellidos.length() >= 20) {
			throw new Exception("Error, los nombres y apellidos no pueden superar los 20 dígitos. ");
		}

	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("\n Información del equipo: \n");

		result.append("Nombre del equipo. ").append(nombreEquipo).append("\n");
		result.append("Universidad. ").append(universidad).append("\n");
		result.append("Lenguaje de programación. ").append(lenguajeProgramacion).append("\n");
		result.append("Programadores: \n ");

		for (Programador programador : listaProgramadores) {
			result.append("Nombre. ").append(programador.getNombre()).append("Apellidos.")
					.append(programador.getApellidos()).append("\n");
		}
		return result.toString();

	}

	public  int ObtenerNumProgramadoresValido() throws Exception {

		Scanner teclado = new Scanner(System.in);

		this.numdProgramadores = 0;
		boolean NumValido = false;

		do {
			
			System.out.println("Introduce número de programadores, 2 o 3. ");
			numdProgramadores = Integer.parseInt(teclado.nextLine());

			try {

				if (numdProgramadores == 2 || numdProgramadores == 3) {
					NumValido = true;

				} else {
					System.out.println("Introduce número de programadores, 2 o 3. ");

				}
				
			} catch (NumberFormatException e) {
				System.out.println("ERROR!! Introduce un 2 o un 3. ");
				// TODO: handle exception
			}

		} while (!NumValido);

		return numdProgramadores;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public String getUniversidad() {
		return universidad;
	}

	public String getLenguajeProgramacion() {
		return lenguajeProgramacion;
	}

	public int getNumdProgramadores() {
		return numdProgramadores;
	}

	public ArrayList<Programador> getProgramadores() {
		return listaProgramadores;
	}
}
