public class FactorialNum {

    //        Calculate the factorial of a number.
//
//        Prompt the user to enter an integer from 1 to 10.
//        Display the factorial of the number entered by the user.
//        Ask if the user wants to continue.
//        Use a for loop to calculate the factorial.
//                Assume that the user will enter an integer, but verify it’s between 1 and 10.
//        Use the long type to store the factorial.
//        Continue only if the user agrees to.
//        A factorial is a number multiplied by each of the numbers before it.
//                Factorials are denoted by the exclamation point (n!). Ex:
//
//
//        1! = 1               = 1
//        2! = 1 x 2           = 2
//        3! = 1 x 2 x 3       = 6
//        4! = 1 x 2 x 3 x 4   = 24;
    int num;


    public FactorialNum(int num) {
        this.num = num;
    }

    public int factorialNums() {
        int fact = 1;
        for (int i = 1; i <= this.num; i++) {
            fact = fact * i;
            String s = "1 x " + i;
            String counter = s;
//            System.out.printf( "\n =%s",fact);


            System.out.printf("\n%s!" + "  =   " + "%s" + "  = %s", i, counter, fact);
        }

        return fact;
    }

}

