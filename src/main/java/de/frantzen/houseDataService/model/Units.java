package de.frantzen.houseDataService.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;
@Entity(name = "units")
@Data
public class Units {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String suffix;

    @OneToMany(mappedBy = "units")
    private Set<Meters> meters;

}
