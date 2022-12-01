package myapp.ver1;

public class ToDo {

    public static void main(String[] args) {
        
        // Create an array
        String[] task = new String[3];

        task[0] = "Running";
        task[1] = "Sleeping";
        task[2] = "Dying";

        // System.out.println(task);
        // System.out.println(task[0]);
        // System.out.println(task[1]);
        // System.out.println(task[2]);
        // System.out.println(task.length); // Size of the array

        int i = 0;
        while(i < task.length) {
            System.out.println(task[i]);
            i++;
        }
 
    }
    
}
