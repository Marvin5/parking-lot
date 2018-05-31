package domain;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import java.util.List;

public class ParkingBoy {
    private Integer id;
    private List<ParkingLot> parkingLotList;

    public ParkingBoy(Integer id, List<ParkingLot> parkingLotList) {
        this.id = id;
        this.parkingLotList = parkingLotList;
    }

    @Nullable
    public ParkingToken park(@NotNull Car car) {
        for (ParkingLot parkingLot : parkingLotList) {
            if (!parkingLot.full()) {
                return parkingLot.park(car);
            }
        }
        return null;
    }

    @Nullable
    public Car pickUp(@NotNull ParkingToken token) {
        int parkingLotId = token.getParkingLotId();
        for (ParkingLot parkingLot : parkingLotList) {
            if (parkingLot.getId() == parkingLotId) {
                return parkingLot.pickUp(token.getCarId());
            }
        }
        return null;
    }


}
