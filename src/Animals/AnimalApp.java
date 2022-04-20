package Animals;

public class AnimalApp {

    public static void main(String[] args) {



        int numLegs = 4;

        String prefClimate = "in the house";
        Animal animal = new Dog();
        animal.setNumberOFlegs(numLegs);
        animal.setPreferredClimate(prefClimate);
        System.out.println("\033[0;92m" + animal.getAnimalInfo());


        System.out.println("-----------------");
        Animal fish = new Fish(1,0, "water");
        System.out.println("\033[0;94m" + fish.getAnimalInfo());


        System.out.println("-----------------");
        Animal cat = new Cat(4, "In the house");
        System.out.println("\033[1;93m" +cat.getAnimalInfo());
    }
}
