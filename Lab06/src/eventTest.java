
public class eventTest {

	public static void main(String[] args) {
		System.out.println("Using the Original Event Class"); 
		//using the original class and its methods
		Event event1 = new Event(); 
		event1.setNumadults(65);
		event1.setPrice();
		event1.setEventType(); 
		System.out.println(event1.getEventChoice()); 
		
		//using the refactored Event class
		System.out.println("Using the Refactored Event Class");
		EventRefactored event2 = new EventRefactored(); 
		event2.setNumAdults(65);
		event2.determinePrice();
		event2.determineEventType();
		System.out.println(event2.getEventChoice()); 
	}

}
