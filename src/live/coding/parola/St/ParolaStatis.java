package live.coding.parola.St;

public class ParolaStatis {

	// spiagazione parola static

	// se voglio che questo contatore sia modificabile anche dalle sottoclassi
	// e quindi far diventare questo counter un attibuto della classe e non dello
	// scope allora metto dopo il private la parola static

	// USIAMO QUESTA PAROLA PRINCIPALMENTE PER LE COSTANTI E PER I METODI

	// esempio per quanto riguarda le variabili
	// contatore
	private static int counter = 0;

	// attributi
	private int codice;
	private String nome;
	private String marca;
	private double prezzo;

	// costruttore
	public ParolaStatis(int codice, String nome, String marca, double prezzo) {
		super();
		this.codice = counter; // non lo prende più dall'esterno ma prende come codice
		// il valore del contatore
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		counter++; // va messo nel costruttore
	}

	// PAROLA STATIC CON I METODI
	//
	public static int rettangolo(int base, int altezza) {
		return base * altezza;
	}

	// così quando vado nella classe main posso richiamare direttamente rettangolo
	// che mi calcola area direttamente nelle variabili tra parentesi
	// SONO METODI PIù GENERICI CHE POSSO RICHIAMARE IN GENERALE NELLA CLASSE
	// POSSO RICHIAMARLO NEL MAIN SENZA CRARE NUOVA ISTANZA DI RETTANGOLO
	// MA SEMPLICEMENTE POSSO FARE COSì:
	int area = ParolaStatis.rettangolo(5, 10);

	// dichiarare il costruttore come private
	// così nella classe main nessuno la può richiamare e quindi istanziare un nuovo
	// oggetto con quella
	// classe oggetto

	// esempio di costruttore privato
	// questo è un patter per esempio:
	private ParolaStatis() {
		// costruttore privato
	}
}
