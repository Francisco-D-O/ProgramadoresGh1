package programadoresEquipo;

import java.util.ArrayList;
import java.util.Scanner;

public class EquipoProgramacion {
	
	private String nombreEquipo;
	private String universidad;
	private String lenguajeProgramacion;
	private int num_d_Programadores;
	private ArrayList<Programador> listaProgramadores;
	
	public boolean estaCompleto() {
		return listaProgramadores.size() == num_d_Programadores;
	}
	
	public void agregarProgramador(Programador programador)throws Exception {
		if(estaCompleto()) {
			throw new Exception ("El equipo está completo. no se pueden agregar más programadores: ");
		}else {
			listaProgramadores.add(programador);
		}
		
		
	}
	public void validarDatos(String nombre, String apellidos)throws Exception {
		
		if(nombre.matches(".*\\d.") || apellidos.matches(".*\\d.")) {
			throw new Exception ("Error, los nombres y apellidos deben contener solo texto. ") ;
			
		}
		if (nombre.length() >= 20 || apellidos.length()>=20) {
			throw new Exception ("Error, los nombres y apellidos no pueden superar los 20 dígitos. ");
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
		
		for(Programador programador: listaProgramadores) {
			result.append("Nombre. ").append(programador.getNombre()).append("Apellidos.").
			append(programador.getApellidos()).append("\n");
		}
		return result.toString();
	
		
		
	}
	
	public static int ObtenerNumProgramadoresValido() throws Exception {
		Scanner keyboard = new Scanner(System.in);
		
		int NumProgramador =0;
		
		
		
		
	}
	
	public String getNombreEquipo() {
		return NombreEquipo;
	}
	
	public String getUniversidad() {
		return Universidad;
	}
	
	public String getLenguajeProgramacion() {
		return LenguajeProgramacion;
	}
	public int getNum_d_Programadores() {
		return Num_d_Programadores;
	}
	public ArrayList<Programador> getProgramadores(){
		return Programadores;
	}
}
