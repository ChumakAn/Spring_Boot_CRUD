package lab6.service;

import lab6.domain.Country;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import lab6.repository.CountryRepository;

@AllArgsConstructor
@Service
public class CountryService extends AbstractService<Country, Integer> {
    public CountryRepository countryRepository;

    @Override
    protected JpaRepository<Country, Integer> getRepository() {
        return countryRepository;
    }
}
