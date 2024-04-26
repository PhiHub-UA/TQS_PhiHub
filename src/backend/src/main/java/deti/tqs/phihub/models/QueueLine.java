package deti.tqs.phihub.models;

import jakarta.persistence.Entity;
import org.springframework.data.relational.core.mapping.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;

import java.util.Queue;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "queues")
public class QueueLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer maxSize;

    @OneToMany
    private Queue<Ticket> tickets;

}
