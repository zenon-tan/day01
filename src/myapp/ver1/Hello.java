package myapp.ver1;

import java.io.Console;

// This is a modification

public class Hello {

    public static void main(String[] args) {
        
        // Get the system console by importing (can only see classes within the same package)
        // Telling the compiler where to find them buy giving the fully qualified class name

        Console cons = System.console();

        String name = "";

        while(name.trim().isEmpty()) {

            // Read from a console, the result is assigned to a variable
        //Good to convert string by removing white spaces or caps (not for passwords)
        // .trim() keeps spaces between letters
        name = cons.readLine("Whats your name? \n").trim().toLowerCase();

        // Formatted String
        // Able to create a string with format
        // %s is the placeholder where the variable is going to be place

        
        if(name.equals("gaga")) { // == is for numbers only
            System.out.println("Lady Gaga is the Queen of Pop");

        } else if (name.equals("taylor")) {
            System.out.println("Tayble tanked");

        } else if (name.isEmpty()) {
            System.err.println("Error. Please enter your name.");

        }
         else {
            System.out.printf("\tHello %s, \nNice to meet you.\n", name);

        }

        }
    
    }
}
