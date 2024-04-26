package deti.tqs.phihub.models;

import jakarta.persistence.Entity;
import org.springframework.data.relational.core.mapping.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;



@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "medics")
public class Medic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    
    private List<Speciality> specialities;
    
}
