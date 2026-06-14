public class Customer {

    private int customerId;
    private String name;
    private String phone;

    public Customer(int customerId, String name, String phone) {
        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void display() {
        System.out.println("ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("------------------");
    }
}