package lab6.mapper;

import lab6.domain.TransportType;
import lab6.dto.TransportTypeDto;
import org.springframework.stereotype.Component;

@Component
public class TransportTypeMapper extends AbstractMapper<TransportType, TransportTypeDto> {
    @Override
    public TransportTypeDto mapObjectToDto(TransportType transportType) {
        if (transportType == null)
        return null;

        TransportTypeDto.TransportTypeDtoBuilder transportTypeDto = TransportTypeDto.builder();
        transportTypeDto.id(transportType.getId());
        transportTypeDto.name(transportType.getName());

        return transportTypeDto.build();
    }
}
