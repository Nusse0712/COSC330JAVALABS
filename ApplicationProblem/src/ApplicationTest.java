
public class ApplicationTest {
//test class to test the Application 
	public static void main(String[] args) {
//declaring a new application class GPA,GRE,TOEFL		
	Application anApp = new Application(3.7,3.4,2.3);
//declaring a new registrar class
	Registrar reg = new Registrar();
	
//running the first eval by declaring a new GPAEval and calling the eval function using reg
	System.out.println("Running First Eval");
	GPAEval aGPAEval = new GPAEval(); 
	
	reg.evaluate(anApp, aGPAEval);
	
	//running the second eval by declaring a new GREEval with a new GPAEval being passed through and calling the eval function using reg
	System.out.println("Running Second Eval"); 
	GREEval aGREEval = new  GREEval(new GPAEval());
	reg.evaluate(anApp, aGREEval);
	
	//running the third eval by declaring a new TOEFLEval with a new GPAEval being passed through and calling the eval function using reg
	System.out.println("Running Third Eval");
	TOEFLEval aTOEFLEval = new TOEFLEval(new GPAEval());
	reg.evaluate(anApp, aTOEFLEval); 
	
	//running the fourth eval by declaring a new TOEFLEval EvaluationCriteria with aGREEval being passed through and calling the eval function using reg
	System.out.println("Running Fourth Eval");
	EvaluationCriteria criteria = new TOEFLEval(aGREEval);
	reg.evaluate(anApp, criteria);
	

	

	
	
	
	}
}
