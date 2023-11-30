package programadoresEquipo;

import java.util.ArrayList;
import java.util.Scanner;

public class Creo_Equipo_S_Programacion {

	private ArrayList<EquipoProgramacion> equipos;

	public Creo_Equipo_S_Programacion() {
		this.equipos = new ArrayList<>();
	}

	public void agregarEquipo() throws Exception {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el nombre del equio: ");
		String nombreEquipo = teclado.nextLine();

		System.out.println("Introduzca el nombre de la Universidad. ");
		String universidad = teclado.nextLine();

		System.out.println("Introduzca el lenguaje de Programación. ");
		String lenguajeProgramacion = teclado.nextLine();

		EquipoProgramacion valorNumProgramadores = new EquipoProgramacion(0);

		int numdProgramadores = valorNumProgramadores.ObtenerNumProgramadoresValido();

		EquipoProgramacion equipo = new EquipoProgramacion(nombreEquipo, universidad, lenguajeProgramacion, 0);

		for (int i = 0; i < numdProgramadores; i++) {
			System.out.println("Ingrese datos de programador. " + (i + 1) + ":");
			Scanner entrada = new Scanner(System.in);
			System.out.print("Nombre. ");
			String nombre = entrada.nextLine();
			System.out.println("Apellido. ");
			String apellido = entrada.nextLine();

			try {
				equipo.validarDatos(nombre, apellido);
				equipo.agregarProgramador(new Programador(nombre, apellido));

			} catch (Exception e) {
				System.out.println("Erro: " + e.getMessage());
				i--; // resta uno al índice para repetir la entrada de datos para
				// terminar de dar caracteristicas de nombre y apellido al Objeto
				// Programador.l_48.
				// TODO: handle exception

			}
		}

	}

	public void mostrarEquipos() {
		for (EquipoProgramacion equipo : equipos) {
			System.out.println(equipo);

		}
	}

}
