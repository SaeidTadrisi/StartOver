package Vehicle;

public abstract class Vehicle {

    public boolean doorsState;
    public boolean onOffState;
    public boolean safetyState;


    protected final void protectedMethod(){
        System.out.println("This method is protected");
    }

    public void doorsAreOpen(){
        doorsState = true;
    }

    public void doorsAreClosed (){
        doorsState = false;
    }

    public void vehicleIsTurnedOn(){
        onOffState = true;
    }

    public void vehicleIsTurnedOff(){
        onOffState = false;
    }

    public void vehicleIsSafe(){
        safetyState = true;
    }

    public void vehicleIsNotSafe(){
        safetyState = false;

    }

    public abstract boolean movingState();

    public abstract String getBrands();
}
