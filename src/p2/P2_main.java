package p2;

public class P2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * E1: Der Wert von a ist mit dem von b identisch. 
		 * E2: Der Wert von a stimmt mit mindestens einem der Werte von b und / oder c überein. 
		 * E3: Der Wert von a addiert zum Startwert von b ist mindestens so groß wie c. 
		 * E4: Die Summe der Werte von a, b und c ist mindestens 100.
		 * 
		 * Die Anzahl der erfüllten Eigenschaften wird in d gespeichert.
		 * 
		 * unabhängig vom Startwert von d wird tatsächlich auch 0 in d gespeichert,
		 * falls keine der Eigenschaften erfüllt ist
		 */

		int a = 0, b = 1, c = 2, d = 100;

		if (a == b) {
			d = 1;
		} else {
			d = 0;
		}

		if (a == b) {
			d++;
		} else if (a == c) {
			d++;
		}

		if ((a + b) >= c) {
			d++;
		}

		if ((a + b + c) >= 100) {
			d++;
		}

		System.out.println(d);

	}

}
