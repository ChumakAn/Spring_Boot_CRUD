package lab6.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GuideDto {
    private Integer id;
    private String name;
    private String surname;
    private String telephoneNumber;
    private Integer routesCounter;
}
