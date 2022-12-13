public class Canada implements TaxStrategy {
        //calculates the price of the tax based on the price of the ticket and Country (Canada)

    public double getSalesTax(double sales){
        double tax = sales * .15; 
        return tax;  
    }
    
}
