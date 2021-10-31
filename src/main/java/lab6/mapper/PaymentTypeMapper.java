package lab6.mapper;

import lab6.domain.PaymentType;
import lab6.dto.PaymentTypeDto;
import org.springframework.stereotype.Component;

@Component
public class PaymentTypeMapper extends AbstractMapper<PaymentType, PaymentTypeDto> {
    @Override
    public PaymentTypeDto mapObjectToDto(PaymentType paymentType) {
        if(paymentType == null)
        return null;

        PaymentTypeDto.PaymentTypeDtoBuilder paymentTypeDto = PaymentTypeDto.builder();
        paymentTypeDto.id(paymentType.getId());
        paymentTypeDto.type(paymentType.getType());

        return paymentTypeDto.build();
    }
}
