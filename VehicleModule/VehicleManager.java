import java.util.ArrayList;
import java.util.Scanner;

public class VehicleManager {

    static ArrayList<Vehicle> vehicles = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addVehicle() {

        System.out.print("Enter Vehicle ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Vehicle Number: ");
        String number = sc.nextLine();

        System.out.print("Enter Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Owner ID: ");
        int ownerId = sc.nextInt();

        vehicles.add(
            new Vehicle(id, number, model, ownerId)
        );

        System.out.println("Vehicle Added Successfully!");
    }

    public static void viewVehicles() {

        if (vehicles.isEmpty()) {
            System.out.println("No Vehicles Found!");
            return;
        }

        for (Vehicle v : vehicles) {
            v.display();
        }
    }

    public static void updateVehicle() {

        System.out.print("Enter Vehicle ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Vehicle v : vehicles) {

            if (v.getVehicleId() == id) {

                System.out.print("Enter New Vehicle Number: ");
                String number = sc.nextLine();

                System.out.print("Enter New Model: ");
                String model = sc.nextLine();

                v.setVehicleNumber(number);
                v.setModel(model);

                System.out.println("Vehicle Updated!");
                return;
            }
        }

        System.out.println("Vehicle Not Found!");
    }

    public static void deleteVehicle() {

        System.out.print("Enter Vehicle ID: ");
        int id = sc.nextInt();

        for (Vehicle v : vehicles) {

            if (v.getVehicleId() == id) {

                vehicles.remove(v);

                System.out.println("Vehicle Deleted!");
                return;
            }
        }

        System.out.println("Vehicle Not Found!");
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== Vehicle Module =====");
            System.out.println("1. Add Vehicle");
            System.out.println("2. View Vehicles");
            System.out.println("3. Update Vehicle");
            System.out.println("4. Delete Vehicle");
            System.out.println("5. Exit");

            System.out.print("Choose Option: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addVehicle();
                    break;

                case 2:
                    viewVehicles();
                    break;

                case 3:
                    updateVehicle();
                    break;

                case 4:
                    deleteVehicle();
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}