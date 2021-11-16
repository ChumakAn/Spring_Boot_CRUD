package lab6.controller;

import lab6.domain.Guide;
import lab6.dto.GuideDto;
import lab6.mapper.AbstractMapper;
import lab6.mapper.GuideMapper;
import lab6.service.AbstractService;
import lab6.service.GuideService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/guides")
@RestController
@AllArgsConstructor
public class GuideController extends AbstractController<Guide, GuideDto, Integer> {
    private GuideService guideService;
    private GuideMapper guideMapper;
    @Override
    protected AbstractService<Guide, Integer> getService() {
        return guideService;
    }

    @Override
    protected AbstractMapper<Guide, GuideDto> getMapper() {
        return guideMapper;
    }
}
