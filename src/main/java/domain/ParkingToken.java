package domain;

public class ParkingToken {
    private Integer parkingLotId;
    private Integer parkingLotPlace;
    private Integer carId;

    public ParkingToken() {
    }

    public ParkingToken(Integer parkingLotId, Integer carId) {
        this.parkingLotId = parkingLotId;
        this.carId = carId;
    }

    public Integer getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(Integer parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public Integer getParkingLotPlace() {
        return parkingLotPlace;
    }

    public void setParkingLotPlace(Integer parkingLotPlace) {
        this.parkingLotPlace = parkingLotPlace;
    }

    public Integer getCarId() {
        return carId;
    }
}
