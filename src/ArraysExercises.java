import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        String[] Person = {"John", "Paul", "Ringo"};
        for (String person : Person) {
            System.out.println(person);
        }
//        System.out.println(Arrays.toString(addPerson(Person, "one")));

        Person[] people = new Person[3];
        people[0] = new Person("john");
        people[1] = new Person("joh");
        people[2] = new Person("jo");

//        for (Person person : people) {
//            person.getName();
//            System.out.println(person.getName());
//        }
        people = addPerson(people, new Person("new"));
        people = addPerson(people, new Person("aa"));
        for (Person person : people){
            System.out.println(person.getName());
        }
    }

    public static Person[] addPerson(Person[] personArr, Person personToAdd) {
        Person[] newArr = Arrays.copyOf(personArr, personArr.length + 1);

        newArr[newArr.length - 1] = personToAdd;
        return newArr;

    }

//    public static String[] addPerson(String[] Person, String person) {
//
//        String[] personCopy = Arrays.copyOf(Person, Person.length + 1);
//
//        for (int i = 0; i < Person.length; i++) {
//            personCopy[personCopy.length - 1] = person;
//        }
//
//        return personCopy;
//    }


}
