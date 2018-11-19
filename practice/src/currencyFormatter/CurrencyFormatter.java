package currencyFormatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        Locale IndiaLocale=new Locale("en", "in");
        
        NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String fra=f.format(payment);
        NumberFormat u = NumberFormat.getCurrencyInstance(Locale.US);
        String us= u.format(payment);
        NumberFormat c = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china= c.format(payment);
        NumberFormat i = NumberFormat.getCurrencyInstance(IndiaLocale);
        String india= i.format(payment);
        System.out.println("US: "+us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + fra);

	}

}
