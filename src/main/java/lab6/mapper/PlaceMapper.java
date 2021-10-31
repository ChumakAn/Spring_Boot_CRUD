package lab6.mapper;

import lab6.domain.Place;
import lab6.dto.PlaceDto;
import org.springframework.stereotype.Component;

@Component
public class PlaceMapper extends AbstractMapper<Place, PlaceDto> {
    @Override
    public PlaceDto mapObjectToDto(Place place) {
        if (place == null)
        return null;

        PlaceDto.PlaceDtoBuilder placeDto = PlaceDto.builder();
        placeDto.id(place.getId());
        placeDto.cityName(place.getCity().getName());
        placeDto.name(place.getName());

        return placeDto.build();
    }
}
