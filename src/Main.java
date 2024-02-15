import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Contact contact1 = new Contact();
        contact1.setContactName("Sabina Java 13");
        contact1.setPhoneNumber("0705443322");

        Contact contact2 = new Contact();
        contact2.setContactName("SultanAli Java 13");
        contact2.setPhoneNumber("0504335566");

        Contact contact3 = new Contact();
        contact3.setContactName("Nurkyz Java 13");
        contact3.setPhoneNumber("0708556644");

        Contact [] contacts = {contact1,contact2,contact3};

        Phone phone = new Phone();
        phone.setBrand("Redmi");
        phone.setModel("Not 9");
        phone.setPrice(20000.0);
        phone.setPhonesUserName("Aizat");
        phone.setContacts(contacts);

        phone.getAllContacts();


    }
}