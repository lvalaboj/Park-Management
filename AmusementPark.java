/**
 * Amusement Park
 * <p>
 * Discusses the specific of an amusement park
 *
 * @author Lakshmi Valaboju
 * @version July 14, 2021
 */
public class AmusementPark extends java.lang.Object implements Park {
    private java.lang.String name;
    private double admissionCost;
    private double land;
    private java.util.ArrayList<Ride> rides;
    private boolean indoor;
    private boolean outdoor;
    private boolean arcade;
    private boolean bowling;
    private boolean[] seasons;

    public AmusementPark(java.lang.String name, double admissionCost, double land, java.util.ArrayList<Ride> rides,
                         boolean indoor, boolean outdoor, boolean arcade, boolean bowling, boolean[] seasons) {
        this.name = name;
        this.admissionCost = admissionCost;
        this.land = land;
        this.indoor = indoor;
        this.outdoor = outdoor;
        this.arcade = arcade;
        this.bowling = bowling;
        this.seasons = seasons;
        this.rides = rides;

    }

    public boolean isArcade() {
        return arcade;
    }

    public void setArcade(boolean arcade) {
        this.arcade = arcade;
    }

    public boolean isBowling() {
        return bowling;
    }

    public void setBowling(boolean bowling) {
        this.bowling = bowling;
    }

    public double getAdmissionCost() {
        return admissionCost;
    }

    public void setAdmissionCost(double admissionCost) {
        this.admissionCost = admissionCost;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getName() {
        return name;
    }

    public double getLand() {
        return land;
    }

    public void addRide(Ride ride) throws WrongRideException {
        Rollercoaster rc = new Rollercoaster("rc", "rc1", 5, 6, true);
        try {
            if (ride instanceof Rollercoaster) {
                rides.add(ride);
            } else {
                throw new WrongRideException("An amusement park can only have rollercoaster rides!");
            }
        } catch (WrongRideException e) {
            e.getMessage();
        }


    }

    public void removeRide(Ride ride) {
        rides.remove(ride);
    }

    public java.util.ArrayList<Ride> getRides() {
        return rides;
    }

    public boolean isIndoor() {
        return indoor;
    }

    public boolean isOutdoor() {
        return outdoor;
    }

    public void setSeasons(boolean[] seasons) {
        this.seasons = seasons;
    }

    public boolean[] getSeasons() {
        return seasons;
    }

    public void enlarge(double addedLand, double maxLand,
                        boolean addedIndoor, boolean addedOutdoor) throws SpaceFullException {
        try {
            this.land = this.land + addedLand;
            if (Boolean.compare(addedIndoor, true) == 0) {
                this.indoor = addedIndoor;
            }

            if (Boolean.compare(addedOutdoor, true) == 0) {
                this.outdoor = addedOutdoor;
            }
            if (land > maxLand) {
                throw new SpaceFullException("There is no more land to use for this park!");
            }
        } catch (SpaceFullException e) {
            e.getMessage();
        }

    }

    public void modifyRide(Ride ride, String newName, String newColor,
                           int newMinHeight, int newMaxRiders, boolean newSimulated) {
        int count = 0;
        for (int j = 0; j < rides.size(); j++) {
            if (ride.getName() == rides.get(j).getName()) {
                count = j;
            }
        }

        Rollercoaster r = (Rollercoaster) ride;
        r.setName(newName);
        r.setColor(newColor);
        r.setSimulated(newSimulated);
        r.setMinHeight(newMinHeight);
        r.setMaxRiders(newMaxRiders);


        this.rides.set(count, r);


    }

    public void close() {
        this.name = "";
        this.admissionCost = 0;
        this.land = 0;
        this.rides = null;
        this.seasons = null;
        this.outdoor = false;
        this.indoor = false;
        this.arcade = false;
        this.bowling = false;
    }

}
