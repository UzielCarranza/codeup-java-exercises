package Animals;

public class Fish extends Animal {
    private int numOfTails;
    private boolean isSaltWater = false;
    public Fish() {
    }



    public Fish(int numOfTails, int numOfLeg, String preferredClimate, boolean isSaltWater) {
        super(numOfLeg, preferredClimate);
        this.numOfTails = numOfTails;
        this.isSaltWater = isSaltWater;
    }

    public int getNumOfTails() {
        return numOfTails;
    }

    public void setNumOfTails(int numOfTails) {
        this.numOfTails = numOfTails;
    }

    public boolean isSaltWater() {
        return isSaltWater;
    }

    public void setSaltWater(boolean saltWater) {
        isSaltWater = saltWater;
    }

    @Override
    public String getAnimalInfo(){

        return "Fish Details" + "\n" +
                "num of legs: " + numberOFlegs +  "\n" +
                "preferred climate: " + preferredClimate + "\n" +
                "number of tails: : " + numOfTails + "\n" +
                "water habitat: " + (isSaltWater ? "saltwater" : "freshwater");
    };
}
