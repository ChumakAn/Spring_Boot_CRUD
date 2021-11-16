package lab6.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CityDto {
    private Integer id;
    //Many t one string, one to many counter
    private String hotelName;
    private String name;
    private String countryName;
    private Integer placesCounter;
}
