package vehicle;

import Vehicle.Car;
import Vehicle.GearBoxType;
import Vehicle.Ship;
import org.junit.jupiter.api.Test;
import static Vehicle.GearBoxType.*;

public class ShipTest {
    @Test
    void this_keyword_test() {

        Ship ship = new Ship("Cruise");
        Car car = new Car("BMW",150, MANUAL);

        ship.printReference();
        ship.printReferencesObject(ship);
        ship.printReferencesObject(this);
        ship.printReferencesObject(car);



    }
}
