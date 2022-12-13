import java.util.Scanner;
/* EventRefactored Class. I took the methods from the Event class and 
 * refactored them. The main problem with the original Event class is
 * the methods are too long and have too many functions for that specific method.
 * The other main problem with the Event class was the use of pointless temporary variables.
 * I used the Extract method and the Inline temp method to refactor my code so my methods would not
 * be as long and convoluted and the code could be easily readable
 * */
public class EventRefactored {
	Scanner input = new Scanner(System.in);
	   private int numadults;
	   private String eventChoice; 
	   private int price;
	  //added a constructor and default constructor to the class (just a basic improvement) 
	public EventRefactored() {
		this.numadults = 0;
		this.eventChoice = " "; 
		this.price = 0; 
	}
	
	public EventRefactored(int numadults, String eventChoice, int price){
		this.numadults = numadults; 
		this.eventChoice = eventChoice; 
		this.price = price; 
	}
	public void setNumAdults(int numadults){
		this.numadults = numadults;
	}  
	
	public int getNumAdults(){
		return numadults; 
	}
	//used the extract method to create a proper setPrice method and turned the local variable total into the variable price  
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice() {
		return price; 
	}
	//added a getter method to the price 
	//used the extract method to display the numadults and the total
	public void displayPrice(){
		
		System.out.println("there are "+this.getNumAdults()+" people in your party");
	    System.out.println("since there is " + this.getNumAdults() + " in your party,your total will be " +this.getPrice() + " dollars.");
	}
	//used the extract method to print the discount message 
	public void displayDiscount(){
		if(this.getNumAdults() >= 50) {
			System.out.println("since you have selected over 50 people, which is a large party, you get a discount!!!");
		}else{
			System.out.println("no discount for you :(");
		}
	}
	//used the extract method to make the calculation of the total to be its own method
	public int calculatePrice(int num){
		int temp = getNumAdults() * num; 
		
		return temp;
	}
	//the new refactored setPrice method that just determines the price based on the number of adults, calculates the price and sets the Price. then it displays the price
	//like the Event Code before it 
    public void determinePrice(){
        if(this.getNumAdults() >= 50){
        this.setPrice(calculatePrice(32));
        displayDiscount();
        }else{
         this.setPrice(calculatePrice(35));
        displayDiscount();
        }
        displayPrice();  
    }
    //using the extract method to give the Event class a proper setter for the eventChoice variable
    public void setEventChoice(String eventChoice) {
    	this.eventChoice = eventChoice; 
    }
    //using the extract method to display the choice menu
    public void displayChoiceMenu(){
    	 System.out.println("Event Type options");
         System.out.println("(0) Wedding");
         System.out.println("(1) Baptism");
         System.out.println("(2) Birthday");
         System.out.println("(3) Corporate");
         System.out.println("(4) Other");
    }
    //using the extract method to find the choice
    public int getChoice(){
    	 int choice;
    	 System.out.println("please enter your option >>");
         choice = input.nextInt();
         if(choice > 4){
         choice = 4;
         
         }
    	return choice; 
    }
    
    public void determineEventType(){
        //calling the new displayChoiceMenu function
        displayChoiceMenu();
        String eventTypes[] = {"Wedding", "Baptism", "Birthday", "Corporate", "Other"};
        //using the inline temp method to get rid of any unnecessary temp variables and just using the setEventChoiceFunction to set the eventChoice
        this.setEventChoice(eventTypes[getChoice()]);
        }
    
    public String getEventChoice(){
        return eventChoice;
        }
}
