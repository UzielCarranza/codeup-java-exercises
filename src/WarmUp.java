import java.util.Scanner;

public class WarmUp {


    public static void main(String[] args) {
        Boolean livesInCity;
        boolean hasTransportation;
        boolean canCome;


        Scanner scanner = new Scanner(System.in);


        System.out.print("do you live in the city of Dallas?");
        livesInCity = scanner.nextBoolean();


        System.out.print("do you have transportation?");
        hasTransportation = scanner.nextBoolean();

        if(livesInCity && hasTransportation){
            System.out.print("can come in person");
        }
        else {
            System.out.print("cannot go in person");
        }
    }

}
