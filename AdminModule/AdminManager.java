import java.util.Scanner;

public class AdminManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Admin Module =====");
            System.out.println("1. View Customers Report");
            System.out.println("2. View Vehicles Report");
            System.out.println("3. View Services Report");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.println(
                        "Customer Report Generated");

                    break;

                case 2:

                    System.out.println(
                        "Vehicle Report Generated");

                    break;

                case 3:

                    System.out.println(
                        "Service Report Generated");

                    break;

                case 4:
                    return;

                default:

                    System.out.println(
                        "Invalid Choice");
            }
        }
    }
}