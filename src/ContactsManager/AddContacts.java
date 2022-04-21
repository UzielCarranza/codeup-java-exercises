package ContactsManager;

public class AddContacts {
    private String contactName;
    private String phoneMumber;


    public AddContacts() {
    }

    ;

    public AddContacts(String contactName, String phoneMumber) {
        this.contactName = contactName;
        this.phoneMumber = phoneMumber.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
    }

    ;

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhoneMumber() {
        return phoneMumber;
    }

    public void setPhoneMumber(String phoneMumber) {
        this.phoneMumber = phoneMumber;
    }
}
