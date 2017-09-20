package sample.data.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sample.data.jpa.domain.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {
}
