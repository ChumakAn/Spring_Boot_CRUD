package lab6.service;

import lab6.domain.Route;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import lab6.repository.RouteRepository;

@AllArgsConstructor
@Service
public class RouteService extends AbstractService<Route, Integer>{
    public RouteRepository routeRepository;


    @Override
    protected JpaRepository<Route, Integer> getRepository() {
        return routeRepository;
    }
}
