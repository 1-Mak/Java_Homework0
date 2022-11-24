import java.util.Scanner;


public class lab1_2 {
    public static void main(String[] args) {
     int month, day;
     Scanner in = new Scanner(System.in);
     System.out.print("Введите день: ");
     day = in.nextInt();
     System.out.print("Введите месяц: ");
     month = in.nextInt();
     if(((month ==4 || month ==6 || month ==9 || month ==11) && (day>30)) || (month == 2 && day > 28 ) || (month < 1) || (month > 12) || (day < 1)){
      System.out.println("Столько дней в этом месяце быть не может");
      in.close();


     }
     if((month > 0 && month < 2) || (month == 12)) {
      System.out.println("Зима");
     }else {
      if (month > 2 && month < 5) {
       System.out.println("Весна");
      } else {
       if (month > 5 && month < 8) {
        System.out.println("Лето");

       } else {
        if (month > 8 && month < 12) ;
        System.out.println("Осень");
       }
      }
     }











    }
}