package jana60.biglietto;

import java.text.DecimalFormat;

public class Biglietto {
			
	        private int km;
			private int anni;
			private DecimalFormat formatter = new DecimalFormat("#.##€");
		    
		    
		    public Biglietto(int km, int anni) {
				
				this.km = km;
				this.anni = anni;
			
		    }
		    
		    //METODO
		    private String prezzofinale() {
		    double prezzo = km * 0.21;	
		    if (anni < 18) {
				   return formatter.format(prezzo - ((prezzo / 100)* 20));
				 }
			    else if (anni > 65) {
			    	return formatter.format(prezzo - ((prezzo / 100)* 40));	
				}
			    else {
				return formatter.format(prezzo);
				}
		    }
            
		    public String getprezzofinale() {
		    	return prezzofinale();
		    }
		    
}
