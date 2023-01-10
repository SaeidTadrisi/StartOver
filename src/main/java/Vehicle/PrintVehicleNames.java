package Vehicle;

public class PrintVehicleNames {
    
    Vehicle [] vehicles;
    public PrintVehicleNames(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public String execute() {

        String vehicleNames = "";

        for (int index = 0; index < vehicles.length; index++) {

            Vehicle vehicle = vehicles[index];

            if (index < vehicles.length - 1) {
                vehicleNames = vehicleNames + vehicle.getBrands() + "-";
            }else
                vehicleNames = vehicleNames + vehicle.getBrands();
        }
        return vehicleNames;
    }
}
