package deti.tqs.phihub.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;

import java.util.Queue;

@Entity
@Table(name = "queues")
public class QueueLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String letter;
    private Integer size;
    private Integer currentNumber;

    @OneToMany
    private Queue<Ticket> tickets;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getLetter() {
        return letter;
    }
    public void setLetter(String letter) {
        this.letter = letter;
    }

    public Integer getSize() {
        return size;
    }
    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getCurrentNumber() {
        return currentNumber;
    }
    public void setCurrentNumber(Integer currentNumber) {
        this.currentNumber = currentNumber;
    }

    public Queue<Ticket> getTickets() {
        return tickets;
    }
    public void setTickets(Queue<Ticket> tickets) {
        this.tickets = tickets;
    }
    public void addTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }
    public Ticket popTicket(Ticket ticket) {
        return this.tickets.remove();
    }
}
