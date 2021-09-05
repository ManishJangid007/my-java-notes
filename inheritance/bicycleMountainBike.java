// it is an Example of inheritance

package inheritance;

import bicycle;

public class bicycleMountainBike extends bicycle {
    public int seatHeight;

    public bicycleMountainBike(int startHeight, int startSpeed, int startGear) {
        super(startSpeed, startGear);
        this.seatHeight = startHeight;
    }

    public void setHeight(int newValue) {

    }
}
