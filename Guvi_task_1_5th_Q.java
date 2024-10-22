import java.util.Scanner;

public class Guvi_task_1_5th_Q {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the amount :");
        int amount = sc.nextInt();
       int discontedAmount=0;

     if (amount >=500 && amount <=1000) {
        System.out.println("10 % Discount is applied");
        discontedAmount= amount -amount*10/100 ;
        System.out.println("Total Payable Amount :" +discontedAmount);
      } 
      else if(amount >1000){
        System.out.println("20 % Discount is applied");
         discontedAmount=amount - amount*20/100 ;
        System.out.println("Total Payable Amount :" +discontedAmount);
      }
      else {
        System.out.println("No Offer Applied");
        System.out.println("Total Payable Amount :" +amount);
      }
    }
}
