//employeeDecorator implements Employee
public abstract class EmployeeDecorator implements Employee {
	protected Employee employee;
	
	//employee constructor
	protected EmployeeDecorator(Employee employee) {
		this.employee = employee;
		
	}
	
	//join function that calls the has the employee data member call the join function
	public void join(Date joinDate) {
		employee.join(joinDate);
	}
	//terminate function that calls the has the employee data member call the terminate function
	public void terminate(Date termninateDate){
		employee.terminate(termninateDate);
	}
	//setName function that calls the has the employee data member call the setName function
	public void setName(String name) {
		employee.setName(name);
	}
	//getName function that calls the has the employee data member call the getName function
	public String getName(){
		return employee.getName();
	}
}
