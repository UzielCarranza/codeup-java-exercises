import java.util.Random;

public class ServerNameGenerator {
    Object [] array = {"amused", "alert", "angry", "anxious", "attractive", "alive", "annoyed", "Alive", "arrogant", "Average"};
    Object [] array2 = {"cat", "sock", "ship", "hero", "monkey", "baby", "match", "afternoon", "doctor", "word"};

    public Object RandomElementArray(Object [] array1, Object [] array2){
        this.array = array1;
        this.array2 = array2;

        Random generator = new Random();
        Object[] myArray = new Object[0];
        int randomIndex = generator.nextInt(myArray.length);
        return myArray[randomIndex];
    }


}
