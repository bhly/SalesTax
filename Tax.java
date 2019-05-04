import java.util.Map;
import java.util.HashMap;

public class Tax{
	
	private String province;
	private double base;
	private double rate;
	
	private HashMap<String, Double> map; 
      
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
	
	public Map<String, Double> getMap(){
		return map;
	}
	
	public Tax(String province, double base){
		this.province = province;
		this.base = base;
	}
	
	public void setProvince(String province){
		this.province = province;
	}
	
	public void setBase(double base){
		this.base = base;
	}
	
	public String getprovince(){
		return province;
	}
	
	public double getBase(){
		return base;
	}
	
	public double calcTax(Tax tax){
		rate = map.get(tax.province);
		return tax.base * tax.rate;
	}
	
	public double calcTotal(Tax tax){
		rate = map.get(tax.province);
		return tax.base *  tax.rate + tax.base;
	}
}