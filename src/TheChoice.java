import java.util.Scanner;

public class TheChoice {

    public int PrintMenu(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите вашу историю: ");

        System.out.println("История №1 ");
        System.out.println("История №2 ");

         int Choice = scanner.nextInt();

         return Choice;
    }





}
