//class TeamLead extends EmployeeDecorator
public class TeamLead extends EmployeeDecorator {
	//TeamLead constructor, passes through employee and calls the super(the constructor of the employee decorator)
	protected TeamLead(Employee employee){
		super(employee);
	}
	//specific to class TeamLead tasks
	public void planning(){
		System.out.println(this.employee.getName() + " is planning"); 
		
	}
	
	public void motivate() {
		System.out.println(this.employee.getName()+" is motivating his team");
	}

}
