package sample.data.jpa.dto;

import lombok.Data;

@Data
public class CarDto extends VehicleDto {
    private Boolean isCabriolet;
}
