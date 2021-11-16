package lab6.service;

import lab6.domain.Guide;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import lab6.repository.GuideRepository;

@AllArgsConstructor
@Service
public class GuideService extends AbstractService<Guide, Integer> {
    public GuideRepository guideRepository;


    @Override
    protected JpaRepository<Guide, Integer> getRepository() {
        return guideRepository;
    }
}
