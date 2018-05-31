import domain.Car;
import domain.ParkingBoy;
import domain.ParkingLot;
import domain.ParkingToken;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ParkingBoyTest {

    @Test
    public void parking_in_first_parking_lot() {
        Car car = new Car(0);
        ArrayList<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLot1 = new ParkingLot(1, 10, null);
        parkingLots.add(parkingLot1);
        ParkingLot parkingLog2 = new ParkingLot(2, 10, null);
        parkingLots.add(parkingLog2);
        ParkingBoy parkingBoy = new ParkingBoy(1, parkingLots);
        ParkingToken token = parkingBoy.park(car);
        assertThat(token.getCarId(), is(0));
        assertThat(token.getParkingLotId(), is(parkingLot1.getId()));
    }


    @Test
    public void parking_first_parking_lot_is_full() {
        Car car = new Car(0);
        ArrayList<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLot1 = new ParkingLot(1, 0, null);
        parkingLots.add(parkingLot1);
        ParkingLot parkingLog2 = new ParkingLot(2, 10, null);
        parkingLots.add(parkingLog2);
        ParkingBoy parkingBoy = new ParkingBoy(1, parkingLots);
        ParkingToken token = parkingBoy.park(car);
        assertThat(token.getCarId(), is(0));
        assertThat(token.getParkingLotId(), is(parkingLog2.getId()));
    }


    @Test
    public void parking_boy_can_pick_up_car() {
        Car car = new Car(0);
        ArrayList<ParkingLot> parkingLots = new ArrayList<>();
        ParkingLot parkingLot1 = new ParkingLot(1, 0, null);
        parkingLots.add(parkingLot1);
        ParkingLot parkingLog2 = new ParkingLot(2, 10, null);
        parkingLots.add(parkingLog2);
        ParkingBoy parkingBoy = new ParkingBoy(1, parkingLots);

        ParkingToken token = parkingBoy.park(car);

        Car pickUpCar = parkingBoy.pickUp(token);
        assertThat(pickUpCar.getId(), is(car.getId()));
    }

    @Test
    public void return_token_when_give_a_car() {

    }

}
