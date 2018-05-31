package domain;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private Integer id;
    private Integer capacity;
    private List<Car> carList = new ArrayList<>();

    public ParkingLot() {
    }

    public ParkingLot(Integer id, Integer capacity, List<Car> carList) {
        this.id = id;
        this.capacity = capacity;
    }


    public boolean full() {
        return capacity.equals(carList.size());
    }

    public ParkingToken park(Car car) {
        carList.add(car);
        return new ParkingToken(this.id, car.getId());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Car pickUp(int carId) {
        for (Car car : carList) {
            if (car.getId() == carId) {
                return car;
            }
        }
        return null;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }
}
