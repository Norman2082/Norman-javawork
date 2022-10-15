package encapsulation;

import java.security.PublicKey;

public class Mobile {
	private String brand;
	private int RAM;
	private String colour;

	public String getBrand() {
		return brand;
	}

// settings up the value for brand attributes
public void setBrand(String brand) {
switch(brand) {

case "Samsung":
this.brand = brand;
break;
case "Apple":
this.brand = brand;	
break;
case "Sony":
this.brand = brand;
break;

default:
	System.out.println("Not a valid brand");
    }
}
public int getRAM() {
	return RAM;
}

public void setRAM(int rAM) {
if(rAM>12)
{
	
  System.out.println("Invalid RAM size");
}  else { 
	this.RAM=rAM;
     }
}
public String getcolour() {
return colour;
}
	public void setcolour(String colour) {
	this.colour=colour;
	}
}

