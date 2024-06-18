public class TaxCalculator {

    public class calculateTax(double income) {
        double tax = 0.0;
        
        if (income <= 250000) {
            tax = 0.0;
        } else if (income >= 250001 && income <= 500000) {
            tax = income * 0.10;
        } else if (income > 500000 && income <= 1000000) {
            tax = income * 0.20;
        } else {
            tax = income * 0.30;
        }
        
        return tax;
    }
 
    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator();
        double income = 600000;         double tax = calculator.calculateTax(income);
        
        System.out.println("Tax for income " + income + ": " + tax);
    }
}