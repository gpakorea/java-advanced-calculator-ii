/*
 * Project: While Calculator
 * Description: A calculator that exits on 'X' or performs an operation.
 * Name: Aaron Snowberger
 * Date: Sept 17, 2015
 */

import java.util.Scanner;

public class WhileCalc {
  
  public static void main( String[] args ) {
    
    Scanner s = new Scanner( System.in );
    
    double num1, num2;
    char operand = ' '; 
    
    while ( operand != 'x' ) {
      
      System.out.println( "\nEnter the operand: A = Addition, S = Subtraction, M = Multiplication, D = Division, X = Exit" );
      String input = s.next();       // Get the operand
      operand = input.charAt(0);     // Store operand as a character
      if ( operand == 'x' || operand == 'X' ) break;   // Exit the loop
      
      System.out.println( "Enter the first number: " );
      num1 = s.nextDouble();
      System.out.println( "Enter the second number: " );
      num2 = s.nextDouble();
      
      switch ( operand ) {
        
        case 'A': // Addition
        case 'a':
          System.out.println( num1 + " + " + num2 + " = " + (num1+num2) );
          break;
        case 'S': // Subtraction
        case 's':
          System.out.println( num1 + " - " + num2 + " = " + (num1-num2) );
          break;
        case 'M': // Multiplication
        case 'm':
          System.out.println( num1 + " * " + num2 + " = " + (num1*num2) );
          break;
        case 'D': // Division
        case 'd':
          System.out.println( num1 + " / " + num2 + " = " + (num1/num2) );
          break;
        default: // Error handling
          System.out.println( "Error: Only enter A, S, M, D, or X! ");
     
      } // switch
      System.out.println( "Finished switch" );
    } // end while loop
    
  } // end main method
  
} // end class





