package list;

import java.util.ArrayList;
import java.util.Collections;

public class EsempiConLeListe {

	public static void main(String[] args) {
		// esempi list e collection

		ArrayList<String> listaDiStringhe = new ArrayList<String>();
		// ora ho una lista vuota
		// se la stampo mi stampa [] che è un contenitore vuoto

		listaDiStringhe.add("Ciao");
		listaDiStringhe.add("Ciao Matteo");
		listaDiStringhe.add("Ciao Federica");

		System.out.println(listaDiStringhe);
		// li stampa in ordine di inserimento nel codice

		// rimuovere elementi
		listaDiStringhe.remove(1); // rimuove "ciao matteo"
		// quindi gli elementi slittano di una posizione
		System.out.println(listaDiStringhe);

		// ritorna cosa ha rimossso
		String elementoRimosso = listaDiStringhe.remove(1);
		System.out.println("ho rimosso: " + elementoRimosso);
		System.out.println(listaDiStringhe);

		// rimuovo altro elemento
		boolean trovatoRimosso = listaDiStringhe.remove("ducento");
		System.out.println(trovatoRimosso ? "Trovato e rimosso" : "Non Trovato");

		// stampa quanti elementi ci sono nella lista
		System.out.println("dimensione lista: " + listaDiStringhe.size());

		// mi chiedo se la lista è vuota
		System.out.println(listaDiStringhe.isEmpty());

		// se contiene un particolare elemento
		System.out.println(listaDiStringhe.contains("Ciao"));

		// ordinare la lista
		Collections.sort(listaDiStringhe);
		// non ritorna niente è un metodo void
		// verrà ordinata in base al loro contenuto, se ho una lista di
		// stringhe le ordinerà in ordine alfabetico
		System.out.println(listaDiStringhe);

		// il problema è quando per esempio ho una lista di prodotti
		// come fa java a sapere come ordinare quei prodotti?
	}

}
