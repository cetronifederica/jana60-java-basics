package jana60;

public class SistemiOperativi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int macUsers = 3;
		int windowsUsers = 20;
		
		System.out.println("Mac Users: " + macUsers);
		System.out.println("Windows Users: " + windowsUsers);
		
		int totaleUtenti = macUsers + windowsUsers;
		
		System.out.println("Totale: " + totaleUtenti);
		
		double percMac = (double) macUsers * 100.0 / (double) totaleUtenti;
		double percWindows = (double) windowsUsers * 100.0 / (double) totaleUtenti;
		
		System.out.println("Percentuale Mac: " + percMac); 
		System.out.println("Percentuale Windows: " + percWindows);
	}

}
