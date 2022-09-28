//Manager class is a subclass to the Employee class 
public class Manager extends Employee {

	private double bonusPayment; 
	
//constructor for the manager class
	public Manager(String fname, String lname,String jTitle, double salary,double bonus){
		//uses super to call the constructor from the employee class
		super( fname,lname,jTitle,salary); 
		bonusPayment = bonus; 
	}
//get and set functions for the bonus payment	
	public void setBonusPayment(double bonus) {
		bonusPayment= bonus;
	}
	
	public double getBonusPayment() {
		return bonusPayment; 
	}
//function that calculates salary 
	public double calculateSalary() {
//totalSalary is initialized as result of calculateSalary from the parent class
		double totalSalary= super.calculateSalary();
//bonus payment is added to the total salary
		totalSalary = totalSalary + bonusPayment; 
		return totalSalary; 
	}
//displays the bonus 
	public void displayBonus() {
		System.out.println("Bonus Payment: "+bonusPayment ); 
	}
//displays all of the information by calling the displayInformation class from the superclass (Employee)
	public void displayInformation() {
		super.displayInformation();
		displayBonus(); 
	}
	
}
