package h2;

public class H2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  Der Startwert von jahr steht für eine Jahreszahl.
		
		int jahr = 2025;
		boolean schalt = false;
		
		/*
		 * ein Programm, das bei der in jahr gespeicherten Jahreszahl entscheidet,
		 * ob es sich um ein Schaltjahr handelt oder nicht. 
		 * Falls es sich um ein Schaltjahr handelt, soll true in schalt gespeichert werden, sonst false.
		
		 * Ein Jahr ist ein Schaltjahr, falls die Jahreszahl durch 4 teilbar ist, außer,
		 * es ist ein Jahr, das durch 100 teilbar ist. Ausnahmen sind in diesem Fall aber wiederum
		 * Jahre, die durch 400 teilbar sind: das sind dann wieder Schaltjahre.
		 */
		
		if (jahr%4 == 0) {
			schalt = true;
			if (jahr % 400 != 0) {
				if (jahr%100 == 0) {
				schalt = false;
				}
			}
		}
		
		System.out.println(schalt);

	}

}
