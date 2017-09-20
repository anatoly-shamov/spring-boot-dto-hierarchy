package sample.data.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sample.data.jpa.domain.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}
