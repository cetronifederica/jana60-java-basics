package jana60;

public class BookStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// titolo
		String titolo = "9 algoritmi che hanno cambiato il futuro";
		System.out.println("Titolo:" + " " + titolo);
		
		
		// formato
		boolean copertinaFlessibile = true;
		boolean formatoKindle = false;
		// data di pubblicazione
		short giornoPubblicazione = 1;
		short mesePubblicazione = 11; 
		int annoPubblicazione = 2012;
		
		// autore
		String autore = "john McCormick";
		
		// rating
		float rating = 4.3F;
		int numeroVoti = 23;
		
		// descrizione
		String descrizione = "Quotisiamente, senza pensarci troppo, con i nostri strumenti tecnologici";
		
		// prezzo
		float prezzoFinale = 17.10f;
		float prezzoConsigliato = 18.00f;
		double sconto = 0.05;
		double scontoSulPrezzo = prezzoConsigliato * sconto;
		double prezzoFinaleScontato = prezzoConsigliato - scontoSulPrezzo;
		
		System.out.println("Prezzo Consigliato: " + prezzoConsigliato);
		System.out.println("Scontato del: " + sconto * 100 + "%");
		System.out.println("Meno " + scontoSulPrezzo + " euro");
		System.out.println("Prezzo Finale Scontato: " + prezzoFinaleScontato + " euro");
		// editore 
		String editore = "Apogeo Education"; 
		
		// isbn-10
		String isbn = "8838787999";
		
		// dimensioni
		float altezza = 21f; 
		float profondita = 1.7f; 
		float larghezza = 13.7f;
		System.out.print("Dimensioni:" + altezza + " " + "x" + " " + profondita + " " + "x" + " " + larghezza + " " + " " + "cm");
		

	}

}
