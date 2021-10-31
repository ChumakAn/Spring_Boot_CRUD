package lab6.controller;

import lab6.domain.Country;
import lab6.dto.CountryDto;
import lab6.mapper.AbstractMapper;
import lab6.mapper.CountryMapper;
import lab6.service.AbstractService;
import lab6.service.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/countries")
@RestController
@AllArgsConstructor
public class CountryController extends AbstractController<Country, CountryDto, Integer> {
    private final CountryService countryService;
    private final CountryMapper countryMapper;


    @Override
    protected AbstractService<Country, Integer> getService() {
        return countryService;
    }

    @Override
    protected AbstractMapper<Country, CountryDto> getMapper() {
        return countryMapper;
    }
}
