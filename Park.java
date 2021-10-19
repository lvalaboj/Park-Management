/**
 * Park interface
 * <p>
 * Handles the specifics of a park
 *
 * @author Lakshmi Valaboju
 * @version July 14, 2021
 */
public interface Park {
    void addRide(Ride ride) throws WrongRideException;

    void close();

    void enlarge(double addedLand, double maxLand, boolean addedIndoor, boolean addedOutdoor) throws SpaceFullException;

    double getAdmissionCost();

    double getLand();

    java.lang.String getName();

    java.util.ArrayList<Ride> getRides();

    boolean[] getSeasons();

    boolean isIndoor();

    boolean isOutdoor();

    void removeRide(Ride ride);

    void setAdmissionCost(double admissionCost);

    void setName(java.lang.String name);

    void setSeasons(boolean[] seasons);

}