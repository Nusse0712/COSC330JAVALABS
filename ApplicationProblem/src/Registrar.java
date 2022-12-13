//public class Registrar
public class Registrar {
//evaluate function passes through the application and the criteria
	public boolean evaluate(Application theApp, EvaluationCriteria criteria ) {
		//success is determined by the evaluate function of the certain criteria
		boolean success = criteria.evaluate(theApp);
		//return success
		return success; 
	}
}
