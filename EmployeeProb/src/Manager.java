//class manager extends EmployeeDecorator
public class Manager extends EmployeeDecorator {
	//Manager constructor, passes through employee and calls the super(the constructor of the employee decorator)
	protected Manager(Employee employee){
		super(employee);
	}
	
	//specific to class manager tasks
	public void assignTask() {
		System.out.println(this.employee.getName()+"is assigning tasks");
	}
	
	public void profileEmployee(){
		System.out.println(this.employee.getName()+" is profiling employees");
	}
	
	public void createRequirements() {
		System.out.println(this.employee.getName()+" is creating required documents");
	}

}
