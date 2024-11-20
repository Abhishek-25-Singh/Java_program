import java.util.Scanner;

public class _3LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input year
        System.out.print("Enter the year to check: ");
        int year = input.nextInt();

        // Check leap year conditions
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
