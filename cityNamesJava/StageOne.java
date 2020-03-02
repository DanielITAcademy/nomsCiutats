// L’exercici consisteix en mostrar per consola diferents noms de ciutats partint d’un array i modificar els noms canviant lletres.
/* FASE 1
  ●	Crea sis variables tipu string buides. 
  ●	Demana per consola que s’introdueixin els noms. (0,5 punts)
  ●	Introdueix els següents noms de ciutats (Barcelona, Madrid, Valencia, Malaga, Cadis, Santander) per teclat. (0,5 punts)
  ●	Mostra per consola el nom de les 6 ciutats. 

 */


package cityNamesJava;

import java.util.Scanner;

public class StageOne {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		  // Create six empty var 
			String cityOne=" "; 
			String cityTwo=" "; 
			String cityThree=" "; 
			String cityFour=" "; 
			String cityFive=" "; 
			String citySix=" ";
		  //names for console 
			
		  System.out.println("Insert city one..."); 
		  cityOne = keyboard.nextLine();
		  System.out.println("Insert city two..."); 
		  cityTwo = keyboard.nextLine();
		  System.out.println("Insert city three...");
		  cityThree = keyboard.nextLine();
		  System.out.println("Insert city four..."); 
		  cityFour = keyboard.nextLine();
		  System.out.println("Insert city five...");
		  cityFive = keyboard.nextLine();
		  System.out.println("Insert city six..."); 
		  citySix = keyboard.nextLine();
		 // 	Mostra per consola el nom de les 6 ciutats. 
		  System.out.println(cityOne); 
		  System.out.println(cityTwo); 
		  System.out.println(cityThree); 
		  System.out.println(cityFour); 
		  System.out.println(cityFive); 
		  System.out.println(citySix); 
		  
		  

	}
}
