/**
 * @author vishal patel
 * purpose of this program is to count coins
 * this is the tester class for the CoinCounter object
 */
// import JOptionPane
import javax.swing.JOptionPane;

//main tester class class 
public class Main
{
    public static void main(String[] args)
    {
      /* - JOptionPane code 
        // get the values of the coins from the user via JOptionPane
        String pennyStr = JOptionPane.showInputDialog("Please enter the number of pennies you have");
        String nickelStr = JOptionPane.showInputDialog("Please enter the number of nickels you have");
        String dimeStr = JOptionPane.showInputDialog("Please enter the number of dimes you have");
        String quarterStr = JOptionPane.showInputDialog("Please enter the number of quarters you have");
      */
      
      // new assignment code
        String pennyStr = "5";
        String nickelStr = "6";
        String dimeStr = "7";
        String quarterStr = "8";
        
        //Construct a CoinCounter Object
        CoinCounter coins = new CoinCounter(pennyStr, nickelStr, dimeStr, quarterStr);

        //Print out dollars and cents
        System.out.println("The total number of dollars is:\t" + coins.getDollars() + "\nThe total number of cents is:\t" + coins.getCents());
    }
}
