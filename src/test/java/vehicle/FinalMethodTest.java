package vehicle;

import Vehicle.Vehicle;
import Vehicle.Ship;
import org.junit.jupiter.api.Test;

public class FinalMethodTest {

    @Test
    void Final_Method_Test() {

        Vehicle ship = new Ship("Cruise");

        ship.movingState();

    }
}
