//Application Class
public class Application {
	//data members of the Application class
	private double gpa, gre,toefl;
	//Default constructor of the Application class
	public Application() {
		gpa = 0.0;
		gre = 0.0;
		toefl =0.0;
		
	}
	//constructor of the Application class
	public Application(double gpa, double gre, double toefl){
		this.gpa = gpa;
		this.gre = gre; 
		this.toefl = toefl;
	}
	//set and get functions of the data members
	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
	
	public double getGPA() {
		return gpa;
	}
	public void setGRE(double gre) {
		this.gre = gre; 
	}
	public double getGRE(){
		return gre; 
	}
	public void setTOEFL(double toefl) {
		this.toefl = toefl;
	}
	public double getTOEFL(){
		return toefl; 
	}
	
}
