import java.util.Scanner;

public class Guvi_task_1_2nd_Q {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to find wheather it is Negative or Positive: ");
        int a=sc.nextInt();
        if(a<0){
            System.out.println("Given Number "+ a +" Is Negative");
        }else{
            System.out.println("Given Number "+ a +" Is Positive");
        }

    }
}
