import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


//        addition
        System.out.println("let's sdo some addition!");
        System.out.println("Enter first number");
        int firstNum = input.nextInt();

        System.out.println("Enter second number");
        int secondNum = input.nextInt();

        Addition addition1 = new Addition(firstNum, secondNum);

        int totalAddition1 = addition1.sumNums();

        System.out.println(totalAddition1);
//        ends addition



//        starts subtraction
        System.out.println("let's sdo some subtraction!");
        System.out.println("Enter first number");
        int subtractionNum1 = input.nextInt();

        System.out.println("Enter second number");
        int subtractionNum2 = input.nextInt();
        Subtraction subtraction1 = new Subtraction(subtractionNum1, subtractionNum2);
        int totalSubtraction = subtraction1.subtractNums();
        System.out.println(totalSubtraction);
//        ends subtraction




    }

}
