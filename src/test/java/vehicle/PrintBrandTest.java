package vehicle;

import Vehicle.Car;
import Vehicle.Vehicle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Vehicle.Ship;
import Vehicle.MotorCycle;
import Vehicle.PrintVehicleNames;
import static Vehicle.GearBoxType.*;

public class PrintBrandTest {

    @Test
    void should_print_vehicle_names() {

        Vehicle bmw = new Car("BMW", 120 , MANUAL);
        Vehicle cruise = new Ship("Cruise", 1300, AUTOMATIC);
        MotorCycle rex = new MotorCycle("REX", 0 , MANUAL);

        Vehicle [] vehicles = {bmw,cruise,rex};


        PrintVehicleNames printVehicleNames = new PrintVehicleNames(vehicles);

        String vehicleNames = printVehicleNames.execute();


        Assertions.assertEquals("BMW-Cruise-REX",vehicleNames);

    }
}
