// Its a Example of Inheritance
package inheritance;

public class bicycle {
    protected int gear;
    protected int speed;

    public bicycle(int startSpeed, int startGear) {
        this.speed = startSpeed;
        this.gear = startGear;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}
