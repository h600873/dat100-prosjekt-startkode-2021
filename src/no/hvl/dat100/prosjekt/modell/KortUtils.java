package no.hvl.dat100.prosjekt.modell;

import java.util.Random;

import no.hvl.dat100.prosjekt.TODO;

public class KortUtils {

	/**
	 * Sorterer en samling. Rekkefølgen er bestemt av compareTo() i Kort-klassen.
	 * 
	 * @see Kort
	 * 
	 * @param samling
	 * 			samling av kort som skal sorteres. 
	 */
	
	public static void sorter(KortSamling samling) {
		
		Kort [] tabell = samling.getSamling();
		int antall = samling.getAntalKort();
		for (int i = 0; i<antall; i++) {
			int min = i;
			for(int j = 0;j<antall;j++) {
				if(tabell[j].compareTo(tabell[min]) > 0) {
					min = j;
				}
			}
			Kort temp = tabell[i];
			tabell[i] = tabell[min];
			tabell[min] = temp;
		}
	}
	
	/**
	 * Stokkar en kortsamling. 
	 * 
	 * @param samling
	 * 			samling av kort som skal stokkes. 
	 */
	public static void stokk(KortSamling samling) {
		
		
		Kort [] tabell = samling.getSamling();
		int antall = samling.getAntalKort();
		for(int i = 0; i<antall;i++) {
			int rand = (int) (Math.random()*antall);
			
			Kort temp = tabell[i];
			tabell[i] = tabell[rand];
			tabell[rand] = temp;
			
		}
		
	}
	
}
