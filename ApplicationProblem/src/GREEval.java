//class GREEval extends the CriteriaLink
public class GREEval extends CriteriaLink
{
	//GREEval constructor that calls the constructor of the CriteriaLink
	public GREEval(EvaluationCriteria theNext){
		
		super(theNext);
	}
	//evaluate function 
	public boolean evaluate(Application theApp) 
	{
		//if statement to check if the supers evaluate function returned true before evaluating GRE
		if(super.evaluate(theApp)==true) 
		{
			
			
			System.out.println("GREEval.evaluate called");
			if(theApp.getGRE() > 3)
			{
				return true;
		    }
			else 
		    {
				return false;
		    }
		}
		else 
		{
			return false;
		}	
	}
}
