package ContactsManager;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class AddContact {

    public AddContact(String contactName, String phoneNumber) {
        try {
            Files.write(
                    Paths.get("Contacts", "Contacts.txt"),
                    Arrays.asList(contactName, phoneNumber), // list with one item
                    StandardOpenOption.APPEND);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }

}
