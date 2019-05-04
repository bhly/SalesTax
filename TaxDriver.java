import java.util.Scanner;

public class TaxDriver{
	
	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);
	
	Tax tax = new Tax(0,0);
	
	System.out.print("Enter before-tax dollar amount: ");
	System.out.println("");
	
	tax.setBase(scan.nextDouble());
	
	System.out.print("Enter province: ");
	System.out.println("");
	
	tax.setRate(scan.nextDouble());
	
	System.out.println("Total tax: " + tax.calcTax(tax) + "\n" + 
		"Total including tax: " + tax.calcTotal(tax));
	
	}
}

