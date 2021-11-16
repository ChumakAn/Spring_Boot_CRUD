package lab6.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "place")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")

public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "city_id", referencedColumnName = "id", nullable = false)
    private  City city;
    @Column(name = "name", length = 45)
    private String name;

    @Override
    public String toString(){
        return "Place ["
                + "id =" + id + ", "
                + "cityId =" + city.getId() + ", "
                + "name = " + name
                + "];"  + "\n";
    }
}
