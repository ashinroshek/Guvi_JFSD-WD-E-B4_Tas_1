import java.util.Scanner;

public class Guvi_task_1_3rd_Q {
    // Task 1 - 3rd. The Program To Reverse the number 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number To Be Reversed: ");
        int a = sc.nextInt();
        int reversed=0;
        while(a!=0){
            int remainder=a%10;
            reversed = reversed *10 + remainder ;
            a/=10;
        }
        System.out.println("The Reversed Number "+reversed);
       
    }

}
