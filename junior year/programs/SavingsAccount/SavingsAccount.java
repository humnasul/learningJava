package SavingsAccount;

/**
 * Name: Humna Sultan
 * Program Name: Chap. 3 P3.3
 * Date: 23 September 2020
 * Extra: More testing in testing class
 */
public class SavingsAccount {
    double savings;
    double interest;
    //instance variables
    /**
     MAIN METHOD: creates an object for testing
     */
    public static void main(String[] args) {
        SavingsAccount test1 = new SavingsAccount(1000, 10);
        System.out.println("TEST 1");
        System.out.println("Savings: $" + test1.returnVal());
        test1.addInterest();
        System.out.println("Updated Savings: $" + test1.returnVal());
    }
    /**
     method to add interest to savings
     */

    public void addInterest()
    {
        savings = savings + (savings*(interest/100));
    }
    /**
     method to return savings
     @return double: current savings value in account
     */
    public double returnVal()
    {
        return savings;
    }
    /**
     method that takes parameters and puts values into instance variables
     @param userSavings: value that user inputs when declaring constructor, used to set
     instance variables
     @param userInterest: value that user inputs when declaring constructor, used to set
     instance variables
     */
    public SavingsAccount(double userSavings, double userInterest)
    {
        savings = userSavings;
        interest = userInterest;
    }

}
