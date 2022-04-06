import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);





        double pi = 3.14159;
        System.out.printf("The value of pi is approximately: " + "%.2f", pi);



//        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//
//        What happens if you input something that is not an integer?
        //system wil fail

        String newline = System.lineSeparator();

        System.out.println(newline + "Please enter your age :)");
        int userAge = scanner.nextInt();

        System.out.println("your age is: " + userAge);

    }
}
