package games;
import java.util.Scanner;
import java.util.Random;
public class PariODispari {

	public static void main(String[] args) {
		
		//utente sceglie pari o dispari 
		//utente sceglie un numero da 0 a 5 
		//computer estre un numero random da 0 a 5 
		// si sommano i numeri
		// se la somma è pari e utente ha scelto pari --> utente vince altrimenti vince computer
		//se la somma è dispari e utente ha scelto dispari --> vince l'utente altrimenti vince il computer 
		
		Scanner scan = new Scanner(System.in);
		
		boolean sceltaUtentePari; 
		boolean procedi = true; 
		// utente sceglie pari o dispari
		System.out.println("Scegli pari o dispari?");
		String scelta = scan.nextLine();
		//scelta è uguale a pari?
		if(scelta.equalsIgnoreCase("pari")) {
			sceltaUtentePari = true;	
		} else if(scelta.equalsIgnoreCase("dispari")) {
			sceltaUtentePari = false;
		} else {
			System.out.println("Scelta non valida");
			procedi = false;
			sceltaUtentePari = false;
		}
		
		if(procedi) {
			System.out.println("Procediamo");
			//utente tira un numero tra 0 e 5
			System.out.println("Tira un numero tra 0 e 5");
			int numeroUtente = scan.nextInt();
			
			//se il numero è valido procedo
			if (numeroUtente >=0 && numeroUtente <=5) {
				//computer tira un numero tra 0 e 5
				Random randomGen = new Random();
				int numeroComputer = randomGen.nextInt(6);
				System.out.println("Hai scelto " + numeroUtente);
				System.out.println("Il computer ha scelto " + numeroComputer);
				int somma = numeroUtente + numeroComputer;
				if ((somma % 2) == 0) { //pari
					if (sceltaUtentePari) {
						System.out.println("Vince utente");
					} else {
						System.out.println("Vince il computer");
					}

				} else {
					if (!sceltaUtentePari) {
						System.out.println("Vince utente");
					} else {
						System.out.println("Vince il computer");
					}
				} 
			} else {
				System.out.println("Numero non valido");
			}
				
			
		}
		
		
		//chiudo lo scanner
		scan.close();

	}

}
