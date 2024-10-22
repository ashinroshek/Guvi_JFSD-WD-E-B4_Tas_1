public record Guvi_task_1_6th_Q() {
 public static void main(String[] args) {
    int k=5;
    for(int i=k;i>=1;i--){
      for(int j=k;j>=i;j--){
        System.out.print(j);
      }
      for(int j=1;j<i;j++){
        System.out.print(i);
       
      }
      System.out.println();
    }
 }   
}
