package uebungen.u0;

public class Program {

	public static void main(String[] args) {
		// Deklaration der Variablen
		int hoehe=20;
		double zeitErde, zeitMond, zeitJupiter;
		double gKonstanteErde=9.81;
		double gKonstanteMond=1.61;
		double gKonstanteJupiter=24.79;
		String ausgabe ="Fallzeit auf";
		
		zeitErde = Math.sqrt(2*hoehe/gKonstanteErde);	
		zeitMond = Math.sqrt(2*hoehe/gKonstanteMond);
		zeitJupiter = Math.sqrt(2*hoehe/gKonstanteJupiter);
		System.out.print(ausgabe+" der Erde: "+zeitErde);
		System.out.println(ausgabe+ " dem Mond: "+zeitMond);
		System.out.println(ausgabe+" dem Jupiter: "+zeitJupiter);
		
		// Kommentarzeile
		// Ergänzung aus der Vorlesung
		// Java-Folien: Seite 19 und Folgende
		// Implizite Typanpassung:
		
		byte summe = 100;
		// Implizit, Automatisch: Jeder kleinere Datentyp passt in einen größeren Datentyp
		int gesamtesumme = summe; // Kein Problem
		
		int zwischenstand = 1000;
		// summe = zwischenstand; << Erzeugt einen Fehler. Wert passt nicht in Variable vom Datentyp byte
		// Explizite Typanpassung
		
		summe = (byte)1000; // explizite Typanpassung
		
		
	}
}
