package Vehicle;

import java.util.Objects;

import static java.lang.System.*;

public class Ship extends Vehicle implements GearBox, TrunkValue{

    String brand;
    int trunkSize;
    GearBoxType gearBoxType;

//    @Override
//    protected void protectedMethod(){
//        System.out.println("We are in Ship Class");
//    }

    public Ship (String brand){
        this.brand = brand;
    }

    public Ship(String brand, int trunkSize, GearBoxType gearBoxType) {
        this.brand = brand;
        this.trunkSize = trunkSize;
        this.gearBoxType = gearBoxType;
    }

    @Override
    public boolean movingState() {
        protectedMethod();
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
    public GearBoxType TypeOfGearBox() {
        return gearBoxType;
    }

    @Override
    public int SizeOfTrunk() {
        return trunkSize;
    }


    public void printReference() {
        out.println(this);
    }

    public void printReferencesObject (Object object){
        out.println(object);
    }
}
