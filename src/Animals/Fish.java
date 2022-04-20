package Animals;

public class Fish extends Animal {
    private int numOfTails;

    public Fish() {
    }



    public Fish(int numOfTails, int numOfLeg, String preferredClimate) {
        super(numOfLeg, preferredClimate);
        this.numOfTails = numOfTails;
    }

    public int getNumOfTails() {
        return numOfTails;
    }

    public void setNumOfTails(int numOfTails) {
        this.numOfTails = numOfTails;
    }

    @Override
    public String getAnimalInfo(){

        return "Dog Details" + "\n" +
                "num of legs: " + numberOFlegs +  "\n" +
                "preferred climate: " + preferredClimate + "\n" +
                "needs attention: " + numOfTails;
    };
}
