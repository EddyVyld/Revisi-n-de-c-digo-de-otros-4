package com.generation;


//Importe esta clase que no estaba antes
import java.util.Scanner;

public class Codigo4 {
	
	
	public statatic void main (String[] args){

    Scanner s = new Scanner(System.in); // Falto poner System.in para que permita ingresar datos al teclado
    
    String j1, j2; // Declare j1 y j2
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    j1 = s.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    /* Scanner s2 = new Scanner(); */   // No es necesario volver a declararla
    j2 = s.nextLine();
    
    if (j1 == j2)) {
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2 == "tijeras") {
            g = 1;
          }

        case "papel":
          if (j2 == "piedra") {
            g = 1;
          
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
    }
      
    }
    
  
}