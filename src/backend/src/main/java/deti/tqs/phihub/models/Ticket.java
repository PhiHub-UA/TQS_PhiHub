package deti.tqs.phihub.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import java.sql.Date;

@Entity
@Table(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date registerDate;
    private Integer number;
    private String queueLetter;
    private boolean priority;
    private Double addedPrice;

    @ManyToOne
    private WaitingRoom waitingRoom;

    @OneToOne
    private Appointment appointment;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Date getRegisterDate() {
        return registerDate;
    }
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getQueueLetter() {
        return queueLetter;
    }
    public void setQueueLetter(String queueLetter) {
        this.queueLetter = queueLetter;
    }

    public WaitingRoom getWaitingRoom() {
        return waitingRoom;
    }
    public void setWaitingRoom(WaitingRoom waitingRoom) {
        this.waitingRoom = waitingRoom;
    }

    public Appointment getAppointment() {
        return appointment;
    }
    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public boolean isPriority() {
        return priority;
    }
    public void setPriority(boolean priority) {
        this.priority = priority;
    }
    
    public Double getAddedPrice() {
        return addedPrice;
    }
    public void setAddedPrice(Double addedPrice) {
        this.addedPrice = addedPrice;
    }
}
