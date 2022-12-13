//class EmployeeImpl implements Employee
public class EmployeeImpl implements Employee {
	String name = "Unknown Employee";
	//join function that displays the name and the join date
	public void join(Date joinDate) {
	  System.out.println(this.getName() +" joined on "+joinDate.getDate());
	}
	//terminate function that displays the name and the terminate date
	public void terminate(Date terminateDate){
	  System.out.println(this.getName() +" was terminated on "+ terminateDate.getDate());

	}
	//setName function that sets the name
	public void setName(String name) {
		this.name = name;
	}
	//getName function that gets the name
	public String getName() {
		return name;
	}
	
	

}
