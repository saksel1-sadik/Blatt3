package h3;

public class H3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max = 5; // Gibt an, wie viele Personen maximal einen Fixplatz erhalten dürfen.
		int fix = 2; // Gibt an, wie viele Personen bereits einen Fixplatz für die Veranstaltung erhalten haben.
		int wartend = 2; // Gibt an, wie viele Personen sich noch auf der Warteliste für einen Fixplatz befinden.
		boolean istVoll = true;
		/* auf den Wert true zu setzen, falls keine weiteren Fixplätze mehr vergeben werden können. 
		 * Ansonsten hat sie den Wert false.
		 */
		
		/*
		 * Sind noch Fixplätze frei und noch Personen auf der Warteliste, 
		 * so wird so vielen Personen ein Fixplatz zugewiesen, bis entweder keine Fixplätze mehr frei sind 
		 * oder keine Personen mehr auf der Warteliste stehen.
		 * Am Ende des Programms müssen die Werte von fix, wartend und istVoll den Gegebenheiten angepasst sein. 
		 * Haben beispielsweise keine weiteren Personen einen Fixplatz erhalten, 
		 * so entspricht der Wert von fix weiterhin seinem Startwert.
		 */
		
		if (fix < max) {
			istVoll = false;
			if (wartend > 0) {
				if ((max - fix) <= wartend) {
					wartend -= (max - fix);
					fix = max;
					istVoll = true;
				} else if (wartend < (max-fix)) {
					fix += wartend;
					wartend = 0;

				}
			}
		} else istVoll = true;
		
		System.out.println("Max: " + max);
		System.out.println("Fix: " + fix);
		System.out.println("Wartend: " + wartend);
		System.out.println("Voll: " + istVoll);

	}

}
