package lab6.controller;

import lab6.domain.Route;
import lab6.dto.RouteDto;
import lab6.mapper.AbstractMapper;
import lab6.mapper.RouteMapper;
import lab6.service.AbstractService;
import lab6.service.RouteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/routes")
@RestController
@AllArgsConstructor
public class RouteController extends AbstractController<Route, RouteDto,Integer> {
    private RouteService routeService;
    private RouteMapper routeMapper;

    @Override
    protected AbstractService<Route, Integer> getService() {
        return routeService;
    }

    @Override
    protected AbstractMapper<Route, RouteDto> getMapper() {
        return routeMapper;
    }
}
