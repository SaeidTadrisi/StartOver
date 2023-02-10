package vehicle;

import Vehicle.Vehicle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Vehicle.Car;
import Vehicle.Ship;
import Vehicle.MotorCycle;
import Vehicle.GearBoxType;
public class VehicleTest {

    @Test
    void vehicle_must_move_when_doors_are_closed_turned_on_and_is_safe() {

        Car bmw = new Car("bmw");

        bmw.doorsAreOpen();
        bmw.vehicleIsSafe();
        bmw.vehicleIsTurnedOn();

        boolean bmwMovingStatus = bmw.movingState();

        Assertions.assertFalse(bmwMovingStatus);

    }

    @Test
    void vehicle_abstraction_test() {

        Vehicle fiat = new Car("fiat");

        fiat.vehicleIsSafe();
        fiat.vehicleIsTurnedOn();

        boolean fiatMovingStatus = fiat.movingState();
        Assertions.assertTrue(fiatMovingStatus);
    }


    @Test
    void ship_test() {
        Vehicle cruise = new Ship("Cruise");

        cruise.vehicleIsSafe();
        cruise.vehicleIsTurnedOn();

        boolean cruiseMovingStatus = cruise.movingState();

        Assertions.assertTrue(cruiseMovingStatus);
    }

    @Test
    void motor_cycle_test() {
        Vehicle rex = new MotorCycle("Rex");

        rex.vehicleIsSafe();
        rex.vehicleIsTurnedOn();

        boolean rexMovingStatus = rex.movingState();

        Assertions.assertTrue(rexMovingStatus);


    }

    @Test
    void Should_Print_GearBox_Types() {

        Car fiat = new Car("Fiat", 25, GearBoxType.AUTOMATIC);

        String toString = fiat.toString();
        System.out.println(toString);
    }
}
