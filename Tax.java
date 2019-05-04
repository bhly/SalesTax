import java.util.Map;
import java.util.HashMap;

/**
This program calculates sales tax on a user-submitted dollar amount,
based on the provincial sales tax rate.
@author Brynn Haley
*/
public class Tax{
	
	/**
	The name of a Canadian province, in abbreviated form (ie. NB).
	*/
	private String province;
	/**
	The original dollar amount before tax.
	*/
	private double base;
	/**
	The sales tax percentage in a given province, represented as a decimal (ie 15% = 0.15).
	*/
	private double rate;
	
	/**
	Stores province names (ie. "NB") as keys and their correspoding tax rates as values in decimal form.
	*/
	private HashMap<String, Double> map; 
      
	/**
	Populates map with provinces and their tax rates.
	*/
	public void populate(){
		map = new HashMap<String, Double>(); 
		map.put("AB", 0.05); 
       map.put("BC", 0.12); 
       map.put("MN", 0.13); 
       map.put("NB", 0.15); 
	   map.put("NF", 0.15); 
	   map.put("NWT", 0.05); 
	   map.put("NS", 0.15); 
	   map.put("NU", 0.05); 
	   map.put("ON", 0.13); 
	   map.put("PEI", 0.15); 
	   map.put("QC", 0.14975); 
	   map.put("SK", 0.11); 
	   map.put("YK", 0.05); 
	}
	
	/**
	Constructs a Tax object.
	@param provincee The province's abbreviation (ie. AB).
	@param base The before-tax dollar amount.
	*/
	public Tax(String province, double base){
		this.province = province;
		this.base = base;
	}
	
	/** 
	Sets the province name based on user input.
	@param province The abbreviated name of the province.
	*/
	public void setProvince(String province){
		this.province = province;
	}
	
	/**
	Sets the before-tax dollar amount to be calculated for sales tax.
	@param base The before-tax amount.
	*/
	public void setBase(double base){
		this.base = base;
	}
	
	/**
	Calculates the amount of tax to be paid based on the original dollar amount
	and the province in which the purchase is being made.
	@param tax The user-provided province and original before-tax dollar amount.
	@return (tax.base * tax.rate) The amount of tax to be paid.
	*/
	public double calcTax(Tax tax){
		rate = map.get(tax.province);
		return tax.base * tax.rate;
	}
	
	/**
	Calculates the new total amount to be paid with the tax factored in.
	@param tax The province and original before-tax dollar amount.
	@return (tax.base *  tax.rate + tax.base) The total amount due after tax.
	*/
	public double calcTotal(Tax tax){
		rate = map.get(tax.province);
		return tax.base *  tax.rate + tax.base;
	}
}