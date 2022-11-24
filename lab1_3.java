import java.util.Scanner;


public class lab1_3 {
    public static void main(String[] args) {

     Scanner in = new Scanner(System.in);
     System.out.print("Введите x: ");
     int x = in.nextInt();
     System.out.print("Введите n: ");
     int n = in.nextInt();
     if(n>15 || n < -15){
      System.exit(0);
     }
if(n==0) {
 System.out.println('1');
}
 if (n > 0) {
  int power = 1;
  for (int i = 0; i < n; i++) {
   power = power * x;
  }
  System.out.println(power);
 }

  if (n < 0) {
   float power = 1;
   for (int i = 0; i > n; i--) {
    power = power / x;
   }
   System.out.println(power);
  }




    }
}