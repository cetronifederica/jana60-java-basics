package EsercizioArray;

public class GiorniSettimana {

	public static void main(String[] args) {
		// esercizio in live coding Array 
		
		// se conosco già i valori e li voglio inizializzare devono essere 
		// messi tutti su una linea, non posso inizializzarlo dopo
		// String[] giorniSettimana = {"Lun" , "Mar", "Merc" , "Gio" , "Ven" , "Sab" , "Dom"};

		String[] giorniSettimana; // posso anche String[] giornisettimana = new String[7];
		giorniSettimana = new String[7];
		
		giorniSettimana[0] = "Lun";
		giorniSettimana[1] = "Mar";
		giorniSettimana[2] = "Mer";
		giorniSettimana[3] = "Gio";
		giorniSettimana[4] = "Ven";
		giorniSettimana[5] = "Sab";
		giorniSettimana[6] = "Dom";
		
		
		int totaleGiorni = giorniSettimana.length;
		
		System.out.println("I giorni della settimana sono: " + giorniSettimana.length);
		System.out.println("IL primo giorno della settimana è: " + giorniSettimana[0]);
		System.out.println("Il secondo giorno della settimana è: " + giorniSettimana[totaleGiorni - 1]);
		
		
		// array con un ciclo
		// con questa cosa possiamo leggere qualsiasi contenuto di qualsiasi array ? 
		for (int index = 0; index < giorniSettimana.length; index++) {
			System.out.println(giorniSettimana[index]);
		}
		
		
		// array di interi
		//int[] mieiNumeri = new int[10];
		
		
		
		
		
		
		
		
		
		
	}

}
