public class UnitedStates implements TaxStrategy {
        //calculates the price of the tax based on the price of the ticket and Country (United States)
    public double getSalesTax(double sales){
        double tax = sales * .06; 
        return tax;  
    }
    
}
