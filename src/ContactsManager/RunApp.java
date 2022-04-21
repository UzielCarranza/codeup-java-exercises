package ContactsManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class RunApp {

    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        Path contacts = Path.of("Contacts", "Contacts.txt");
//        if (Files.notExists(contacts)) {
//            System.out.println("no");
//        } else if (Files.exists(contacts)) {
//            System.out.println("yes");
//        }
//        List<String> groceryList = Arrays.asList("coffee", "milk", "sugar");
//        Files.write(contacts, groceryList);


        AddContacts addContacts = new AddContacts("John", "1234567890");

        List<String> addContactsToFile = Arrays.asList(addContacts.getContactName(), addContacts.getPhoneMumber());
        Files.write(contacts, addContactsToFile);
        for (int i = 0; i < addContactsToFile.size(); i += 1) {
            System.out.print((i + 1) + ": " + addContactsToFile.get(i) + " ");
        }

        System.out.print("\n");

        addContacts.setContactName("test");
        addContacts.setPhoneMumber("1234567089");

        Files.write(
                Paths.get("Contacts", "Contacts.txt"),
                Arrays.asList(addContacts.getContactName(), addContacts.getPhoneMumber()), // list with one item
                StandardOpenOption.APPEND);


        addContacts.setContactName("test2");
        addContacts.setPhoneMumber("231");
        Files.write(
                Paths.get("Contacts", "Contacts.txt"),
                Arrays.asList(addContacts.getContactName(), addContacts.getPhoneMumber()), // list with one item
                StandardOpenOption.APPEND);
        List<String> seeContacts = Files.readAllLines(contacts);

        System.out.println(seeContacts + "s");
        for (int i = 0; i < seeContacts.size(); i += 1) {
            if (seeContacts.get(i).contains("john")){
                System.out.println("starts");
                System.out.println(seeContacts.get(i));
                System.out.println(seeContacts.get(i + 1));
            } else{
                System.out.println("nothing");
                break;
            }
//            System.out.println((i + 1) + ": " + seeContacts.get(i));
        }


//        for (int i = 0; i < groceryList.size(); i += 1) {
//            System.out.println((i + 1) + ": " + groceryList.get(i));
//        }
    }

}
