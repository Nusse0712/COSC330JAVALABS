//class TOEFLEval extends the CriteriaLink
public class TOEFLEval extends CriteriaLink {
	
	public TOEFLEval(EvaluationCriteria theNext) {
		//TOEFLEval constructor that calls the constructor of the CriteriaLink
		super(theNext);
	}
	//evaluate function 
	public boolean evaluate(Application theApp){
		
		//if statement to check if the supers evaluate function returned true before evaluating TOEFL
		if(super.evaluate(theApp)==true) {
			
			System.out.println("TOEFLEval.evaluate called");
			if(theApp.getTOEFL() > 3) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}

}
