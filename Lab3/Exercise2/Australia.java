public class Australia implements TaxStrategy {
    //calculates the price of the tax based on the price of the ticket and Country (Australia)
    public double getSalesTax(double sales){
        double tax = sales * .10; 
        return tax;  
    }
    
}
