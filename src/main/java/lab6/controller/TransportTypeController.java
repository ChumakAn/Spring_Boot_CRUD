package lab6.controller;

import lab6.domain.TransportType;
import lab6.dto.TransportTypeDto;
import lab6.mapper.AbstractMapper;
import lab6.mapper.TransportTypeMapper;
import lab6.service.AbstractService;
import lab6.service.TransportTypeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/transport_types")
@RestController
@AllArgsConstructor
public class TransportTypeController extends AbstractController<TransportType, TransportTypeDto, Integer> {
   private TransportTypeService transportTypeService;
   private TransportTypeMapper transportTypeMapper;

    @Override
    protected AbstractService<TransportType, Integer> getService() {
        return transportTypeService;
    }

    @Override
    protected AbstractMapper<TransportType, TransportTypeDto> getMapper() {
        return transportTypeMapper;
    }
}
