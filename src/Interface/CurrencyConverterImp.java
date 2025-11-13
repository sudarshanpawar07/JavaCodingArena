package Interface;

class CurrencyConverterImp implements CurrencyConverter{
	
	public void  inrToUsd(double inr) {
		double data = inr /USD;
		System.out.println(inr + " rs To " +data + " USD");
		
	}
	 public void  inrToEuro(double inr) {
		 double data = inr /EURO;
		 System.out.println(inr + " rs TO " + data +" EURO");
	 }
	public  void  inrToGbp(double inr) {
		double data = inr /GBP;
		System.out.println(inr + " rs TO " + data +" GBP");
	}
	public  void  inrToYen(double inr) {
		double data = inr /YEN;
		System.out.println(inr + " rs TO " + data +" YEN");
	}
	public void  inrToAud(double inr) {
		double data = inr /AUD;
		System.out.println(inr + " rs TO " + data +" AUD");
	}
	  

}
