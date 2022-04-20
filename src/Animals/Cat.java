package Animals;

public class Cat extends Animal{
    boolean friendly = false;

    public Cat(){}

    public Cat(int numOfLegs, String preferredClimate){
        super(numOfLegs, preferredClimate);
    }


    public boolean isFriendly() {
        return friendly;
    }

    public void setFriendly(boolean friendly) {
        this.friendly = friendly;
    }

    @Override
    public String getAnimalInfo(){
        return "Cat Details" + "\n" +
                "num of legs: " + numberOFlegs +  "\n" +
                "preferred climate: " + preferredClimate + "\n" +
                "is friendly?: " + friendly;
    };
}
