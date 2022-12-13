//class TeamMember extends EmployeeDecorator
public class TeamMember extends EmployeeDecorator {
//TeamMember constructor, passes through employee and calls the super(the constructor of the employee decorator)
	protected TeamMember(Employee employee){
		super(employee);
	}
	//specific to class TeamMember tasks
	public void performTask(){
		System.out.println(this.employee.getName()+" is performing his assigned task");
	}
	
	public void coordinateWithOthers() {
		System.out.println(this.employee.getName()+" is coordinating with other members of his team");
	}

}
