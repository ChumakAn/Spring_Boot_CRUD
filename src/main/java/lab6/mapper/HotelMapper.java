package lab6.mapper;

import lab6.domain.Hotel;
import lab6.dto.HotelDto;
import org.springframework.stereotype.Component;

@Component
public class HotelMapper extends AbstractMapper<Hotel, HotelDto> {

    @Override
    public HotelDto mapObjectToDto(Hotel hotel) {
        if(hotel == null)
        return null;

        HotelDto.HotelDtoBuilder hotelDto = HotelDto.builder();
        hotelDto.id(hotel.getId());
        hotelDto.citiesCounter(hotel.getCities().size());
        hotelDto.name(hotel.getName());
        hotelDto.rate(hotel.getRate());

        return hotelDto.build();
    }
}
