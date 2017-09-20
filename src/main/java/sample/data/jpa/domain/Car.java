package sample.data.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Car extends Vehicle {
    
    @Column
    private Boolean isCabriolet; 
}
