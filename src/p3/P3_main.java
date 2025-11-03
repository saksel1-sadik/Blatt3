package p3;

public class P3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Betrag einer vorgegebenen Zahl wird auf die Konsole ausgegeben
		 */

		int zahl = -11;

		if (zahl < 0)
			zahl = -zahl;

		System.out.println("Der Betrag lautet: " + zahl);

		/*
		 * Quadrat einer vorgegebenen Zahl wird auf die Konsole ausgegeben
		 */
		
		zahl = zahl * zahl;
		System.out.println("Das Quadrat lautet: " + zahl);
		
		/*
		 * Bei einer Zahl soll entschieden werden, ob die Zahl gerade oder ungerade ist. 
		 * Entsprechend soll eine aussagekräftige Aussage auf die Konsole ausgegeben werden.
		 */
		
		if ( zahl % 2 == 0) {
			System.out.println("Zahl ist gerade.");
		} else {
			System.out.println("Zahl ist ungerade.");
		}

	}

}
