package SavingsAccount;

/**
 * Name: Humna Sultan
 * Program Name: Chap. 3 P3.3
 * Date: 23 September 2020

 * Extra: More testing in testing class
 */
public class SavingsAccountTester {
    /**
     MAIN METHOD: method for testing SavingsAccount class
     */
    public static void main(String[] args)
    {
        SavingsAccount test2 = new SavingsAccount(3000, 40);
        System.out.println("TEST 1");
        System.out.println("Savings: $" + test2.returnVal());
        test2.addInterest();
        System.out.println("Updated Savings: $" + test2.returnVal());
        System.out.println("-----------------------------------");
        SavingsAccount test3 = new SavingsAccount(2500, 50);
        System.out.println("TEST 2");
        System.out.println("Savings: $" + test3.returnVal());
        test3.addInterest();
        System.out.println("Updated Savings: $" + test3.returnVal());
        System.out.println("-----------------------------------");
        SavingsAccount test4 = new SavingsAccount(10000, 25);
        System.out.println("TEST 3");
        System.out.println("Savings: $" + test4.returnVal());
        test4.addInterest();
        System.out.println("Updated Savings: $" + test4.returnVal());
    }
}
