package programadoresEquipo;

import java.util.Scanner;

public class Main_de_Programadores {

	public static void main(String[] args) {
		
		Creo_Equipo_S_Programacion gestorEquipos = new Creo_Equipo_S_Programacion();
		
		  int opcion =0;;
	        do {
	        	Scanner entrada = new Scanner(System.in);
	      
	        	
	        try {	
	        	
	            System.out.println("1. Agregar equipo.");
	            System.out.println("2. Mostrar equipo y salir.");
	            System.out.println("\nElige una de estas opciones:");
	            opcion = Integer.parseInt(entrada.nextLine());
	            System.out.println();

	            if (opcion == 1) {
	                gestorEquipos.agregarEquipo();
	                
	            }if (opcion != 2) {
	                System.out.println("Opción no válida. Intente de nuevo.");
	            
	            }else {
	   
	            } gestorEquipos.mostrarEquipos(); // Mostrar equipos al salir del bucle
	     }catch (Exception e) {
	        System.out.println("ERROR: " + e.getMessage());
	        System.out.println();
	    }
	        
		}while (opcion != 2);
		
	}
}

				
