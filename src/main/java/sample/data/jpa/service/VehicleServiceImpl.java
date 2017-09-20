package sample.data.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.data.jpa.domain.Bike;
import sample.data.jpa.domain.Car;
import sample.data.jpa.repository.BikeRepository;
import sample.data.jpa.repository.CarRepository;

@Service("vehicleService")
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    CarRepository carRepository;

    @Autowired
    BikeRepository bikeRepository;

    @Override
    public Car getCar(Long id) {
        return carRepository.getOne(id);
    }

    @Override
    public void saveCar(Car car) {
        carRepository.save(car);        
    }

    @Override
    public Bike getBike(Long id) {
        return bikeRepository.getOne(id);
    }

    @Override
    public void saveBike(Bike bike) {
        bikeRepository.save(bike);        
    }    
}
