/**
 * Waterslide class
 * <p>
 * Discusses the specific of a water slide
 *
 * @author Lakshmi Valaboju
 * @version July 14, 2021
 */
public class Waterslide extends Ride {
    private double splashDepth;

    public Waterslide(java.lang.String name, java.lang.String color, int minHeight, int maxRiders, double splashDepth) {
        super(name, color, minHeight, maxRiders);
        this.splashDepth = splashDepth;
    }

    public double getSplashDepth() {
        return splashDepth;
    }

    public void setSplashDepth(double splashDepth) {
        this.splashDepth = splashDepth;
    }

    public boolean equals(java.lang.Object o) {
        if (o == null) {
            return false;
        }

        if (o.getClass() != this.getClass()) {
            return false;
        }

        Waterslide ride = (Waterslide) o;

        return ((getName() == ride.getName()) && (getColor() == ride.getColor()) &&
                (getMinHeight() == ride.getMinHeight()) && (getMaxRiders() == ride.getMaxRiders())
                && (this.splashDepth == ride.getSplashDepth()));
    }

    public java.lang.String toString() {
        return "Name: " + getName() + "\n" + "Color: " + getColor() + "\n"
                + "MinHeight: " + getMinHeight() + " inches" + "\n"
                + "MaxRiders: " + getMaxRiders() + "\n" + "SplashDepth: " + getSplashDepth() + " feet";
    }

}
