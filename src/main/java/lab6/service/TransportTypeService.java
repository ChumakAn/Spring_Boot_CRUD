package lab6.service;

import lab6.domain.TransportType;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import lab6.repository.TransportTypeRepository;

@AllArgsConstructor
@Service
public class TransportTypeService extends AbstractService<TransportType,Integer>{
    public TransportTypeRepository transportTypeRepository;

    @Override
    protected JpaRepository<TransportType, Integer> getRepository() {
        return transportTypeRepository;
    }
}
