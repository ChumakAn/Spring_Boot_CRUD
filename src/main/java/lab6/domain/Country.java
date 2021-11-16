package lab6.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "country")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")

public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name", length = 45)
    private String name;
    @OneToMany(mappedBy = "country", fetch = FetchType.EAGER)
    private Collection<City> cities;

    public Country(Integer id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString(){
        return "Country ["
                + "id =" + id + ", "
                + "name = " + name
                + "];"  + "\n";
    }
}
