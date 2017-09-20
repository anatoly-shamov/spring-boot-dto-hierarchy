package sample.data.jpa.dto;

import lombok.Data;

@Data
public class BikeDto extends VehicleDto {
    private String frameType;
}
