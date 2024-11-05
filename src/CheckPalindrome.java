import java.util.Scanner;

public class CheckPalindrome {

    public static <string> void main (String [] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter The String To Check Palindrome : ");
        String str = in.nextLine();

        int i = 0;
        int j = str.length()-1;

//        System.out.println(str.charAt(0));
//        System.out.println(str.charAt(j));

        while(i<j){
          if( str.charAt(i) != str.charAt(j) ) {
    System.out.println("String is Not a Palindrome ");

    System.exit(0);
//    return ;
}
          i++;
          j--;
        }
        System.out.println("String is a Palindrome");
    }
}

/*
*  👉 System.exit(0) and return; are used to control the flow of a program, but they work in very different ways. 👈
*
*    🎯 1. System.exit(0):
*         🔸Purpose: Terminates the Java Virtual Machine (JVM), which means it completely stops the execution of the program.
*         🔸Parameter: The 0 indicates that the program has terminated successfully. Non-zero values indicate abnormal termination or errors.
*         🔸Effect: When System.exit(0) is called, it stops the entire program, regardless of where it is in the code (even if it's inside a method or a loop).
*         🔸Use Case: Useful when you want to forcefully exit a program, such as after a critical error or when the program has completed a task and should terminate.
*
*    🎯 2. return;
*       🔸 Purpose: Exits the current method and returns control to the caller of that method. If used in main, it stops executing the main method but does not terminate the entire program if other threads are running.
*       🔸 Effect: Only stops the execution of the current method, not the whole program.
*       🔸 Use Case: Used to exit from a method when a specific condition is met, without stopping the entire program.
*
*
*        ✨✨  Summary: ✨✨
*       System.exit(0): Terminates the entire JVM and stops all program execution.
*       return;: Exits the current method but allows the program to continue running if there is more code or active threads outside that method.
*
* */