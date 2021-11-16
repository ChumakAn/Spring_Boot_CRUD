package lab6.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "hotel")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")

public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @OneToMany(mappedBy = "hotel", fetch = FetchType.EAGER)
    private Collection<City> cities;
    @Column(name = "name", length = 45)
    private String name;
    @Column(name = "rate")
    private Integer rate;

    public Hotel(Integer id, String name, Integer rate){
        this.id = id;
        this.name = name;
        this.rate = rate;
    }

    @Override
    public String toString(){
        return "Hotel ["
                + "id =" + id + ", "
                + "name = " + name + ", "
                + "rate = " + rate
                + "];"  + "\n";
    }

}
