package games;
import java.util.Scanner;
public class CicloDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		/*boolean chiedi = true;
		int numero = 0;
		
		while (chiedi) {
			System.out.println("Scegli un numero fino al quale vuoi giocare: ");
			numero = scan.nextInt();
			if (numero > 1 && numero <= 200) {
				chiedi = false;
			} else {
				System.out.println("Riprova, il numero selezionato deve essere compreso tra 1 e 200");
			}
		}*/
		int numero; 
		
		do {
			System.out.println("Inserisci un numero tra 1 e 200: ");
			numero = scan.nextInt();
		} while (numero < 1 || numero > 200);
		
		
		System.out.println("Iniziamo: ");
		
		for (int i = 1; i <= numero; i++) {
				
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println("Fizz Buzz");
				} else if (i % 3 == 0) {
					System.out.println("Fizz");
				} else if (i % 5 == 0) {
					System.out.println("Buzz");
				} else {
					System.out.println(i);
				}
			}
		scan.close();
	}

}
