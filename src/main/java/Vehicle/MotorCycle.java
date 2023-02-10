package Vehicle;

public class MotorCycle extends Vehicle implements GearBox , TrunkValue{

    String brand;
    int trunkSize;
    GearBoxType gearBoxType;

    public MotorCycle (String brand){
        this.brand = brand;
    }

    public MotorCycle(String brand, int trunkSize, GearBoxType gearBoxType) {
        this.brand = brand;
        this.trunkSize = trunkSize;
        this.gearBoxType = gearBoxType;
    }

    public boolean movingState(){
        if (onOffState && safetyState) {
            return true;
    }else {
            return false;
        }
    }

    @Override
    public String getBrands() {
        return brand;
    }

    @Override
    public GearBoxType TypeOfGearBox() {
        return gearBoxType;
    }

    @Override
    public int SizeOfTrunk() {
        return trunkSize;
    }
}
