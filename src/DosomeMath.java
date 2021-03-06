import java.util.Scanner;

public class DosomeMath {
    int min;
    int max;
    boolean keepRunnignApplicationAddition = true;

    public int getInteger(int min, int max) {
        this.min = min;
        this.max = max;
        do {


            if (this.min > 0 && this.min < 100 && this.max < 100 && this.max > 0) {

                Addition addition1 = new Addition(min, max);

                int totalAddition1 = addition1.sumNums();

                System.out.println(totalAddition1);
                System.out.println("Would you like to keep adding?");
                String keepAdding = new Scanner(System.in).next();
                if (keepAdding.equalsIgnoreCase("yes") || keepAdding.equalsIgnoreCase("y")) {

                    System.out.println("Enter 1st number");
                    int firstNum = new Scanner(System.in).nextInt();


                    System.out.println("Enter 2nd number");
                    int secondNum = new Scanner(System.in).nextInt();
                    getInteger(firstNum, secondNum);
                } else {
                    keepRunnignApplicationAddition = false;
                }
            } else {

                System.out.println("needs numbers between 0 and 100");

                int firstNum = new Scanner(System.in).nextInt();
                System.out.println("Enter second number greater than 0 and less than 100");

                int secondNum = new Scanner(System.in).nextInt();
                getInteger(firstNum, secondNum);
            }
        } while (keepRunnignApplicationAddition);
        return max;
    }


    int getIntegerSub(int minSub, int maxSub) {
        this.min = minSub;
        this.max = maxSub;
        boolean keepRunnignApplicationSub = false;
        do {


            if (this.min > 0 && this.min < 100 && this.max < 100 && this.max > 0) {

                Subtraction subtraction1 = new Subtraction(this.min, this.max);

                int totalSubtraction = subtraction1.subtractNums();
                System.out.println(totalSubtraction);
                System.out.println("Would you like to keep subtracting?");
                String keepSubtracting = new Scanner(System.in).next();
                if (keepSubtracting.equalsIgnoreCase("yes") || keepSubtracting.equalsIgnoreCase("y")) {
                    System.out.println("Enter 1st number");
                    int firstNum = new Scanner(System.in).nextInt();
                    System.out.println("Enter 2nd number");
                    int secondNum = new Scanner(System.in).nextInt();
                    getIntegerSub(firstNum, secondNum);
                } else {
                    keepRunnignApplicationSub = false;
                }
            } else {
                System.out.println("needs numbers between 0 and 100");
                int firstNumSub = new Scanner(System.in).nextInt();

                System.out.println("Enter second number greater than 0 and less than 100");
                int secondNumSub = new Scanner(System.in).nextInt();
                getIntegerSub(firstNumSub, secondNumSub);
            }
        } while (keepRunnignApplicationSub);
        return max;
    }

    int getIntegerDiv(int minDiv, int maxDiv) {
        this.min = minDiv;
        this.max = maxDiv;
        boolean keepRunnignApplicationDiv = false;
        do {


            if (this.min > 0 && this.min < 100 && this.max < 100 && this.max > 0) {

                Division division1 = new Division(this.min, this.max);

                int totalDivision = division1.divideNums();
                System.out.println(totalDivision);
                System.out.println("Would you like to keep Dividing?");
                String keepDivision = new Scanner(System.in).next();
                if (keepDivision.equalsIgnoreCase("yes") || keepDivision.equalsIgnoreCase("y")) {
                    System.out.println("Enter 1st number");
                    int firstNum = new Scanner(System.in).nextInt();
                    System.out.println("Enter 2nd number");
                    int secondNum = new Scanner(System.in).nextInt();
                    getIntegerDiv(firstNum, secondNum);
                } else {
                    keepRunnignApplicationDiv = false;
                }
            } else {
                System.out.println("needs numbers between 0 and 100");
                int firstNumSub = new Scanner(System.in).nextInt();

                System.out.println("Enter second number greater than 0 and less than 100");
                int secondNumSub = new Scanner(System.in).nextInt();
                getIntegerDiv(firstNumSub, secondNumSub);
            }
        } while (keepRunnignApplicationDiv);
        return max;
    }

    int getIntegerMul(int minMul, int maxMul) {
        boolean keepRunnignApplicationMul = false;
        do {
            if (minMul > 0 && minMul < 100 && maxMul < 100 && maxMul > 0) {

                Multiply multiply1 = new Multiply(minMul, maxMul);

                int totalMultiplication = multiply1.multiplyNums();
                System.out.println(totalMultiplication);
                System.out.println("Would you like to keep Multiplying?");
                String keepMultiplying = new Scanner(System.in).next();
                if (keepMultiplying.equalsIgnoreCase("yes") || keepMultiplying.equalsIgnoreCase("y")) {
                    System.out.println("Enter 1st number");
                    int firstNum = new Scanner(System.in).nextInt();
                    System.out.println("Enter 2nd number");
                    int secondNum = new Scanner(System.in).nextInt();
                    getIntegerMul(firstNum, secondNum);
                } else {
                    keepRunnignApplicationMul = false;
                }
            } else {
                System.out.println("needs numbers between 0 and 100");
                int firstNumSub = new Scanner(System.in).nextInt();

                System.out.println("Enter second number greater than 0 and less than 100");
                int secondNumSub = new Scanner(System.in).nextInt();
                getIntegerMul(firstNumSub, secondNumSub);
            }
        } while (keepRunnignApplicationMul);
        return max;
    }
}
