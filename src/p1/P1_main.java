package p1;

public class P1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Würfeln Sie eine 1 oder eine 4, dann gewinnen Sie. 
		 * Würfeln Sie eine 2, dann verlieren Sie. 
		 * Würfeln Sie eine 5, dann gilt unentschieden.
		 * In allen anderen Fällen bleibt die Lage unklar.
		 */

		int wuerfel = 6;

		if (wuerfel == 1) {
			System.out.println("Gewonnen!");
		} else if (wuerfel == 4) {
			System.out.println("Gewonnen!");
		} else if (wuerfel == 2) {
			System.out.println("Verloren!");
		} else if (wuerfel == 5) {
			System.out.println("Unentschieden!");
		} else {
			System.out.println("Unklar!");
		}

	}

}
