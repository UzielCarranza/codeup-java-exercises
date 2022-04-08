import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {


        System.out.println("let's sdo some addition!");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNum = input.nextInt();



        System.out.println("Enter second number");
        int secondNum = input.nextInt();

        Addition addition1 = new Addition(firstNum, secondNum);

        int totalAddition1 = addition1.sumNums();

        System.out.println(totalAddition1);
    }

}
