package code.Notes;
/**
 * @author Aykut Acarer
 * 
 */
import java.util.Scanner;

public class NotenRechnen {

	public static void main(String[] args) {
	
		// Klausur-Noten Kalkulator
		
		System.out.println("Maximale erreichbare Punkte:");
		double maxpunkte = new Scanner(System.in).nextDouble();
		System.out.println("Erreichte Punkte: ");
		double erreichtePunkte = new Scanner(System.in).nextDouble();
		double prozent;
		double note=0;
		prozent=erreichtePunkte*100/maxpunkte;
		if (prozent>=50) {
			System.out.println("Herzlichen Glückwunsch");
			if (prozent>=50 && prozent<=59) {
				if(prozent>=50 && prozent<=54) {
					note=4.3;
				}
				else {
					note=4.0;
				}
				System.out.println("Genügend");
			}
			if (prozent>=60 && prozent<=72) {
				if(prozent>=69 && prozent<=72) {
					note=3.0;
				}
				else if(prozent>=65 && prozent<=68){
					note=3.3;
				}
				else {
					note=3.7;
				}
				System.out.println("Befriedigend");
			}
			if (prozent>=73 && prozent<=84) {
				if(prozent>=81 && prozent<=84) {
					note=2.0;
				}
				else if(prozent>=77 && prozent<=80){
					note=2.3;
				}
				else {
					note=2.7;
				}
				System.out.println("Gut");
			}
			if (prozent>=85 && prozent<=100) {
				if(prozent>=95 && prozent<=100) {
					note=1.0;
				}
				else if(prozent>=89 && prozent<=94){
					note=1.3;
				}
				else {
					note=1.7;
				}
				System.out.println("Sehr Gut");
			}
			System.out.println("Ihre Note ist "+note);
		}
		
		else {
			System.out.println("Nicht bestanden");
			
		}
		

	}

}
