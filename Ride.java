/**
 * Ride class
 *
 * Discusses the specific of a ride
 *
 * @author Lakshmi Valaboju
 * @version July 14, 2021
 */

public class Ride extends java.lang.Object {
    private java.lang.String name;
    private java.lang.String color;
    private int minHeight;
    private int maxRiders;

    public Ride() {
        name = "";
        color = "";
        minHeight = 0;
        maxRiders = 0;
    }

    public Ride(java.lang.String name, java.lang.String color, int minHeight, int maxRiders) {
        this.name = name;
        this.color = color;
        this.maxRiders = maxRiders;
        this.minHeight = minHeight;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getColor() {
        return color;
    }

    public void setColor(java.lang.String color) {
        this.color = color;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public void setMinHeight(int minHeight) {
        this.minHeight = minHeight;
    }

    public int getMaxRiders() {
        return maxRiders;
    }

    public void setMaxRiders(int maxRiders) {
        this.maxRiders = maxRiders;
    }

    public boolean equals(java.lang.Object o) {
        if (o == null) {
            return false;
        }

        if (o.getClass() != this.getClass()) {
            return false;
        }

        Ride ride = (Ride) o;

        return ((this.name == ride.getName()) && (this.color == ride.getColor()) &&
                (this.minHeight == ride.getMinHeight()) && (this.maxRiders == ride.getMaxRiders()));
    }

    public java.lang.String toString() {
        return "Name: " + getName() + "\n" + "Color: " + getColor() + "\n"
                + "MinHeight: " + getMinHeight() + " inches" + "\n"
                + "MaxRiders: " + getMaxRiders();
    }


}
