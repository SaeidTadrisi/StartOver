package Vehicle;


import static Vehicle.GearBoxType.*;
import static java.lang.Integer.parseInt;

public class Main {

    public static void main (String[] args){

        for (int index = 0; index < args.length; index++) {
            System.out.println(args[index]);

            String brand = args[0];
            int trunkValue = parseInt(args[1]);
            GearBoxType gearBoxType = valueOf(args[2]);

            Vehicle car = new Car(brand, trunkValue, gearBoxType);

            car.vehicleIsTurnedOn();
            car.vehicleIsSafe();

            System.out.println(car.movingState());
        }
    }


}
