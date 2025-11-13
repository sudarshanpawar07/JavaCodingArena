package Interface;

public class CurrencyConverterDriver {

	public static void main(String[] args) {
		CurrencyConverter c1 = new CurrencyConverterImp();
		c1.inrToAud(100);
		c1.inrToEuro(110);
		c1.inrToGbp(120);
		c1.inrToUsd(130);
		c1.inrToYen(140);
	}

}
