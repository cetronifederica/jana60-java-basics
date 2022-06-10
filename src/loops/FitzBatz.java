package loops;

import java.util.Scanner;

public class FitzBatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in); 
		
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			int numero = i;
			
			if (numero % 3 == 0) {
				System.out.println("Fitz");
			} else if (numero % 5 == 0) {
				System.out.println("Batz");
			}
		}
		
		scan.close();
	}

}
