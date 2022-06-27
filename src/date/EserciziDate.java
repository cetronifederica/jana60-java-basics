package date;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class EserciziDate {
	public static void main(String[] args) {
		// questa classe ha un sacco di metodi statici

		// data corrente
		LocalDate oggi = LocalDate.now();
		System.out.println(oggi);

		// la mia data di nascita
		LocalDate compleanno = LocalDate.of(1997, 3, 3);

		// per confrontare se una data è prima dell'altra o meno

		oggi.isAfter(compleanno);

		oggi.isBefore(compleanno);

		oggi.isEqual(compleanno);

		// calcolare quanto tempo è passato tra una data e l'altra

		Period eta = Period.between(compleanno, oggi);
		System.out.println("Lamia età: " + eta.getYears());

		// per formattare la data
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println(formatter.format(compleanno));
	}
}
