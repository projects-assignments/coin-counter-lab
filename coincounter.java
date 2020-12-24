/**
 * @author vishal patel
 * purpose of this program is to count coins
 * this is the object class for the CoinCounter object
 * A CoinCounter has a specific number of cents.  It can provide the number of dollars and the
 * number of cents that it contains. It does not have a default constructor.
 */

// CoinCounter class
public class CoinCounter
{
    //CLASS CONSTANTS
    public static final int NICKEL_VALUE = 5;
    public static final int DIME_VALUE = 10;
    public static final int QUARTER_VALUE = 25;
    public static final int DOLLAR_VALUE = 100;

    //INSTANCE FIELDS
    // instance field (one - holds the total number of cents EX:  8534 represents $85.34)
    private int value;

    //CONSTRUCTORS
    /**
     * Overloaded constructor for a CoinCounter object with a specified number of pennies, nickels, dimes and quarters
     * @param numPennies a parameter that holds the number of pennies
     * @param numNickles a parameter that holds the number of nickels
     * @param numDimes a parameter that holds the number of dimes
     * @param numQuarters a parameter that holds the number of quarters
     */
    public CoinCounter(String numPennies, String numNickles, String numDimes, String numQuarters)
    {
        int pennies = Integer.parseInt(numPennies);
        int nickles = Integer.parseInt(numNickles);
        int dimes = Integer.parseInt(numDimes);
        int quarters = Integer.parseInt(numQuarters);
        value = (pennies) + (nickles * NICKEL_VALUE) + (dimes * DIME_VALUE) + (quarters * QUARTER_VALUE);
    }
    
    //ACCESSORS
    // add remaining methods as described in directions
    /**
     * gets the dollar value from the CoinCounter object
     * @return the dollar value of the inputed coins
     */
    public int getDollars()
    {
        return value / DOLLAR_VALUE;
    }
    /**
     * gets the cents value from the CoinCounter object
     * @return the cent value of the inputed coins
     */
    public int getCents()
    {
        return value % DOLLAR_VALUE;
    }
    
    //MUTATORS
    // there will be no mutators in this class
}
