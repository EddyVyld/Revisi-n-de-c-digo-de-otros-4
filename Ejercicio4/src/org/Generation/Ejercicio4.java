package org.Generation;

//Importe esta clase que no estaba antes
import java.util.Scanner;


public class Ejercicio4 {

	public static void main(String[] args) { // Faltaba poner el metodo main

		Scanner s = new Scanner(System.in); // Falto poner System.in para que permita ingresar datos al teclado
	    
	    String j1, j2; // Declare dos objetos: j1 y j2
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    j1 = s.nextLine();
	    
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); // Cambie 1, por dos
	    /* Scanner s2 = new Scanner(); */   // No es necesario volver a declararla
	    j2 = s.nextLine();
	    
	    if (j1.equals(j2)) {  // Tenia un doble parentesis que no debia estar y oara comparar dos objetos se utiliza .equals()
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":
	          if (j2.equals( "tijeras" )) {  // Para comparar dos objetos se utiliza .equals()
	            g = 1;
	          }
	          break; // Agregue break de acuerdo a la sintaxis de de switch 

	        case "papel":
	          if (j2.equals("piedra")) {  // Para comparar dos objetos se utiliza .equals()
	            g = 1;
	          }  // Fataba cerrar esta llave
	            break; // Agregue break de acuerdo a la sintaxis de de switch 
	          
	        case "tijeras": // Agregue una s
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	        default:
	      }
	          
	      System.out.println("Gana el jugador " + g);
	      
	    }
	    
	      
	      s.close(); // Faltaba cerrar 
	      
	    }
	}