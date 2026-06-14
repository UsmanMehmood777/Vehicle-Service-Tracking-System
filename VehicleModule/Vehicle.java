public class Vehicle {

    private int vehicleId;
    private String vehicleNumber;
    private String model;
    private int ownerId;

    public Vehicle(int vehicleId, String vehicleNumber,
                   String model, int ownerId) {

        this.vehicleId = vehicleId;
        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.ownerId = ownerId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getModel() {
        return model;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void display() {

        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Model: " + model);
        System.out.println("Owner ID: " + ownerId);
        System.out.println("------------------------");
    }
}