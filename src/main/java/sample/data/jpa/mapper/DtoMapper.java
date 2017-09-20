package sample.data.jpa.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;
import sample.data.jpa.domain.Bike;
import sample.data.jpa.dto.BikeDto;

@Mapper(componentModel = "spring")
@Component
public interface DtoMapper {

    @Mapping(target = "type", constant = "bike")
    BikeDto toBikeDto(Bike entity);

    Bike toBikeEntity(BikeDto dto);
}
