package myapp.ver1;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;

public class ToDoList {

    public static void main(String[] args) {

        
        List<Integer> listOfInt = new LinkedList<>();

        // Get the console
        Console cons = System.console();

        String item = "";

        while(true) {
            item = cons.readLine("Please enter a number: \n").trim();

            if(item.equals("stop")) {
                break;
            } else {
                listOfInt.add(Integer.parseInt(item));
            }
            
        }

        System.out.printf("Number of elements in the list is %d: \n", listOfInt.size());
        for(int i = 0; i < listOfInt.size(); i++) {
            System.out.printf("[%d]: %s\n", i, listOfInt.get(i));
        }

    }
    
}
