package inherit;

/**
 * Name: Humna Sultan
 * Program Name: Inheritance Lab
 * Date: 13 November 2020
 * Extra: N/A
 */

//SavingsAccount.java

/**
 *
 * Simulates a savings account on which interest can
 * 			be earned.
 * @author S. Andrianoff
 * @version July 21, 2014
 *
 */

public class SavingsAccount extends BankAccount
{
    private double interestRate;

    /**
     * Constructs a savings account from
     * 	a customer name, an initial balance, and an
     * 	interest rate.
     * @param name customer's name
     * @param balance initial balance
     * @param rate interest rate
     */
    public SavingsAccount(String name, double balance, double rate)
    {
        super(name, balance);
        interestRate = rate;
    }

    /**
     * Adds interest to the balance using the interest rate.
     */
    public void addInterest()
    {
        double current;
        current = this.getBalance();
        this.deposit(interestRate*current);
    }

    /**
     * returns balance as a string value
     * @param - String of balance
     */
    public String toString()
    {
        return String.valueOf(balance);
    }

}

