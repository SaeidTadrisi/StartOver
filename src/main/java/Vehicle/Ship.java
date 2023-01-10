package Vehicle;

public class Ship extends Vehicle implements GearBox, TrunkValue{

    String brand;
    int trunkSize;
    String gearBoxType;

    public Ship (String brand){
        this.brand = brand;
    }

    public Ship(String brand, int trunkSize, String gearBoxType) {
        this.brand = brand;
        this.trunkSize = trunkSize;
        this.gearBoxType = gearBoxType;
    }

    @Override
    public boolean movingState() {
        if ( onOffState && safetyState ){
            return true;
        }else
        return false;
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
