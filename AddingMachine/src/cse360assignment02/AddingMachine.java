package cse360assignment02;

/**
 * This program adds and subtracts numbers and returns them to the user in the form of an equation.
 *  
 * @author Hunter S. Thompson
 * @version 2.0
 *
 */

public class AddingMachine {
  private int total = 0;
  private String equation = "0";
  
  /**
   * Main method in which calls functions from the class. 
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  /**
   * Returns the current total.
   * @return the total
   */
  public int getTotal () {
	  System.out.print(total); 
	  System.out.print("\n"); 
    return total;
  }
  
  /**
   * Performs the add function in which the current value will be added to the current total.
   * @param value number to be added to the total. 
   */
  public void add (int value) {
	  total = (total + value);
	  equation += " + " + value; 
  }

  /**
   * Performs the subtract function in which the current value will be subtracted from the current total.
   * @param value number to be subtracted from the total.
   */
  public void subtract (int value) {
	  total = (total - value);
	  equation += " - " + value; 
  }

  /**
   * Outputs the equation with operations and values. 
   */
  public String toString () {  
	  System.out.print(equation + '\n'); 
    return equation;
  }

  /**
   * Clears the current equation and total.
   */
  public void clear() {
	  equation = "0";
	  total = 0;
  }
  
}