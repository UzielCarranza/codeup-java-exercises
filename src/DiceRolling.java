import java.util.Random;

public class DiceRolling {
    int diceNum1;
    int getDiceNum2;
    Random rand = new Random(); //instance of random class

    public DiceRolling(int diceNum1, int getDiceNum2) {
        this.diceNum1 = diceNum1;
        this.getDiceNum2 = getDiceNum2;
    }

    public int DiceRolls() {

        int int_random = rand.nextInt(this.diceNum1);

        int int_random2 = rand.nextInt(this.getDiceNum2);
        System.out.println(int_random + "\n" + int_random2);

        return int_random;
    }
}
