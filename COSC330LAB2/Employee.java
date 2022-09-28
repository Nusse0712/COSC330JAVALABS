
public class Employee{
//employee class attributes
	private String firstName; 
	private String lastName; 
	private double baseSalary; 
	private String jobTitle; 

//constructor for Employee class
public Employee(String fname, String lname,String jTitle, double salary) {
	firstName = fname; 
	lastName = lname; 
	jobTitle = jTitle;
	baseSalary = salary; 
	 
}

//set and get functions for first name 
public void setFirstName(String fname) {
	firstName = fname; 
}


public String getFirstName() {
	return firstName; 
}

//set and get functions for last name 
public void setLastName(String lname) {
	lastName = lname;
}

public String getLastName() {
	return lastName; 
}

//set and get functions for job title
public void setJobTitle(String jTitle) {
	jobTitle = jTitle;
}

public String getJobTitle() {
	return jobTitle;
}

//set and get functions for base salary
public void setBaseSalary(double salary) {
	baseSalary = salary;
}
public double getBaseSalary(){
	return baseSalary; 
}

//function that calculates the salary 
public double calculateSalary() {
	return baseSalary; 
}

//function that displays the name of the employee
public void displayName() {
	System.out.println("First Name: "+firstName+", Last Name: "+lastName);
}
//function that displays the base salary 
public void displayBaseSalary() {
	System.out.println("Base Salary: "+baseSalary+" dollars");
}
//function that displays the job title
public void displayJobTitle() {
	System.out.println("Job Title: "+jobTitle);
}
//function that displays all of the information about the employee by combining member functions 
public void displayInformation() {
	displayName(); 
	displayBaseSalary(); 
	displayJobTitle(); 
}

}





