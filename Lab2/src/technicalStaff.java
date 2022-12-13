//the class technicalStaff is a subclass of Employee
public class technicalStaff extends Employee {
//data member of the class 	
	private double profitShare; 

//class constructor 
	public technicalStaff(String fname, String lname,String jTitle, double salary,double share) {
		super( fname,lname,jTitle,salary); 
		profitShare = share; 
	}
	
//set and get functions for profitShare  
	public void setProfitShare(double share) {
		profitShare = share;
	}
	
	public double getProfitShare(){
		return profitShare; 
	}
//function that displays the profit share 
	public void displayProfitShare() {
		System.out.println("Profit Share: "+profitShare);
		
	}
//function that calculates the total salary 
	public double calculateSalary() {
		double totalSalary = super.calculateSalary(); 
		totalSalary = totalSalary+profitShare; 
		return totalSalary;	
	}
//function that displays all the information of the technical staff
	public void displayInformation(){
		super.displayInformation();
		displayProfitShare(); 
	}
}
