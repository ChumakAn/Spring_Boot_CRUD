package lab6.mapper;

import lab6.domain.Country;
import lab6.dto.CountryDto;
import org.springframework.stereotype.Component;

@Component
public class CountryMapper extends AbstractMapper<Country, CountryDto> {

    @Override
    public CountryDto mapObjectToDto(Country country) {
        if (country == null)
            return null;

        CountryDto.CountryDtoBuilder countryDto = CountryDto.builder();
        countryDto.id(country.getId());
        countryDto.name(country.getName());
        countryDto.citiesCounter(country.getCities().size());

        return countryDto.build();
    }
}
