import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    /**
     * number of account.
     */
    private int accountNumber;
    /**
     * type of account.
     */
    private BankAccountType accountType;
    /**
     * balance of account.
     */
    private double accountBalance;
    /**
     * name of owner.
     */
    private String ownerName;
    /**
     * rate of interest.
     */
    private double interestRate;
    /**
     * interest that are earned.
     */
    private double interestEarned;

    /**
     *
     * @param name
     * @param accountCategory
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.ownerName = name;
        this.accountType = accountCategory;
    }

    /**
     * getting owners' name.
     * @return owners' name
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * getting the type of account.
     * @return type of account
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

}