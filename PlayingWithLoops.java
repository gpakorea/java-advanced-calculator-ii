/*
 * Project: PlayingWithLoops.java
 * Description: Reviewing loops
 * Name: Aaron Snowberger
 * Date: Sept 21, 2015
 */

import java.util.Scanner;

public class PlayingWithLoops {
  
  public static void main( String[] args ) {
    
    // #1 For loop (nested)
    System.out.println( "Nested for loop example:" );
    for ( int i = 0; i < 5; i++ ) { // 1. Start; 2. Control; 3. Step
      for ( int j = 0; j < 10; j++ ) {
        System.out.print( "*" ); // commands
      }
      System.out.println();
    }
    System.out.println();
    
    // #2 While loop
    Scanner s = new Scanner( System.in );
    int total = 0, count = 0, number;
    double average;
    
    System.out.println( "Enter your grades to average them (-1 quits):" );
    number = s.nextInt(); // The first time only
    
    while ( number != -1 ) {
      total += number;
      count ++;
      
      System.out.println( "Enter your grades to average them (-1 quits):" );
      number = s.nextInt();
    }
    
    if ( count != 0 ) {
      average = (double) total/count;
      System.out.println( "Your GPA is: " + average );
    } else {
      System.out.println( "Nothing was entered." );
    }
    
    // #3 Assignment
    /* 
     * 1. Ask the user for 2 ints
     * 2. Display all odd numbers between the ints
     * (Assume 2nd num is greater)
     * (HINT: Round even ints to odd, then use for loop)
     */
    System.out.println( "\nI will print all the odd numbers between a range you enter.");
    System.out.println( "Enter the first number: " );
    int num1 = s.nextInt();
    System.out.println( "Enter the second number: " );
    int num2 = s.nextInt();
    
    if( num2 < num1 ) {
      int tmp = num2;
      num2 = num1; 
      num1 = tmp;
    }
    num1++; // make sure the range is BETWEEN and doesn't include the numbers entered
    if( num1%2 == 0 ) {
      num1++;
    }
    System.out.print( "Range: [ " );
    for ( int i = num1; i < num2; i+=2 ) {
      System.out.print( i + ", " );
    }
    System.out.println( "]" );
    
  } // end main method
  
} // end class