//class CriteriaLink extends EvaluationCriteria
public class CriteriaLink extends EvaluationCriteria {

	//EvaluationCriteria data member is declared
	private EvaluationCriteria next; 
	
	//constructor for CriteriaLink
	public CriteriaLink(EvaluationCriteria theNext){
		
		next = theNext;
	}
	
	//evaluate function. If next doesnt equal null it returns the result of the function next.evaluate(theApp); and if doesnt it returns true
	public boolean evaluate(Application theApp) {
		
		if(next !=null) {
			return next.evaluate(theApp);
		}else {
			return true;
		}
	}
}
