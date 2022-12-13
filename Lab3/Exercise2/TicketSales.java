/**
 * TicketSales
 */
public class TicketSales {
//private data members declared for AgeStrategy and TaxStrategy
    private AgeStrategy ageStrategy; 
    private TaxStrategy taxStrategy; 
    //constructor for TicketSales
    TicketSales(TaxStrategy tax, AgeStrategy age){
        ageStrategy = age;
        taxStrategy = tax;

    }
//setter and getter functions for the AgeStrategy and TaxStrategy
    public void setAgeStrategy(AgeStrategy age){
        ageStrategy = age; 
    }

    public AgeStrategy getAgeStrategy(){
        return ageStrategy;
    }
    public void setTaxStrategy(TaxStrategy tax){
        taxStrategy = tax;
    }
    public TaxStrategy getTaxStrategy(){
        return taxStrategy;
    }
//getPrice function that is calculated by finding the Ticket price and then find the sales tax based on the price
//the Ticket Price and Sales tax is then added up to create the price
    public double getPrice(){
    double price = 0; 
    double ticketSale = ageStrategy.getTicketPrice();
    double tax = taxStrategy.getSalesTax(ticketSale);
    price = ticketSale + tax;
   return price;      
    }
}