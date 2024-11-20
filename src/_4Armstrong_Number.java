import java.util.Scanner;


 class _4Armstrong_Number {
     public static void main (String [] args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter The integer to check For Armstrong Number or Not :");
   int num = input.nextInt();
   int count = 0;
   int temp = num;
  int Original_num = num;
   while(temp!=0){
     temp = temp/10;
       count++;
   }
   double sum = 0;
   while(num!=0){
       int rem = num % 10 ;
        sum = sum + Math.pow(rem,count);
       //System.out.println(rem + "Raised to the "+ count +" = " + sum);
        num = num/10;
   }
   if(Original_num==sum){
       System.out.print(Original_num +" It's a Armstrong Number ");
   }else{
       System.out.print(Original_num +" It's Not a Armstrong Number ");
   }
     }

}
