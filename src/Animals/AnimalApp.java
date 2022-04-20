package Animals;

public class AnimalApp {

    public static void main(String[] args) {



        int numLegs = 4;

        String prefClimate = "in the house";

        Animal animal = new Dog();
        animal.setNumberOFlegs(numLegs);
        animal.setPreferredClimate(prefClimate);
        System.out.println(animal.getAnimalInfo());

    }
}
