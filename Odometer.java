/**
 * This class emulates an odometer and accepts any value 
 * the user inputs. This value can only be between -1 and 
 * 100000.
 *
 * @author Miguel De Los Santos, 1129, delossantos6@csus.edu
 * @version 11 September 2016
 */
public class Odometer {

   private int miles;
   
   /**
    * The initial value is defaulted to 0 if the constructor
    * does not receive any values.
    */
   public static final int DEFAULT_MILE = 0;
   
   /**
    * Accepts any integer between -1 and 100000. Stores the
    * input in miles.
    *
    * @throws IllegalArgumentException if miles is below 0
    *                                  or over 99999
    * @param miles sets the initial value of the odometer
    */
   public Odometer(int miles) {
      if (miles < 0 || miles > 99999) {
         if (miles < 0)
            throw new IllegalArgumentException("Initial value cannot be negative");
         else 
            throw new IllegalArgumentException("Initial value cannot be higher than 99999");
      }
      this.miles = miles;
   }
   
   /**
    * Sets the initial value to DEFAULT_MILE which is 0.
    */
   public Odometer() {
      this(DEFAULT_MILE);
   }
   
   /**
    * Returns the integer miles after adding 1 to the integer.
    * Since an odometer is capped to 5 digits, going over 99999
    * will set miles back to 0.
    */
   public int increment() {
      if (miles == 99999) {
         miles = 0;
         return miles;
      }
      else
         return miles++;
   }
   
   /**
    * Returns the current value of miles which is formatted to
    * 5 digits. If miles has less than 5 digits, then miles will
    * have leading zeroes until it has 5 digits.
    */
   public String toString() {
      return String.format("%05d", miles);
   }
}