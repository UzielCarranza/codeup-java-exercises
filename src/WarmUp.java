import java.util.Scanner;

public class WarmUp {


    public static void main(String[] args) {
        boolean livesInCity;
        boolean hasTransportation;
        boolean canCome;


        Scanner scanner = new Scanner(System.in);


        System.out.print("do you live in the city of Dallas?\n");
        livesInCity = scanner.nextBoolean();


        System.out.print("do you have transportation?\n");
        hasTransportation = scanner.nextBoolean();

        if(livesInCity && hasTransportation){
            canCome = true;
            System.out.print("can come in person");
        }
        else {
            canCome = false;
            System.out.print("cannot go in person");
        }
    }

}
