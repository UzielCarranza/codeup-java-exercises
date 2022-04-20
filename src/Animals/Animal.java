package Animals;

public abstract class Animal {
//    fields
    protected int numberOFlegs;
    protected String preferredClimate;

//    constructors

    public Animal(int numberOFlegs, String preferredClimate){
        this.numberOFlegs = numberOFlegs;
        this.preferredClimate = preferredClimate;
    }
    public Animal(){};


//    properties

    public int getNumberOFlegs() {
        return numberOFlegs;
    }

    public void setNumberOFlegs(int numberOFlegs) {
        this.numberOFlegs = numberOFlegs;
    }

    public String getPreferredClimate() {
        return preferredClimate;
    }

    public void setPreferredClimate(String preferredClimate) {
        this.preferredClimate = preferredClimate;
    }

    abstract String getAnimalInfo();
}
