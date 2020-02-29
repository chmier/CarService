package service;

import model.Car;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public enum CarsService {

    INSTANCE;

    private List<Car> cars = new ArrayList<>();

    private static long NEXT_ID = 1000;

    public void addCar(Car car) {
        car.setId(NEXT_ID++);
        cars.add(car);
    }

    public void removeCar(final long id) {
        cars = cars.stream()
                .filter(car -> car.getId() != id)
                .collect(Collectors.toList());
    }

    public List<Car> getCars (){
        return cars;
    }



}
