public class ValidateUserInputNums {
    int min;
    int max;
    int [] minMax = new int[2];

    public ValidateUserInputNums(int min, int max, int [] minMax) {
        this.min = min;
        this.max = max;
        this.minMax = minMax;
    }


    public static int[] getInteger(int min, int max, int [] minMax) {
        if (min > 0 && max < 100) {
            System.out.print("good choice!");
            minMax[0] = min;
            minMax[1] = max;

        } else{
            System.out.println("needs numbers between 0 and 100");
        }
        return minMax;
    }
}
