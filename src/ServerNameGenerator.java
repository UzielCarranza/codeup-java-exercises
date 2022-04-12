import java.util.Random;

public class ServerNameGenerator {
    Object[] array = {"amused", "alert", "angry", "anxious", "attractive", "alive", "annoyed", "Alive", "arrogant", "Average" };
    Object[] array2 = {"cat", "sock", "ship", "hero", "monkey", "baby", "match", "afternoon", "doctor", "word" };

    public Object RandomElementArray() {


        Random generator = new Random();
        int randomIndex = generator.nextInt(array.length);
        int randomIndexArray2 = generator.nextInt(array2.length);
        String ranArray = array[randomIndex] + "-" + array2[randomIndexArray2];
        return ranArray;

    }

    public static void main(String[] args) {
        ServerNameGenerator serverNameGenerator = new ServerNameGenerator();

        System.out.println("Here is your server name:\n" +serverNameGenerator.RandomElementArray());
    }
}
