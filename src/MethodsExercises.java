import java.util.Scanner;

public class MethodsExercises {
//    static Scanner input = new Scanner(System.in);
//
//    public static int getInteger(int min, int max) {
//        if (min > 0 && min < 100 && max < 100 && max > 0) {
//
//            Addition addition1 = new Addition(min, max);
//
//            int totalAddition1 = addition1.sumNums();
//
//            System.out.println(totalAddition1);
//            return totalAddition1;
//
//        } else {
//            System.out.println("needs numbers between 0 and 100");
//
//            System.out.println("Enter number greater than 0 and less than 100");
//            int firstNum = input.nextInt();
//            System.out.println("Enter second number greater than 0 and less than 100");
//            int secondNum = input.nextInt();
//            getInteger(firstNum, secondNum);
//        }
//        return max;
//    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        runs methods
//        boolean keepRunnignApplicationAddition = true;
//        boolean keepRunnignApplicationSubtraction = true;
//        boolean keepRunnignApplicationMultiply = true;
//        boolean keepRunnignApplicationDivision = true;
//        boolean keepRunnignApplicationModules = true;
//        // ends methods
//
//
////        addition
//        System.out.println("let's sdo some addition!");
//
//        do {
//
//            System.out.println("Enter first number");
//            int firstNum = input.nextInt();
//            System.out.println("Enter second number");
//            int secondNum = input.nextInt();
//            getInteger(firstNum, secondNum);
//            System.out.println("Would you like to do more addition?");
//            String keepAdding = input.next();
//
//            if (keepAdding.equalsIgnoreCase("yes") || keepAdding.equalsIgnoreCase("y")) {
//                keepRunnignApplicationAddition = true;
//            } else {
//                keepRunnignApplicationAddition = false;
//            }
//
//        } while (keepRunnignApplicationAddition);
//
////        ends addition
//
//
////        starts subtraction
//        System.out.println("Would you like to start subtraction application? y/n");
//        String switchSubtracting = input.next();
//        if (switchSubtracting.equalsIgnoreCase("y") || switchSubtracting.equalsIgnoreCase("yes")) {
//            keepRunnignApplicationSubtraction = true;
//        } else {
//            keepRunnignApplicationSubtraction = false;
//            System.out.println("bye");
//        }
//
//
//        while (keepRunnignApplicationSubtraction) {
//
//
//            System.out.println("let's do some subtraction!");
//            System.out.println("Enter first number");
//            int subtractionNum1 = input.nextInt();
//
//            System.out.println("Enter second number");
//            int subtractionNum2 = input.nextInt();
//            Subtraction subtraction1 = new Subtraction(subtractionNum1, subtractionNum2);
//            int totalSubtraction = subtraction1.subtractNums();
//            System.out.println(totalSubtraction);
//
//            System.out.println("would you like to keep subtracting?");
//            String keepSubtracting = input.next();
//            if (keepSubtracting.equalsIgnoreCase("yes") || keepSubtracting.equalsIgnoreCase("y")) {
//                keepRunnignApplicationSubtraction = true;
//            } else {
//                keepRunnignApplicationSubtraction = false;
//            }
//        }
////        ends subtraction
//
//
//////        starts multiply
//        System.out.println("Would you like to start multiplying application? y/n");
//        String switchMultiply = input.next();
//        if (switchMultiply.equalsIgnoreCase("yes") || switchSubtracting.equalsIgnoreCase("y")) {
//            keepRunnignApplicationMultiply = true;
//        } else {
//            keepRunnignApplicationMultiply = false;
//            System.out.println("bye");
//        }
//
//        while (keepRunnignApplicationMultiply) {
//            System.out.println("let's do some multiplication!");
//            System.out.println("Enter first number");
//            int multiplyNum1 = input.nextInt();
//
//            System.out.println("Enter second number");
//            int multiplyNum2 = input.nextInt();
//            Multiply multiply1 = new Multiply(multiplyNum1, multiplyNum2);
//            int totalMultiply = multiply1.multiplyNums();
//            System.out.println(totalMultiply);
//            System.out.println("would you like to keep multiplying?");
//            String keepMultiply = input.next();
//            if (keepMultiply.equalsIgnoreCase("yes") || keepMultiply.equalsIgnoreCase("y")) {
//                keepRunnignApplicationMultiply = true;
//            } else {
//                keepRunnignApplicationMultiply = false;
//                System.out.println("bye");
//            }
//        }
//
//////        ends multiply
//
//
////                divide multiply
//        System.out.println("Would you like to start division application? y/n");
//        String switchDivition = input.next();
//        if (switchDivition.equalsIgnoreCase("yes") || switchDivition.equalsIgnoreCase("y")) {
//            keepRunnignApplicationDivision = true;
//        } else {
//            keepRunnignApplicationDivision = false;
//            System.out.println("bye");
//        }
//
//        while (keepRunnignApplicationDivision) {
//            System.out.println("let's do some division!");
//            System.out.println("Enter first number");
//            int divisionNum1 = input.nextInt();
//
//            System.out.println("Enter second number");
//            int divisionNum2 = input.nextInt();
//            Division division1 = new Division(divisionNum1, divisionNum2);
//            int totalDivision = division1.divideNums();
//            System.out.println(totalDivision);
//            System.out.println("would you like to keep Dividing? y/n");
//            String keepDivision = input.next();
//            if (keepDivision.equalsIgnoreCase("yes") || keepDivision.equalsIgnoreCase("y")) {
//                keepRunnignApplicationDivision = true;
//            } else {
//                keepRunnignApplicationDivision = false;
//                System.out.println("good bye");
//
//            }
//        }
//
////        ends division
////
////            starts module
//        System.out.println("Would you like to start modules application? y/n");
//        String switchModules = input.next();
//        if (switchModules.equalsIgnoreCase("yes") || switchModules.equalsIgnoreCase("y")) {
//            keepRunnignApplicationModules = true;
//        } else {
//            keepRunnignApplicationModules = false;
//            System.out.println("bye");
//        }
//
//        while (keepRunnignApplicationModules) {
//            System.out.println("let's do some division!");
//            System.out.println("Enter first number");
//            int modulesNum1 = input.nextInt();
//
//            System.out.println("Enter second number");
//            int modulesNum2 = input.nextInt();
//            Modules modules = new Modules(modulesNum1, modulesNum2);
//            int totalModules = modules.doModuleNums();
//            System.out.println(totalModules);
//            System.out.println("would you like to keep moduling? y/n");
//            String keepModuling = input.next();
//            if (keepModuling.equalsIgnoreCase("yes") || keepModuling.equalsIgnoreCase("y")) {
//                keepRunnignApplicationModules = true;
//            } else {
//                keepRunnignApplicationModules = false;
//                System.out.println("good bye");
//
//            }
//
//
////            ends module
//        }

//        boolean keepFactorial = true;
//        do {
//
//            System.out.println("enter a number between 1 -10");
//            int userNumber = input.nextInt();
//            FactorialNum factorialNum1 = new FactorialNum(userNumber);
//            int factorialNums = factorialNum1.factorialNums();
//            System.out.println("\nWould u like to continue? y/n");
//            String responseContinue = input.next();
//            if (responseContinue.equalsIgnoreCase("yes") || responseContinue.equalsIgnoreCase("y")) {
//                keepFactorial = true;
//            } else {
//                System.out.println("bye");
//                keepFactorial = false;
//            }
//        } while (keepFactorial);


//        boolean reRoll = true;
//
//        do {
//
//
//            System.out.println("Let's roll the dices!");
//
//            System.out.println("Enter first dice number of sides");
//            int userDice1 = input.nextInt();
//            System.out.println("Enter second dice number of sides");
//            int userDice2 = input.nextInt();
//            System.out.println("Roll the dices!");
//            DiceRolling diceRolling = new DiceRolling(userDice1, userDice2);
//            int resultRolling = diceRolling.DiceRolls();
//
//            System.out.println("Want to re-roll? y/no");
//            String userReRolls = input.next();
//            if (userReRolls.equalsIgnoreCase("yes") || userReRolls.equalsIgnoreCase("y")) {
//                reRoll = true;
//            } else {
//                reRoll = false;
//
//                System.out.println("nice playing with you");
//            }
//        } while (reRoll);




    }
}
