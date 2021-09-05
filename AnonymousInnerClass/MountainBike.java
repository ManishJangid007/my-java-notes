package AnonymousInnerClass;

public class MountainBike implements Bicycle {

    @Override
    public void canSpeedUp() {
        System.out.println("Can Speed Up Mountain Bike");
    }

    @Override
    public void canApplyBrake() {
        System.out.println("Can Apply Brake Mountain Bike");
    }
}
