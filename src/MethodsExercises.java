import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        runs methods
        boolean keepRunnignApplicationAddition = true;
        boolean keepRunnignApplicationSubtraction = true;
        boolean keepRunnignApplicationMultiply = true;
        boolean keepRunnignApplicationDivision = true;
        // ends methods


//        addition
        System.out.println("let's sdo some addition!");

        do {
            System.out.println("Enter first number");
            int firstNum = input.nextInt();

            System.out.println("Enter second number");
            int secondNum = input.nextInt();

            Addition addition1 = new Addition(firstNum, secondNum);

            int totalAddition1 = addition1.sumNums();

            System.out.println(totalAddition1);


            System.out.println("Would you like to do more addition?");
            String keepAdding = input.next();

            if (keepAdding.equalsIgnoreCase("yes") || keepAdding.equalsIgnoreCase("y")) {
                keepRunnignApplicationAddition = true;
            } else {
                keepRunnignApplicationAddition = false;
            }

        } while (keepRunnignApplicationAddition);

//        ends addition



//        starts subtraction
        System.out.println("Would you like to start subtraction application? y/n");
        String switchSubtracting = input.next();
        if (switchSubtracting.equalsIgnoreCase("y") || switchSubtracting.equalsIgnoreCase("yes")){
            keepRunnignApplicationSubtraction = true;
        } else {
            keepRunnignApplicationSubtraction = false;
            System.out.println("bye");
        }


        while (keepRunnignApplicationSubtraction) {


            System.out.println("let's do some subtraction!");
            System.out.println("Enter first number");
            int subtractionNum1 = input.nextInt();

            System.out.println("Enter second number");
            int subtractionNum2 = input.nextInt();
            Subtraction subtraction1 = new Subtraction(subtractionNum1, subtractionNum2);
            int totalSubtraction = subtraction1.subtractNums();
            System.out.println(totalSubtraction);

            System.out.println("would you like to keep subtracting?");
            String keepSubtracting = input.next();
            if (keepSubtracting.equalsIgnoreCase("yes") || keepSubtracting.equalsIgnoreCase("y")){
                keepRunnignApplicationSubtraction = true;
            } else {
                keepRunnignApplicationSubtraction = false;
            }
        }
//        ends subtraction




////        starts multiply
        System.out.println("Would you like to start multiplying application? y/n");
        String switchMultiply = input.next();
        if (switchMultiply.equalsIgnoreCase("yes") || switchSubtracting.equalsIgnoreCase("y")){
            keepRunnignApplicationMultiply = true;
        } else {
            keepRunnignApplicationMultiply = false;
            System.out.println("bye");
        }

        while (keepRunnignApplicationMultiply) {
            System.out.println("let's do some multiplication!");
            System.out.println("Enter first number");
            int multiplyNum1 = input.nextInt();

            System.out.println("Enter second number");
            int multiplyNum2 = input.nextInt();
            Multiply multiply1 = new Multiply(multiplyNum1, multiplyNum2);
            int totalMultiply = multiply1.multiplyNums();
            System.out.println(totalMultiply);
            System.out.println("would you like to keep multiplying?");
            String keepMultiply = input.next();
            if (keepMultiply.equalsIgnoreCase("yes") || keepMultiply.equalsIgnoreCase("y")){
                keepRunnignApplicationMultiply = true;
            } else {
                keepRunnignApplicationMultiply = false;
                System.out.println("bye");
            }
        }

////        ends multiply



//                divide multiply
        System.out.println("Would you like to start division application? y/n");
        String switchDivition = input.next();
        if (switchDivition.equalsIgnoreCase("yes") || switchDivition.equalsIgnoreCase("y")){
            keepRunnignApplicationDivision = true;
        } else {
            keepRunnignApplicationDivision = false;
            System.out.println("bye");
        }

        while(keepRunnignApplicationDivision) {
        System.out.println("let's do some division!");
        System.out.println("Enter first number");
        int divisionNum1 = input.nextInt();

        System.out.println("Enter second number");
        int divisionNum2 = input.nextInt();
        Division division1 = new Division(divisionNum1, divisionNum2);
        int totalDivision = division1.divideNums();
        System.out.println(totalDivision);
            System.out.println("would you like to keep Dividing? y/n"   );
            String keepDivision = input.next();
            if (keepDivision.equalsIgnoreCase("yes") || keepDivision.equalsIgnoreCase("y")){
                keepRunnignApplicationDivision = true;
            } else {
                keepRunnignApplicationDivision = false;
                System.out.println("good bye");

            }

//        ends division
//
//            starts module

//            ends module
        }

    }

}
