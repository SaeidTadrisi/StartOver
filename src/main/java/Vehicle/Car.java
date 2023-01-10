package Vehicle;

public class Car extends Vehicle implements GearBox, TrunkValue {

    String brand;
    int trunkSize;
    String gearBoxType;

    public Car (String brand){
        this.brand = brand;
    }

    public Car(String brand, int TrunkSize, String GearboxType) {
        this.brand = brand;
        this.trunkSize = TrunkSize;
        this.gearBoxType = GearboxType;
    }

    public boolean movingState() {
        if (onOffState && !doorsState && safetyState) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getBrands() {
        return brand;
    }

    @Override
    public String TypeOfGearBox() {
        return gearBoxType;
    }

    @Override
    public int SizeOfTrunk() {
        return trunkSize;
    }


}
