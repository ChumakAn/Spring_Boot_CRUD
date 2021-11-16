package lab6.mapper;

import lab6.domain.Route;
import lab6.dto.RouteDto;
import org.springframework.stereotype.Component;

@Component
public class RouteMapper extends AbstractMapper<Route, RouteDto> {
    @Override
    public RouteDto mapObjectToDto(Route route) {
        if (route == null)
        return null;

        RouteDto.RouteDtoBuilder routeDto = RouteDto.builder();
        routeDto.id(route.getId());
        routeDto.date(route.getDate());
        routeDto.guideName(route.getGuide().getName());
        routeDto.name(route.getName());

        return routeDto.build();
    }
}
