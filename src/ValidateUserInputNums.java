public class ValidateUserInputNums {
    int min;
    int max;

    public ValidateUserInputNums(int min, int max) {
        this.min = min;
        this.max = max;
    }


    public int[] getInteger() {
        if (this.min > 0 && this.min < 100 && this.max < 100 && this.max > 0) {
            System.out.print("number is between 0 and 100!");

        } else{
            System.out.println("needs numbers between 0 and 100");
        }

        return new int[]{this.min, this.max};
    }
}
