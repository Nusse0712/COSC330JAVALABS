//class Executive extends the manager class 
public class Executive extends Manager {
	private double stockOption; 
//constructor for the Executive class 
	public Executive(String fname, String lname,String jTitle, double salary,double bonus,double stock){
		super(fname,lname,jTitle,salary,bonus);
		stockOption = stock; 
	}
//set and get methods for profit sharing
	public void setStockOption(double stock) {
		stockOption = stock;
	}
	
	public double getStockOption(){
		return stockOption; 
	}
//function that displays the profit share 
	public void displayStock() {
		System.out.println("Stock Option: " + stockOption);
	}
//function that calculates the salary 
	public double calculateSalary() {
		double totalSalary = super.calculateSalary(); 
		totalSalary = totalSalary +stockOption;
		return totalSalary;
	}
/* displays all of the information of the Executive by calling the same function from the super class and then calling the 
 * displayProfitShare member function 
 * 
 */
	public void displayInformation(){
		super.displayInformation();
		displayStock(); 
	}
}
