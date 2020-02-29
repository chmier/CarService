package model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Car {

    private long id;
    private CarBrand carBrand;
    private String licensePlate;
    private String lastName;
    private int yearbook;
    private long interval;

    public Car(CarBrand carBrand, String licensePlate, String lastName, int yearbook, long interval) {

        this.carBrand = carBrand;
        this.licensePlate = licensePlate;
        this.lastName = lastName;
        this.yearbook = yearbook;
        this.interval = interval;
    }

    public static class CarBuildier {

        private CarBrand carBrand;
        private String licensePlate;
        private String lastName;
        private int yearbook;
        private long interval;


        public CarBuildier setCarBrand(CarBrand carBrand) {
            this.carBrand = carBrand;
            return this;
        }

        public CarBuildier setLicensePlate(String licensePlate) {
            this.licensePlate = licensePlate;
            return this;
        }

        public CarBuildier setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public CarBuildier setYearbook(int yearbook) {
            this.yearbook = yearbook;
            return this;
        }

        public CarBuildier setInterval(long interval) {
            this.interval = interval;
            return this;
        }

        public Car createCar() {
            return new Car(carBrand, licensePlate, lastName, yearbook, interval);
        }
    }

}
