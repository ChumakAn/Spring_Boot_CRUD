package lab6.controller;

import lab6.domain.Hotel;
import lab6.dto.HotelDto;
import lab6.mapper.AbstractMapper;
import lab6.mapper.HotelMapper;
import lab6.service.AbstractService;
import lab6.service.HotelService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/hotels")
@RestController
@AllArgsConstructor
public class HotelController extends AbstractController<Hotel, HotelDto, Integer>{
    private HotelService hotelService;
    private HotelMapper hotelMapper;

    @Override
    protected AbstractService<Hotel, Integer> getService() {
        return hotelService;
    }

    @Override
    protected AbstractMapper<Hotel, HotelDto> getMapper() {
        return hotelMapper;
    }
}
