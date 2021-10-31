package lab6.service;

import lab6.domain.City;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import lab6.repository.CityRepository;

@AllArgsConstructor
@Service
public class CityService extends AbstractService<City,Integer> {
    public CityRepository cityRepository;

    @Override
    protected JpaRepository<City, Integer> getRepository() {
        return cityRepository;
    }
}
