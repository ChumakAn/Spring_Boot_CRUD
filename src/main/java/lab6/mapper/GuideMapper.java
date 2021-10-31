package lab6.mapper;

import lab6.domain.Guide;
import lab6.dto.GuideDto;
import org.springframework.stereotype.Component;

@Component
public class GuideMapper extends AbstractMapper<Guide, GuideDto> {
    @Override
    public GuideDto mapObjectToDto(Guide guide) {
        if (guide == null)
        return null;

        GuideDto.GuideDtoBuilder guideDto = GuideDto.builder();
        guideDto.id(guide.getId());
        guideDto.name(guide.getName());
        guideDto.surname(guide.getSurname());
        guideDto.telephoneNumber(guide.getTelephoneNumber());
        guideDto.routesCounter(guide.getRoutes().size());

        return guideDto.build();
    }
}
