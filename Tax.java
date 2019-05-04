import java.util.Scanner;

public class Tax{
	
	private double rate;
	private double base;
	
	private static final double AB = 0.5;
	private static final double BC = 0.12;
	private static final double MN = 0.13;
	private static final double NB = 0.15;
	private static final double NF = 0.15;
	private static final double NWT = 0.05;
	private static final double NS = 0.15;
	private static final double NU = 0.05;
	private static final double ON = 0.13;
	private static final double PEI = 0.15;
	private static final double QC = 0.14975;
	private static final double SK = 0.11;
	private static final double YK = 0.05;
	
	public Tax(double rate, double base){
		this.rate = rate;
		this.base = base;
	}
	
	public void setRate(double rate){
		this.rate = rate;
	}
	
	public void setBase(double base){
		this.base = base;
	}
	
	public double getRate(){
		return rate;
	}
	
	public double getBase(){
		return base;
	}
	
	public double calcTax(Tax tax){
		return tax.base * tax.rate;
	}
	
	public double calcTotal(Tax tax){
		return tax.base *  tax.rate + tax.base;
	}


}