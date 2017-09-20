package sample.data.jpa.service;

import sample.data.jpa.domain.Bike;
import sample.data.jpa.domain.Car;

public interface VehicleService {
    Car getCar(Long id);
    void saveCar(Car car);
    
    Bike getBike(Long id);
    void saveBike(Bike bike);
}
