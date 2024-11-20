import java.util.Scanner;


public class _5Fibonacci_Series {
    public static void main (String [] args){

      int n1 = 0;
      int n2 = 1;

      Scanner obj = new Scanner(System.in);
      System.out.print("Enter the Integer for Fibonacci Series  : ");
      int number = obj.nextInt();
        System.out.print(" Fibonacci Series upto " + number+" terms : ");
      for(int i = 1 ; i<=number; i++){

          System.out.print(n1+" ");
          int nextTerm = n1 + n2;
          n1 = n2;
          n2= nextTerm;
      }
    }

}
