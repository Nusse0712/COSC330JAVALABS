//the testEngineer class is a subclass of technicalStaff 
public class testEngineer extends technicalStaff {

//class constructor 
	public testEngineer(String fname, String lname, double salary, String jTitle,double share){
		super(fname,lname,jTitle,salary,share); 	
	}
//function that calculates salary  of the employee	
	public double calculateSalary() {
		double totalSalary; 
		totalSalary = super.getBaseSalary()+super.getProfitShare(); 
		return totalSalary; 
	}
//displays all the information of the employee 
	public void displayInformation() {
		super.displayInformation();
	}

}
