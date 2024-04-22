package deti.tqs.phihub.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
@Table(name = "hospitals")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;

    @OneToMany
    private List<WaitingRoom> waitingRooms;

    @OneToMany
    private List<QueueLine> queues;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public List<WaitingRoom> getWaitingRooms() {
        return waitingRooms;
    }
    public void setWaitingRooms(List<WaitingRoom> waitingRooms) {
        this.waitingRooms = waitingRooms;
    }
    public void addWaitingRoom(WaitingRoom waitingRoom) {
        this.waitingRooms.add(waitingRoom);
    }

    public List<QueueLine> getQueues() {
        return queues;
    }
    public void setQueues(List<QueueLine> queues) {
        this.queues = queues;
    }
    public void addQueue(QueueLine queue) {
        this.queues.add(queue);
    }
}
