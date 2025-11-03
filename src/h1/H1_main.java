package h1;

public class H1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * auf eine sehr einfache Art ein Rating für Bankkunden berechnen. 
		 * das aktuelle Guthaben (guthaben), 
		 * der monatliche, zu erwartende Geldeingang (monEingang), 
		 * die aktuelle Bewertung (rating) 
		 * und ein daraus resultierender Warnhinweis (warnhinweis).
		 */
		
		double guthaben = -100.0, monEingang = 200.0;
		int rating = -2;
		boolean warnhinweis = true, negativ = true;
		
		/* Ist der Wert von guthaben echt kleiner als 0, 
		 * so muss der Wert von negativ auf true gesetzt werden, sonst auf false.*/
		
		if (guthaben < 0) {
			negativ = true;
		} else {
			negativ = false;
		}
		
		/* Ist der Wert von guthaben echt größer als 0, 
		 * so wird auf den Startwert von rating der Wert 3 addiert. */
		
		if (guthaben > 0) {
			rating += 3;
		}
		
		/* Ist der Wert von guthaben gleich 0, 
		 * so wird auf den Startwert von rating der Wert 2 addiert. */
		
		if (guthaben == 0) {
			rating += 2;
		}
		
		/* Ist der Wert von guthaben echt kleiner als 0, 
		 * und der Wert von monEingang im Betrag größer als oder gleich dem Betrag des Wertes von guthaben,
		 * so wird auf den Startwert von rating der Wert 1 addiert.*/
		
		if (guthaben < 0) {
			if (monEingang >= -guthaben)
				rating += 1;
		}

		/* Ist der Wert von guthaben echt kleiner als 0, 
		 * und ist der Wert von monEingang im Betrag kleiner als der Betrag des Wertes von guthaben, 
		 * so wird vom Startwert von rating der Wert 1 subtrahiert. */
		
		if (guthaben < 0) {
			if (monEingang < -guthaben)
				rating -= 1;
		}		
		
	
		/* Ist der Wert von guthaben echt kleiner als 0, 
		 * der Wert von monEingang im Betrag kleiner als der Wert von guthaben im Betrag 
		 * und der Wert von rating ist negativ, 
		 * dann wird warnhinweis auf true gesetzt, ansonsten auf false. */
		
		if (guthaben < 0) {			
			if (monEingang < -guthaben) {
				if (rating < 0) {
					warnhinweis = true;
				} 
			}
			else {
				warnhinweis = false;
			}
		}		
				
		System.out.println("Guthaben: " + guthaben);
		System.out.println("monatlicher Eingang: " + monEingang);
		System.out.println("Warnhinweis: " + warnhinweis);
		System.out.println("Rating: " + rating);
		System.out.println("Negativ: " + negativ);
		
	}

}
