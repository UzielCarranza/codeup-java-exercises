public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int myFavoriteNumber = 103;
        System.out.println("My favorite number is: " + myFavoriteNumber);


//        Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "some String";

        System.out.println("My favorite string is: " + myString);

//        Change your code to assign a character value to myString. What do you notice?

        myString = "new value";

        System.out.println("My new favorite string is: " + myString);


//        Change your code to assign the value 3.14159 to myString. What happens?
//         myString = 3.14159;

//        Declare an long variable named myNumber, but do not assign anything to it.
//        Next try to print out myNumber to the console. What happens?
//
//        long myNumber;
//        System.out.println(myNumber);
//needs to assign undefined


//        Change your code to assign the value 3.14 to myNumber. What do you notice?
//        long myNumber = 3.14;
//        needs to be float or double


//        Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.

        long myNumber = 123L;


//        Change your code to assign the value 123 to myNumber.
        myNumber = 123;
//it compiles because long concentrates on whoe numbers, while double concentrates onto decimal numbers


//        Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
        double myNumber2 = 3.14;

//
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

    }
}
