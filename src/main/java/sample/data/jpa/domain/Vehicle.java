package sample.data.jpa.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@MappedSuperclass
@Data
public class Vehicle {
    
	@Id
	private Long id;

    @Column
    private Integer modelYear;
}
