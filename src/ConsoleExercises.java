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

//
//        System.out.println("please enter 1 word");
//        String string1 = scanner.next();
//
//
//        System.out.println("please enter another word");
//        String string2 = scanner.next();
//
//
//        System.out.println("please enter last word");
//        String string3 = scanner.next();
//
//
//        System.out.printf(" here are your inputs!: %s, %s, %s", string1, string2, string3 );


//        ****************

//        Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//
//        do you capture all the words?


        System.out.println("enter your favorite quote");

        String userInput = scanner.nextLine();
        System.out.println("your sentence: " + userInput);
//cannot capture all user input if only use scanner.next()

//        Prompt the user to enter values of length and width of a classroom
//        at Codeup (or your room if virtual).
//
//        Use the nextLine method each time you need to get user input.
//        In this case, we need it twice, once to get the user input for the length and
//        again to get the user input for the width. Parse the resulting strings to a numeric type.
//
//        Assume that the rooms are perfect rectangles.
//                Assume that the user will enter valid numeric data for length and width.

        System.out.println("enter the width of your place");
        String placeWidth = scanner.nextLine();
        int widthInt = Integer.parseInt(placeWidth);


        System.out.println("now enter the length of your place");
        String placeLength = scanner.nextLine();
        int lengthInt = Integer.parseInt(placeLength);

        int areaPlace = widthInt * lengthInt;

        System.out.printf("your dimentions are: width = %s length = %s. for a total area of : %s", widthInt,lengthInt, areaPlace);






    }
}
