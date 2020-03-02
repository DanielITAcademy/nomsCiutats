/*FASE 2 (2 punts)
●	Un cop tenim els noms de les ciutats guardats en variables haurem de pasar l’informacio a un array (arrayCiutats). (1 punt)
●	Quan tinguem l’array ple, haurem de mostrar per consola el nom de les ciutats ordenadas per ordre alfabetic. (1 punt)
 */
package cityNamesJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class StageTwo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		  // Create six empty var 
			String cityOne="Barcelona "; 
			String cityTwo="Madrid"; 
			String cityThree="Valencia"; 
			String cityFour="Malaga"; 
			String cityFive="Cadiz"; 
			String citySix="Santander ";
			//Pasamos la info a un array
			String[]arrayCities={cityOne,cityTwo,cityThree,cityFour,cityFive,citySix};
			// El array esta lleno por lo que ordenamos por alfabeto
			Arrays.sort(arrayCities);
			for(int i=0; i<arrayCities.length; i++)
			System.out.println(arrayCities[i]);
				
			
			
			
		  //names for console 
			
		/* System.out.println("Insert city one..."); 
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
		  	Mostra per consola el nom de les 6 ciutats. 
		  System.out.println(cityOne); 
		  System.out.println(cityTwo); 
		  System.out.println(cityThree); 
		  System.out.println(cityFour); 
		  System.out.println(cityFive); 
		  System.out.println(citySix); 
		  
	  
		  
		  ArrayList <String> arrayCities=new ArrayList<String>();
		  System.out.println(arrayCities);
		  arrayCities.add("Barcelona");
		  arrayCities.add("Madrid");
		  arrayCities.add("Valencia");
		  arrayCities.add("Malaga");
		  arrayCities.add("Cadiz");
		  arrayCities.add("Santander");
	
		

		// Ordenamos la lista.
	        Collections.sort(arrayCities); 
	     // Imprimimos
	        for (String alphabeticalOrder : arrayCities) {
	            System.out.println(arrayCities);
	            return;
	            
	       

	        }
		*/ 
	}
}


