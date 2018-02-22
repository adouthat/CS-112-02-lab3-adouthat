import java.util.Random;
public class License
{
	private String lastName;
	private String midName;
	private String firstName;
	private String dateOB;
	private String licNumber;
	private String exDate;

	Random rn = new Random();

	public License(){
		lastName = "";
		midName = "";
		firstName = "";
		dateOB = "";
		licNumber = "";
		exDate = "";		
	}

	public License(String lastname, String midname, String firstname, String dateOb){
		lastName = lastname;
		midName = midname;
		firstName = firstname;
		dateOB = dateOb;
		if(lastName.length() >= 5){
			licNumber = lastName.substring(0, 5) + (rn.nextInt(8999) + 1000);
		}
		else{
			licNumber = "invalid";
		}
		exDate = dateOB.substring(0,6) + "2028";
	}

	public String getLastName(){
		return lastName;
	}

	public String getMidName(){
		return midName;
	}

	public String getFirstName(){
		return firstName;
	}

	public String getDateOB(){
		return dateOB;
	}

	public String getLicNumber(){
		return licNumber;
	
	}

	public String getExDate(){
		return exDate;
	}

	public void setLastName(String replace){
		lastName = replace;
	}

	public void setMidName(String replace){
		midName = replace;
	}

	public void setFirstName(String replace){
		firstName = replace;
	}

	public void setDateOB(String replace){
		dateOB = replace;
	}

	public void setLicNumber(String name){
		if(name >= 5){
			licNumber = name.substring(0, 5) + (rn.nextInt(8999) + 1000);
		}
		else{
			licNumber = "invalid";
	}
}

	public void setExDate(String replace){
		exDate = replace;
	}

	public String toString(){
		return getFirstName() + " " + getMidName() + " " + getLastName() + " "+ getDateOB() + " " + getLicNumber() + " " + getExDate();
	}
}