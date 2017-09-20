package sample.data.jpa.mapper;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import sample.data.jpa.domain.Bike;
import sample.data.jpa.dto.BikeDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-09-20T12:30:06+0300",
    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_144 (Oracle Corporation)"
)
@Component
public class DtoMapperImpl implements DtoMapper {

    @Override
    public BikeDto toBikeDto(Bike entity) {
        if ( entity == null ) {
            return null;
        }

        BikeDto bikeDto = new BikeDto();

        bikeDto.setId( entity.getId() );
        bikeDto.setModelYear( entity.getModelYear() );
        bikeDto.setFrameType( entity.getFrameType() );

        bikeDto.setType( "bike" );

        return bikeDto;
    }

    @Override
    public Bike toBikeEntity(BikeDto dto) {
        if ( dto == null ) {
            return null;
        }

        Bike bike = new Bike();

        bike.setId( dto.getId() );
        bike.setModelYear( dto.getModelYear() );
        bike.setFrameType( dto.getFrameType() );

        return bike;
    }
}
