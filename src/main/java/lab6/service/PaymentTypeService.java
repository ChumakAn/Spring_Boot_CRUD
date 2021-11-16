package lab6.service;

import lab6.domain.PaymentType;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import lab6.repository.PaymentTypeRepository;

@AllArgsConstructor
@Service
public class PaymentTypeService extends AbstractService<PaymentType,Integer> {
    public PaymentTypeRepository paymentTypeRepository;


    @Override
    protected JpaRepository<PaymentType, Integer> getRepository() {
        return paymentTypeRepository;
    }
}
