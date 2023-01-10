import Vehicle.Car;
import Vehicle.Vehicle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Vehicle.Ship;
import Vehicle.MotorCycle;
import Vehicle.PrintVehicleNames;

public class PrintBrandTest {

    @Test
    void should_print_vehicle_names() {

        Vehicle bmw = new Car("BMW", 120 , "Manual");
        Vehicle cruise = new Ship("Cruise", 1300, "Automatic");
        MotorCycle rex = new MotorCycle("REX", 0 , "Manual");

        Vehicle [] vehicles = {bmw,cruise,rex};


        PrintVehicleNames printVehicleNames = new PrintVehicleNames(vehicles);

        String vehicleNames = printVehicleNames.execute();


        Assertions.assertEquals("BMW-Cruise-REX",vehicleNames);

    }
}
