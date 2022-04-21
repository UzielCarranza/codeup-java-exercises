package ContactsManager;

public class ContactDetails {
    private String contactName;
    private String phoneMumber;


    public ContactDetails() {
    }

    ;

    public ContactDetails(String contactName, String phoneMumber) {
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
