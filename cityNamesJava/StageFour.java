/*FASE 4 (3 punts)
●	Creeu un nou array per cada una de les ciutats que tenim. La mida dels nous arrays sera la llargada de cada string ( string nomCiutat.Length). (0,5 punts)
●	Ompliu els nous arrays lletra per lletra.(2 punts)
●	Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB). (0,5 punts)
*/

package cityNamesJava;

import java.util.Arrays;
import java.util.*;

public class StageFour {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// New array length same String
		String cityOne = "Barcelona";
		char[] oneChar = new char[cityOne.length()];
		String cityTwo = "Madrid";
		char[] twoChar = new char[cityTwo.length()];
		String cityThree = "Valencia";
		char[] threeChar = new char[cityThree.length()];
		String cityFour = "Malaga";
		char[] fourChar = new char[cityFour.length()];
		String cityFive = "Cadiz";
		char[] fiveChar = new char[cityFive.length()];
		String citySix = "Santander";
		char[] sixChar = new char[citySix.length()];
		// Show size array
		System.out.println(cityFive.length());
		// Fill in the new arrays letter by letter.
		System.out.println("\n"); 
		  
			
	
/*
		char charBar[] = cityOne.toCharArray();
		for (int i = 0; i < cityOne.length(); i++) {

			System.out.println(charBar[i]);

		}
		System.out.println("\n");

		char charMad[] = cityTwo.toCharArray();
		for (int i = 0; i < cityTwo.length(); i++) {
			
			System.out.println(charMad[i]);
		
			
			//for (int j = cityTwo.length() - 1; j >0; j--) {
				
				//System.out.println(charMad[i]);

			//}
		}

		System.out.println("\n");

		char charVal[] = cityThree.toCharArray();
		for (int i = 0; i < cityThree.length(); i++) {

			System.out.println(charVal[i]);
		}

		System.out.println("\n");

		char charMal[] = cityFour.toCharArray();
		for (int i = 0; i < cityFour.length(); i++) {

			System.out.println(charMal[i]);
		}

		System.out.println("\n");
		char charCad[] = cityFive.toCharArray();
		for (int i = 0; i < cityFive.length(); i++) {

			System.out.println(charCad[i]);
		}

		System.out.println("\n");
		char charSan[] = citySix.toCharArray();
		for (int i = 0; i < citySix.length(); i++) {

			System.out.println(charSan[i]);
		}

		System.out.println("\n");

	}

*/
//Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB).

/*El código invierte un array de tipo entero o int, para invertir otro tipo de array, 
 * solo debemos cambiar el tipo de retorno, el tipo del parámetro que recibe, 
 * y el tipo de la variable aux presente en la funcion.*/
	
		String invcities=" ";
		
		String cities = cityOne + "\n" + cityTwo+ "\n" + cityThree + "\n" + cityFour + "\n"+ cityFive +"\n" + citySix;
		// Esta será la cadena invertida, primero está vacía
		String invertida = "";
		// Recorremos la original del final al inicio
		for (int indice = cities.length() - 1; indice >= 0; indice--) {
			// Y vamos concatenando cada carácter a la nueva cadena
			invcities += cities.charAt(indice);
		}
		System.out.println("Chain original: " + cities);
		System.out.println("Chain invert: " + invcities);
	}
}
		






	   
	    /* for(int i = 0; i < charBar.length; i++) {
	    	  System.out.println(charBar);
	    }
	   
	    System.out.println(charBar);
	    return charBar[i];
	    //return charBar;
	    
	    
	}
}
*/

