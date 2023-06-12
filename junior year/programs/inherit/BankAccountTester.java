package inherit;

/**
 * Name: Humna Sultan
 * Program Name: Inheritance Lab
 * Date: 13 November 2020
 * Extra: N/A
 */

public class BankAccountTester {

    public static void main(String[] args)
    {
        BankAccount harrysChecking = new BankAccount("Harry", 2000);
        SavingsAccount eviesChecking = new SavingsAccount("Evie", 4000, 0.1);
        CheckingAccount cocosChecking = new CheckingAccount("Coco", 1000);
        //objects of classes

        harrysChecking.getName();
        harrysChecking.deposit(100);
        harrysChecking.withdraw(200);
        harrysChecking.getBalance();
        System.out.println("Balance: $" + harrysChecking.toString());
        //tests class

        System.out.println("---------------------------");
        //border

        eviesChecking.getName();
        eviesChecking.deposit(100);
        eviesChecking.withdraw(200);
        eviesChecking.getBalance();
        System.out.println("Before Interest: $" + eviesChecking.toString());
        eviesChecking.addInterest();
        eviesChecking.getBalance();
        System.out.println("After Interest: $" + eviesChecking.toString());
        //tests class

        System.out.println("---------------------------");
        //border

        cocosChecking.getName();
        cocosChecking.deposit(100);
        cocosChecking.withdraw(200);
        cocosChecking.getBalance();
        System.out.println("Before Fees: $" + cocosChecking.toString());
        System.out.println("Fees: $" + cocosChecking.deductFees());
        cocosChecking.getBalance();
        System.out.println("After Fees: $" + cocosChecking.toString());
        System.out.println("Num of transactions: " + cocosChecking.getTransactionCount());
        //tests class

        if (eviesChecking instanceof BankAccount)
        {
            System.out.println("SavingsAccount is an instance of BankAccount.");
        }
        else
        {
            System.out.println("SavingsAccount is NOT an instance of BankAccount.");
        }
        //checks to see if SavingsAccount is an instance of BankAcconunt; true

        if (harrysChecking instanceof SavingsAccount)
        {
            System.out.println("BankAccount is an instance of SavingsAccount.");
        }
        else
        {
            System.out.println("BankAccount is NOT an instance of SavingsAccount.");
        }
        //checks to see if BankAccount is an instance of SavingsAccount; false

        if (cocosChecking instanceof BankAccount)
        {
            System.out.println("CheckingAccount is an instance of BankAccount.");
        }
        else
        {
            System.out.println("CheckingAccount is NOT an instance of BankAccount.");
        }
        //checks to see if CheckingAccount is an instance of BankAccount; true

        if (harrysChecking instanceof CheckingAccount)
        {
            System.out.println("BankAccount is an instance of CheckingAccount.");
        }
        else
        {
            System.out.println("BankAccount is NOT an instance of CheckingAccount.");
        }
        //checks to see if BankAccount is an instance of CheckingAccount; false
    }
}
