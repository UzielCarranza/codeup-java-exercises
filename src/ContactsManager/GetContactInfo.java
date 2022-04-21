package ContactsManager;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class GetContactInfo {

    public GetContactInfo() {

    }

    public void seeContact(String contactName) {
        List<String> seeContacts = null;
        try {
            Path contacts = Path.of("Contacts", "Contacts.txt");
            seeContacts = Files.readAllLines(contacts);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for (int i = 0; i < seeContacts.size(); i += 1) {
            if (seeContacts.get(i).startsWith(contactName)) {
                System.out.println(seeContacts.get(i));
                System.out.println(seeContacts.get(i + 1));
            }
//            System.out.println((i + 1) + ": " + seeContacts.get(i));
        }
    }
}
