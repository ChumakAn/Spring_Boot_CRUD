package lab6.controller;

import lab6.domain.PaymentType;
import lab6.dto.PaymentTypeDto;
import lab6.mapper.AbstractMapper;
import lab6.mapper.PaymentTypeMapper;
import lab6.service.AbstractService;
import lab6.service.PaymentTypeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/payment_type")
@RestController
@AllArgsConstructor
public class PaymentTypeController extends AbstractController<PaymentType, PaymentTypeDto, Integer> {
    private PaymentTypeService paymentTypeService;
    private PaymentTypeMapper paymentTypeMapper;


    @Override
    protected AbstractService<PaymentType, Integer> getService() {
        return paymentTypeService;
    }

    @Override
    protected AbstractMapper<PaymentType, PaymentTypeDto> getMapper() {
        return paymentTypeMapper;
    }
}
