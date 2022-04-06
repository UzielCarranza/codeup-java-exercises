import java.util.Scanner;

public class ConsoleIo {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);




        System.out.println("enter a city");
        String city = scanner.nextLine();


        System.out.println("enter a city");
        String state = scanner.nextLine();


        System.out.println("HOW LONG HAVE U LIVED THERE");
        int years = scanner.nextInt();

        System.out.printf("hello %s other %s, i've live there for %d years", city, state, years);


    }
}
