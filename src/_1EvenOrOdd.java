import java.util.Scanner;

public class _1EvenOrOdd {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number to check Even or odd : ");
        int num = input.nextInt();
        if(num % 2 == 0){
            System.out.println(num + "  is a Even Number.");
        }else{
            System.out.println(num + "  is a Odd Number.");
        }
    }
}
