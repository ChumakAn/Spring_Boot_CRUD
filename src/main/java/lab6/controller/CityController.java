package lab6.controller;


import lab6.domain.City;
import lab6.dto.CityDto;
import lab6.mapper.AbstractMapper;
import lab6.mapper.CityMapper;
import lab6.service.AbstractService;
import lab6.service.CityService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/cities")
@RestController
@AllArgsConstructor
public class CityController extends AbstractController<City, CityDto,Integer> {
    private final CityService cityService;
    private final CityMapper cityMapper;


    @Override
    protected AbstractService<City, Integer> getService() {
        return cityService;
    }

    @Override
    protected AbstractMapper<City, CityDto> getMapper() {
        return cityMapper;
    }
}
