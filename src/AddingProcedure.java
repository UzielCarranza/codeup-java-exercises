;public class AddingProcedure {
    boolean keepRunningAddition;

    public AddingProcedure(boolean keepRunningAddition){
        this.keepRunningAddition = keepRunningAddition;

    }
    public boolean divideNums(){
        return this.keepRunningAddition;
    }
}


//
//   do {
//           System.out.println("Enter first number");
//           int firstNum = input.nextInt();
//
//           System.out.println("Enter second number");
//           int secondNum = input.nextInt();
//
//           Addition addition1 = new Addition(firstNum, secondNum);
//
//           int totalAddition1 = addition1.sumNums();
//
//           System.out.println(totalAddition1);
//
//
//           System.out.println("Would you like to do more addition?");
//           String keepAdding = input.next();
//
//           if (keepAdding.equalsIgnoreCase("yes") || keepAdding.equalsIgnoreCase("y")) {
//           keepRunnignApplicationAddition = true;
//           } else {
//           keepRunnignApplicationAddition = false;
//           }
//
//           } while (keepRunnignApplicationAddition);