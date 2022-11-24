import java.util.Scanner;


public class lab1_1 {
    public static void main(String[] args) {
     int day,month,year;
     int day1 = 25,month1 = 11,year1 = 2022;

     Scanner in = new Scanner(System.in);
     System.out.print("Введите день рождения: ");
     day = in.nextInt();
     if(day>30 || day < 1){

       System.out.println("Ай ай, не может быть дней столько");
       in.close();

      }else{
      System.out.print("Введите номер месяца рождения: ");
      month = in.nextInt();
      if(month>12 || month < 1){
       System.out.println("Ай ай, не может быть месяцев столько");
       in.close();
      }else{
       System.out.print("Введите год рождения: ");
       year = in.nextInt();
       if(year > 2022 || year < 1900) {
        System.out.println("Вы из будущего или из прошлого?");
        in.close();
       }else {
        if (month1 > month)  {
         System.out.print((year1 - year) + " лет, " + (month1 - month) + " месяцев и " + (day1) + " дней");
        } else {
         if (month1<month) {
          System.out.print((year1 - year-1) + " лет, "+ (month1)+ " месяцев и "+ Math.max(day1-day, day1)+ " дней");
         } else {
          if (month1 == month) {
           if (day1 < day) {
            System.out.print((year1 - year - 1) + " лет, " + (month1) + " месяцев и " + (day1) + " дней");
           }else {
            if (day1 > day)
             System.out.print((year1 - year) + " лет, 0 месяцев и " + (day1 - day) + " дней");
           }
          }
         }
        }


       }
      }
     }






    }
}