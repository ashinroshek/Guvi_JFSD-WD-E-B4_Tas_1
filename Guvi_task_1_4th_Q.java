import java.util.Scanner;

public class Guvi_task_1_4th_Q {
    // Task 1 - 4th Qurestion smallest number among 3 numbers
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first number: ");
        int fistNumber = sc.nextInt();
        System.out.println("Enter Second number: ");
        int secondNumber = sc.nextInt();    
        System.out.println("Enter Third number: ");
        int thirdNumber = sc.nextInt();

    int firstSmallestNumber = fistNumber < secondNumber ? fistNumber:secondNumber;
    int secondSmallestNumber = secondNumber < thirdNumber ? secondNumber : thirdNumber;
    int smallestNumber = firstSmallestNumber < secondSmallestNumber ? firstSmallestNumber :secondSmallestNumber ;
    
    System.out.println("The first smallest number is: "+ smallestNumber);
    }
}
