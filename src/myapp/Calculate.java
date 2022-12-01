package myapp;

import java.io.Console;

public class Calculate {

    public static void main(String[] args) {
        
        Console cons = System.console();

        int counter = 0;

        int sum = 0;

        boolean stopAdding = false;

        while(!stopAdding) {

            String input = cons.readLine("Enter an integer (or enter 'stop' to exit): \n").trim();
            if(input.equals("stop"))
            {
                System.out.println("Exiting program...");
                stopAdding = true;
            }

            else {
                try {
                    int parsedint = Integer.parseInt(input);
                    sum += parsedint;
                    counter++;
                } catch (NumberFormatException e) {
                    System.err.println("Please only enter integers or 'stop' to exit.\nPlease try again.");
                    System.out.println();
                }
  
            }
            
        }

        System.out.printf("The sum of %d numbers is %d \n", counter, sum);
    }
    
}
