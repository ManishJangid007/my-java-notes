package AnonymousInnerClass;

public class AnonymousInnerClasses {
    public static void main(String[] args) {
        Bicycle mountainBike = new MountainBike();
        mountainBike.canApplyBrake();
        mountainBike.canSpeedUp();

        Bicycle bicycle = new Bicycle() { // inner Anonymous class declaration which is not that useful
            @Override
            public void canSpeedUp() {
                System.out.println("Can Speed Up Mountain Bike");
            }

            @Override
            public void canApplyBrake() {
                System.out.println("Can Apply Brake Mountain Bike");
            }
        };
        bicycle.canApplyBrake();
        bicycle.canSpeedUp();
    }
}
