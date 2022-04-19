import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        String[] Person = {"John", "Paul", "Ringo" };
        for (String person : Person) {
            System.out.println(person);
        }
        System.out.println(Arrays.toString(addPerson(Person, "one")));


    }
    public static String [] addPerson(String [] Person, String person){

        String[] personCopy = Arrays.copyOf(Person, Person.length + 1);

        for (int i =0; i < Person.length; i++){
            personCopy[personCopy.length -1] = person;
        }

        return personCopy;
    }

}
