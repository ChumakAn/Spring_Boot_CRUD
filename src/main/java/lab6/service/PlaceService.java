package lab6.service;

import lab6.domain.Place;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import lab6.repository.PlaceRepository;

@AllArgsConstructor
@Service
public class PlaceService extends AbstractService<Place,Integer>{
    public PlaceRepository placeRepository;


    @Override
    protected JpaRepository<Place, Integer> getRepository() {
        return placeRepository;
    }
}
