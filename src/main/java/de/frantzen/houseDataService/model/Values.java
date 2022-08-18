package de.frantzen.houseDataService.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "values")
public class Values {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date timestamp;

    private double value;

    @ManyToOne
    @JoinColumn(name = "id", nullable=false)
    private Meters meter;





}
