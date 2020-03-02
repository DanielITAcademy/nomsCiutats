/* FASE 3 (3 punts)
●	Cambieu les vocals “a” dels noms de les ciutats per el numero 4 i guardeu els noms modificats en un nou array(ArrayCiutatsModificades). (2 punts)
●	Mostreu per consola l’array modificat i ordenat per ordre alfabetic. (1 punt)
*/

package cityNamesJava;
import java.util.*;

	public class StageThree{
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
				
			String[] arrayCitiesMod= new String [6];
			for (int i=0; i<arrayCities.length; i++)
				arrayCitiesMod[i]=arrayCities[i].replace('a','4');
				
			for (int i=0; i<arrayCities.length; i++)
		
			
			System.out.println(arrayCitiesMod[i]);
			

			
		  }
	}
