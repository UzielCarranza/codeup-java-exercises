public class ControlFlowExercises {
    public static void main(String[] args) {

//
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//
        int i = 5;
        while(i <= 15){
            System.out.print(" " + i++);
        }


//        Do While
//
//        Create a do-while loop that will count by 2's starting with 0 and
//        ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//
//
//        Create a do-while loop that starts at 2, and displays the number squared
//        on each line while the number is less than 1,000,000.:

        System.out.print(System.lineSeparator());
        int j = 0;
        do {
            j += 2;
            System.out.print(j + " ");

        } while( j <= 100);


    }
}
