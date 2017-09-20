package sample.data.jpa.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
public class Bike extends Vehicle {
    
    @Column
    private String frameType;     

        
}
