public class mainEx2 {
    

    public static void main(String[] args){
        //declaring a new ticket with an Australian AgeStrategy and an Adult TaxStrategy
        TicketSales ticket1 = new TicketSales(new Australia(), new Adult());
        //initializing a variable with the getPrice function of Ticket1
        double price = ticket1.getPrice();
        //printing out the price
        System.out.println("The price is: $"+ price);
        //changing the AgeStrategy to Child using the setAgeStrategy function and calculating the price
        ticket1.setAgeStrategy(new Child());
        price = ticket1.getPrice();
        System.out.println("The price is: $"+ price);

        //changing the taxStrategy to the United States 
        ticket1.setTaxStrategy(new UnitedStates());
        price = ticket1.getPrice();
        System.out.println("The price is: $"+ price);

        //changing the AgeStrategy and TaxStrategy using the functions setAgeStrategy and setTaxStrategy 
        ticket1.setTaxStrategy(new Canada());
        ticket1.setAgeStrategy(new Senior());

        //a new ticketSales object is declared 
        //the new AgeStrategy and TaxStrategy for this ticket is determined by the gettr functions of ticket1
        TicketSales ticket2 = new TicketSales(ticket1.getTaxStrategy(),ticket1.getAgeStrategy());
        double price2 = ticket2.getPrice(); 
        System.out.println("The price is: $"+ price2);
    }
}
