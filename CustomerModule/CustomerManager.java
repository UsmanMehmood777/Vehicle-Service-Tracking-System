import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManager {

    static ArrayList<Customer> customers = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addCustomer() {

        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        if (name.isEmpty()) {
            System.out.println("Name cannot be empty!");
            return;
        }

        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        customers.add(new Customer(id, name, phone));

        System.out.println("Customer Added Successfully!");
    }

    public static void viewCustomers() {

        if (customers.isEmpty()) {
            System.out.println("No Customers Found!");
            return;
        }

        for (Customer c : customers) {
            c.display();
        }
    }

    public static void updateCustomer() {

        System.out.print("Enter Customer ID to Update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Customer c : customers) {

            if (c.getCustomerId() == id) {

                System.out.print("Enter New Name: ");
                String name = sc.nextLine();

                System.out.print("Enter New Phone: ");
                String phone = sc.nextLine();

                c.setName(name);
                c.setPhone(phone);

                System.out.println("Customer Updated!");
                return;
            }
        }

        System.out.println("Customer Not Found!");
    }

    public static void deleteCustomer() {

        System.out.print("Enter Customer ID to Delete: ");
        int id = sc.nextInt();

        for (Customer c : customers) {

            if (c.getCustomerId() == id) {

                customers.remove(c);
                System.out.println("Customer Deleted!");
                return;
            }
        }

        System.out.println("Customer Not Found!");
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== Customer Module =====");
            System.out.println("1. Add Customer");
            System.out.println("2. View Customers");
            System.out.println("3. Update Customer");
            System.out.println("4. Delete Customer");
            System.out.println("5. Exit");

            System.out.print("Choose Option: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addCustomer();
                    break;

                case 2:
                    viewCustomers();
                    break;

                case 3:
                    updateCustomer();
                    break;

                case 4:
                    deleteCustomer();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}