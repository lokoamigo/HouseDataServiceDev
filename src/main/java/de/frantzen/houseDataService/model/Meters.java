package de.frantzen.houseDataService.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity(name="meters")
@Data
public class Meters {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Units unit;

    @OneToMany(mappedBy = "meters")
    private Set<Values> values;


}
