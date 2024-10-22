import java.util.Scanner;

public class Guvi_Task_1 {
    public void Task(int a){
        for(int i=50; i<=a;i++){
            System.out.print(i+",");
        }
        
    }
    public static void main(String[] args) {
        Guvi_Task_1 gv= new Guvi_Task_1();
        Scanner sc=  new Scanner(System.in);
          //     System.out.println("OUTPUT USING FOR LOOP");
          //     System.out.println("*********************");
        System.out.println("Enter  : ");
        gv.Task(sc.nextInt());

        System.out.println(); 
        System.out.println("OUTPUT USING WHILE LOOP");
        System.out.println("*********************");

        //Using while loop
         int b=50;
         while(b<=100){
         System.out.print(b+",");
         b++;
     }

    }
    
}