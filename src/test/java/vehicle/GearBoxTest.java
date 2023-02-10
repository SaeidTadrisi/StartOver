package vehicle;

import Vehicle.GearBoxType;
import org.junit.jupiter.api.Test;

public class GearBoxTest {

    @Test
    void Print_GearBox_Values() {
        GearBoxType.print();
        GearBoxType.printInPersian();
    }

    @Test
    void Print_GearBox_Values_In_Italian() {
        GearBoxType.printInItalian();
    }
}
