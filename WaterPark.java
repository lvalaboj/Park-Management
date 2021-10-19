/**
 * Waterpark class
 * <p>
 * Discusses the specific of a water park
 *
 * @author Lakshmi Valaboju
 * @version July 14, 2021
 */
public class WaterPark extends java.lang.Object implements Park {
    private java.lang.String name;
    private double admissionCost;
    private double land;
    private java.util.ArrayList<Ride> rides;
    private boolean indoor;
    private boolean outdoor;
    private boolean lazyRiver;
    private boolean wavePool;
    private boolean[] seasons;

    public WaterPark(java.lang.String name, double admissionCost, double land,
                     java.util.ArrayList<Ride> rides, boolean indoor, boolean outdoor,
                     boolean lazyRiver, boolean wavePool, boolean[] seasons) {
        this.name = name;
        this.admissionCost = admissionCost;
        this.land = land;
        this.rides = rides;
        this.indoor = indoor;
        this.outdoor = outdoor;
        this.lazyRiver = lazyRiver;
        this.wavePool = wavePool;
        this.seasons = seasons;
    }

    public boolean isLazyRiver() {
        return lazyRiver;
    }

    public void setLazyRiver(boolean lazyRiver) {
        this.lazyRiver = lazyRiver;
    }

    public boolean isWavePool() {
        return wavePool;
    }

    public void setWavePool(boolean wavePool) {
        this.wavePool = wavePool;
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
        Waterslide ws = new Waterslide("ws", "ws1", 5, 6, 7.5);

        try {
            if (ride instanceof Waterslide) {
                rides.add(ride);
            } else {
                throw new WrongRideException("An amusement park can only have waterslide rides!");
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

    public void enlarge(double addedLand, double maxLand, boolean addedIndoor,
                        boolean addedOutdoor) throws SpaceFullException {
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

    public void modifyRide(Ride ride, java.lang.String newName, java.lang.String newColor,
                            int newMinHeight, int newMaxRiders, double newSplashDepth) {

        int count = 0;
        for (int j = 0; j < rides.size(); j++) {
            if (ride.getName() == rides.get(j).getName()) {
                count = j;
            }
        }

        Waterslide r = (Waterslide) ride;

        r.setName(newName);
        r.setColor(newColor);
        r.setSplashDepth(newSplashDepth);
        r.setMinHeight(newMinHeight);
        r.setMaxRiders(newMaxRiders);


        this.rides.set(count, r);

    }

    public void close() {
        name = "";
        admissionCost = 0;
        land = 0;
        rides = null;
        seasons = null;
        indoor = false;
        outdoor = false;
        lazyRiver = false;
        wavePool = false;
    }


}
