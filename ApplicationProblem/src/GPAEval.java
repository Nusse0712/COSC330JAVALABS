//class GPAEval extends the Evaluation Criteria
public class GPAEval extends EvaluationCriteria {

	//boolean function evaluate that evaluates the applications GPA and returns true if it passes/false if not
	public boolean evaluate(Application theApp) {
		
		System.out.println("GPAEval.evaluate called");
		if(theApp.getGPA() >= 3) {
			return true;
		}else {
			return false; 
		}
		
	}
}
