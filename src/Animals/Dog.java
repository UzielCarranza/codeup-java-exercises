package Animals;

public class Dog extends Animal {

    private boolean needsAttention = true;

    public Dog() {
    }

    ;

    public Dog(int numberOflegs, String preferredClimate) {
        super(numberOflegs, preferredClimate);
    }

    public boolean isNeedsAttention() {
        return needsAttention;
    }

    public void setNeedsAttention(boolean needsAttention) {
        this.needsAttention = needsAttention;
    }


    @Override
    public String getAnimalInfo(){

        return "Dog Details" +
                 "num of legs: " + numberOFlegs +
                "preferred climate: " + preferredClimate +
                "needs attention: " + needsAttention;
    };
}
