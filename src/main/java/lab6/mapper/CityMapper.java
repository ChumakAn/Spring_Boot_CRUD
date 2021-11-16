package lab6.mapper;

import lab6.domain.City;
import lab6.dto.CityDto;
import org.springframework.stereotype.Component;

@Component
public class CityMapper extends AbstractMapper<City, CityDto> {

    @Override
    public CityDto mapObjectToDto(City city) {
        if (city == null)
            return null;

        CityDto.CityDtoBuilder cityDto = CityDto.builder();
        cityDto.id(city.getId());
        cityDto.hotelName(city.getHotel().getName());
        cityDto.name(city.getName());
        cityDto.countryName(city.getCountry().getName());
        cityDto.placesCounter(city.getPlaces().size());

        return cityDto.build();
    }
}
