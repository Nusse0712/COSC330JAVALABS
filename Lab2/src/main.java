
public class main {

	public static void main(String[] args) {
//declaring an array of employee objects called empList 	
	Employee[] empList = new Employee[3]; 
//declaring three variables 
	Executive emp0 = new Executive("John","Doe","Executive",100000,500,200);
	softwareEngineer emp1 = new softwareEngineer("Bill","Smith",75000,"Software Engineer",200,50);
	testEngineer emp2 = new testEngineer("Tom","Jones",20000,"Test Engineer",20); 

//assigning the values of the different subclass objects to the elements of the Employee object array 
	empList[0] = emp0; 
	empList[1] = emp1; 
	empList[2] = emp2; 

//loop that has each element of the array use the displayInformation function
	for(int i =0; i < 3; i++){
		empList[i].displayInformation();
		System.out.println(); 
	}

	emp0.displayInformation();
	System.out.println();
	emp1.displayInformation();
	System.out.println(); 
	emp2.displayInformation();
	
	
		
		
	}

}
