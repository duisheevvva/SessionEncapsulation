import java.util.Arrays;

public class Phone {
    private  String brand;
    private  String model;
    private double price;
    private String phonesUserName;
    private Contact [] contacts;

    public Phone() {
    }

    public Phone(String brand, String model, double price, String phonesUserName, Contact[] contacts) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.phonesUserName = phonesUserName;
        this.contacts = contacts;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPhonesUserName() {
        return phonesUserName;
    }

    public void setPhonesUserName(String phonesUserName) {
        this.phonesUserName = phonesUserName;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }


    public void getAllContacts (){
        for (Contact contact:contacts) {
            System.out.println(contact);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", phonesUserName='" + phonesUserName + '\'' +
                ", contacts=" + Arrays.toString(contacts) +
                '}';
    }
}
