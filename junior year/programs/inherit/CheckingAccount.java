package inherit;

/**
 * Name: Humna Sultan
 * Program Name: Inheritance Lab
 * Date: 13 November 2020
 * Extra: N/A
 */

public class CheckingAccount extends BankAccount {

    /**
     * Constructs a CheckingAccount from a name.
     * Initial balance is 0.
     *
     * @param n customer's name
     */
    public CheckingAccount(String n) {
        super(n);
    }

    /**
     * Constructs a CheckingAccount from a name and a balance
     *
     * @param n customer's name
     * @param b starting balance
     */
    public CheckingAccount(String n, double b) {
        super(n, b);
    }

    public double TRANSACTION_FEE = 10;
    public int trans = 0;

    /**
     * Deposits an amount into the account
     *
     * @param amount amount deposited
     * @throws IllegalArgumentException if amount is negative
     */
    public void deposit(double amount) {
        if (amount < 0.0) {
            System.out.println("Action invalid. You cannot deposit a negative value. Current balance: $" + balance);
            throw new IllegalArgumentException();
        } else {
            balance += amount;
        }
        trans++;
    }

    /**
     * Withdraws an amount from the account
     *
     * @param amount amount withdrawn
     * @throws : IllegalArgmentException if amount is greater than balance
     */
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Action invalid. You cannot take out more than the amount you have. Current balance: $" + balance);
            throw new IllegalArgumentException();
        } else {
            balance -= amount;
        }
        trans++;
    }

    /**
     * Returns the current balance in the account
     *
     * @return current balance
     */
    public String toString() {
        return String.valueOf(balance);
    }

    /**
     * Deducts transaction fees from balance
     *
     * @return updated balance
     */
    public double deductFees() {
        double newBalance = balance - (TRANSACTION_FEE * trans);
        balance = newBalance;
        return (TRANSACTION_FEE * trans);
    }

    /**
     * Returns number of transactions
     *
     * @return number of transactions
     */
    public double getTransactionCount() {
        return trans;
    }
}
