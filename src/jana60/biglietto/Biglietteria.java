package jana60.biglietto;


import java.util.Scanner;

public class Biglietteria {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Benvenuto in TreniFiore");
	    System.out.print("Inserire i KM da percorrere:");
	    int kilometri = scan.nextInt();
	    System.out.print("Inserire l'eta del passeggiero:");
	    int passeggero = scan.nextInt();
	    
	    Biglietto biglietto = new Biglietto(kilometri, passeggero);
	    
	    System.out.println("Importo da pagare: " + biglietto.getprezzofinale());    
	    
	    scan.close();
	}
}
