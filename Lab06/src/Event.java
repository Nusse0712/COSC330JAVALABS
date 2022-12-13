import java.util.Scanner;

class Event {
     int numadults;
     String tagline ;
     String partysize;
     String eventChoice;
    
    public void setNumadults(int number){
    
           this.numadults = number;
    
    }
    public int getnumbAdults(){
    return numadults; 
    }
    
    public void setPrice(){
        int total;
        if(50 <= numadults){
        total = (32*numadults);
        System.out.println("since you have selected over 50 people, which is a large party, you get a discount!!!");
        
        }else{
            total =(35*numadults);
            System.out.println("no discount for you :(");
        }
        String price;
        price = ("there are "+numadults+" people in your party \nsince there is " + numadults + " in your party,your total will be " +total + " dollars.");
        System.out.println(price);
        this.partysize = price; 
    
    }
    public String getPrice(){
        return partysize;
    
    }
    public void setEventType(){
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Event Type options");
        System.out.println("(0) Wedding");
        System.out.println("(1) Baptism");
        System.out.println("(2) Birthday");
        System.out.println("(3) Corporate");
        System.out.println("(4) Other");
        System.out.println("please enter your option >>");
        choice = input.nextInt();
        if(choice > 4){
        choice = 4;
        
        }
        String eventTypes[] = {"Wedding", "Baptism", "Birthday", "Corporate", "Other"};
        String eventChoi =eventTypes[choice];
        this.eventChoice = eventChoi;
        
        }
    
    public String getEventChoice(){
        return eventChoice;
        }

   
    }
