import java.util.Scanner;

public class _2PrimeOrNot {

    public static void main (String[] args ){
    Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number to check Even or odd : ");
    int num = input.nextInt();


    // Check if the number is 0 or 1, as these are not prime numbers
        if (num <= 1) {
        System.out.println(num + " is not a prime number.");
        System.exit(0); // Exit the program if the number is 0 or 1
    }

    // Loop to check if the number is divisible by any number other than 1 and itself
        for(int i = 2 ; i <= num/2;i++){

        if (num % i == 0) {
            System.out.print(num +" is not a prime number ");
            System.exit(0);
        }
    }
        System.out.print(num +" is a prime number ");
}
}