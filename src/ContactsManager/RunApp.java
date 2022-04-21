package ContactsManager;

import java.io.IOException;

public class RunApp {

    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        Path contacts = Path.of("Contacts", "Contacts.txt");
//        if (Files.notExists(contacts)) {
//            System.out.println("no");
//        } else if (Files.exists(contacts)) {
//            System.out.println("yes");
//        }
//        List<String> groceryList = Arrays.asList("coffee", "milk", "sugar");
//        Files.write(contacts, groceryList);
//        for (int i = 0; i < groceryList.size(); i += 1) {
//            System.out.println((i + 1) + ": " + groceryList.get(i));
//        }
        AddContacts addContacts = new AddContacts("One","1234567890");

        System.out.println(addContacts.getContactName());
        System.out.println(addContacts.getPhoneMumber());
    }

}
