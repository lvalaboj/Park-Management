/**
 * Rollercoaster class
 * <p>
 * Discusses the specific of a roller coaster
 *
 * @author Lakshmi Valaboju
 * @version July 14, 2021
 */
public class Rollercoaster extends Ride {

    private boolean simulated;

    public Rollercoaster(java.lang.String name,
                         java.lang.String color,
                         int minHeight,
                         int maxRiders,
                         boolean simulated) {
        super(name, color, minHeight, maxRiders);
        this.simulated = simulated;
    }

    public boolean isSimulated() {
        return simulated;
    }

    public void setSimulated(boolean simulated) {
        this.simulated = simulated;
    }

    public boolean equals(java.lang.Object o) {
        if (o == null) {
            return false;
        }

        if (o.getClass() != this.getClass()) {
            return false;
        }

        Rollercoaster ride = (Rollercoaster) o;

        return ((getName() == ride.getName()) && (getColor() == ride.getColor()) &&
                (getMinHeight() == ride.getMinHeight()) && (getMaxRiders() == ride.getMaxRiders()) &&
                (this.simulated == ride.isSimulated()));
    }

    public java.lang.String toString() {
        return "Name: " + getName() + "\n" + "Color: " + getColor() + "\n"
                + "MinHeight: " + getMinHeight() + " inches" + "\n"
                + "MaxRiders: " + getMaxRiders() + "\n" + "Simulated: " + isSimulated();
    }

}




