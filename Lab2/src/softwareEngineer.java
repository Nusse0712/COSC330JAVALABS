//the class softwareEngineer is a subclass of technicalStaff
public class softwareEngineer extends technicalStaff {
//data member of the class 	
	private double overtimePay;
	
//class constructor  
	public softwareEngineer(String fname, String lname, double salary,
			String jTitle,double share, double overtime) {
		super(fname,lname,jTitle,salary,share); 
		overtimePay = overtime; 
		
	}
//set and get functions for overtimePay 	
	public void setOvertimePay(double overtime) {
		overtimePay = overtime; 
	}
	
	public double getOvertimePay() {
		return overtimePay; 
	}

//functions that displays the OvertimePay for the user 
	public void displayOvertimePay() {
		System.out.println("overtime pay: "+overtimePay);
	}
//function that calculates and returns the total salary 
	public double calculateSalary() {
		double totalSalary; 
		totalSalary = super.getBaseSalary() + overtimePay;
		return totalSalary; 
	}
/* displays all the information by calling the same function from
 * the super class and then calling the displayOvertimePay member 
 * function 
 */
	public void displayInformation() {
		super.displayInformation();
		displayOvertimePay(); 
	}
}

