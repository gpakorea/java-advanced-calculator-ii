/*
 * Project: Goofing off with ASCII
 * Description: Goofing off with ASCII
 * Name: Aaron 
 * Date: Sept 18, 2015
 */

public class Ascii {
  
  public static void main( String[] args ) {
  
    char bigLetter = '8';
    int bigNum = bigLetter + 0;
    System.out.println( bigLetter + "'s int is " + bigNum );
    
    int pause = bigLetter + 32;
    char smallLetter = (char) (pause);
    System.out.println( smallLetter + "'s int is " + pause );
    
    System.out.println( "The difference " + smallLetter + "-" + bigLetter + " is " + (pause - bigNum) );
    
  } // end main method
  
} // end class




