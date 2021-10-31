package lab6.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HotelDto {
    private Integer id;
    private Integer citiesCounter;
    private String name;
    private Integer rate;
}

