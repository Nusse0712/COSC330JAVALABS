
public class EmployeeTest {

	public static void main(String[] args) {
//test class for the Employee problem 
		
		//declaring a new employee object and setting parameters
		Employee employee1 = new EmployeeImpl();
		Date Startdate = new Date("7/12/2000");
		Date Enddate = new Date("10/6/2022");
		employee1.setName(" Cole Nussear "); 
		
		//declaring a new manager object and passing through the employee object to make the employee a manager
		Manager manager1 = new Manager(employee1); 
		//calling manager functions
		manager1.assignTask();
		manager1.createRequirements();
		//calling the employeeDecorator functions
		manager1.join(Startdate);
		manager1.terminate(Enddate);
		
		employee1.setName(" John Jones"); 
		TeamLead teamLead1 = new TeamLead(employee1); 
		teamLead1.motivate();
		teamLead1.planning();
		
		
	}

}
