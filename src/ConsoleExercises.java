import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


//
//
//
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately: " + "%.2f", pi);



//        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//
//        What happens if you input something that is not an integer?
        //system wil fail
//
//        String newline = System.lineSeparator();
//
//        System.out.println(newline + "Please enter your age :)");
//        int userAge = scanner.nextInt();
//
//        System.out.println("your age is: " + userAge);





//        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//
//                What happens if you enter less than 3 words?
//                What happens if you enter more than 3 words?


        System.out.println("please enter 1 word");
        String string1 = scanner.next();


        System.out.println("please enter another word");
        String string2 = scanner.next();


        System.out.println("please enter last word");
        String string3 = scanner.next();


        System.out.printf(" here are your inputs!: %s, %s, %s", string1, string2, string3 );


    }
}
