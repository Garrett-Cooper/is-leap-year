/**
 * CIT 111 Intro to Programming 
 * Assignment #5
 * 10/15/2014 
 * Author: Garrett Cooper 
 * Leap Year Method Program
 */

package leapyearprogram_hw;

import java.util.Scanner; //Import utilities package to use Scanner

public class LeapYearProgram_HW {

    public static void main(String[] args) {

        //Declare variables to be used in 'main' method:
        //'YEARMIN', 'SENTINEL','garbage', 'tempYear','console'
        
        final int YEARMIN = 1899; //constant, integer variable holding the minimum...
                                  //year constraint, or 1899.  
        final int SENTINEL = 0; //constant, integer variable used to hold...
                                //'sentinel' value, or 0.
        String garbage; //string variable used to hold improper or old values...
                        //so that they can be cleared from the console.
        int tempYear; //integer variable used to hold temporary year value.
        
        Scanner console = new Scanner(System.in); // declares console variable...
                                                  //as part of the scanner package

        //Print out program author and program information for the user.
        
        
        //Prints out information about the assignment and program, 'Leap Year'.
        System.out.println("CIT111 Fall 2014 Assignment 5"); 
        System.out.println("Garrett Cooper"); 
        System.out.println("Leap Year Method Program\n"); 
        
        System.out.println("Hello! Welcome to the Leap Year Method Program...\n");
        System.out.print("Please enter a year after 1899 to determine if"
                + " it is a leap year (or 0 to end the program) > ");

        
        //Runs a 'do-loop' until the 'sentinel' value is given by the user, or 0.
        do {
            //'While loop' that checks to see if the user entered an integer;
            //if not, the while loop prompts the user to 'try again'.  
            while (!console.hasNextInt()) {

                garbage = console.nextLine();

                System.out.print("\nPlease try again...enter a year "
                        + "(or 0 to end the program) > ");

            } tempYear = console.nextInt(); //The 'tempYear' variable holds... 
                                            //a year value.
            
            //The 'if/else if' statement checks to make sure the 'tempYear'...
            //value is not the 'SENTINEL' value (i.e. 0). Next, the 'else if'...
            //statement checks to make sure the 'tempYear' is greater than...
            //the 'YEARMIN' value, or 1899.
            if (tempYear == SENTINEL) { 

                break; //If the 'tempYear' value is the 'SENTINEL' value...
                       //the program breaks out of the if statement and loops...
                       //and prints out a '...Goodbye...' message.
                
            } 
            
            //If the 'tempYear' value is not the 'SENTINEL' value, the program...
            //calls the isLeapYear method and passes the 'tempYear' value.
            //If the 'tempYear' value is a leap year, the result will return...
            //'true', other it will return 'false'.
            //Lastly, the program will both ask the user to provide another year...
            //and clear the console to begin the loop again.
            else if (tempYear > YEARMIN) {

                System.out.println("Is " + tempYear + 
                        " a leap year? " + isLeapYear(tempYear) + ".");
                
                System.out.print("\nPlease enter another year "
                        + "(or 0 to end the program) > ");
                garbage = console.nextLine();

            } 
            
            //If the 'tempYear' is less than the 'YEARMIN' value, or 1899...
            //The console will be cleared and then the user will be asked to... 
            //'...enter a year greater than 1899'.
            else {

                garbage = console.nextLine();
                System.out.print("\nPlease enter a year greater than 1899 "
                        + "(or 0 to end the program) > ");

            }

        } while (tempYear != SENTINEL); //while the sentinel is not passed to... 
                                        // the console the program will keep...
                                        //looping.
        
    //Once the 'SENTINEL' value is passed, the program will output this...
    //'Goodbye' message.
        
    System.out.println("\nThank you for using the Leap Year Method Program. "
            + "Goodbye.\n");

    }

    //A boolean method written to determine whether or not a year is a leap...
    //year or not.
    //The definition of a leap year is a year that is evenly divisible by 400...
    //and is evenly divisible by 4 and not evenly divisible by 100.
    public static boolean isLeapYear(int year) {
        
        //'If statement' includes leap year algorithm to determine a leap year.
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true; //returns true if leap year conditions are met.
        }
            return false; //returns false is leap year conditions are not met.
    } 
    
}
