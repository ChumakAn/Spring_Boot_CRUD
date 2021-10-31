package lab6.controller;

import lab6.domain.Place;
import lab6.dto.PlaceDto;
import lab6.mapper.AbstractMapper;
import lab6.mapper.PlaceMapper;
import lab6.service.AbstractService;
import lab6.service.PlaceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/places")
@RestController
@AllArgsConstructor
public class PlaceController extends AbstractController<Place, PlaceDto,Integer> {
    private PlaceService placeService;
    private PlaceMapper placeMapper;

    @Override
    protected AbstractService<Place, Integer> getService() {
        return placeService;
    }

    @Override
    protected AbstractMapper<Place, PlaceDto> getMapper() {
        return placeMapper;
    }
}
