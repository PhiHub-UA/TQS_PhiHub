package deti.tqs.phihub.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "patients")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Personal Info
    private String name;
    private String phone;
    private String email;
    private Integer age;
    // Login Info
    private String username;
    private String password;
    // Role Info
    private List<String> roles;

    @OneToMany
    private List<Bill> bills;

    @OneToMany
    private List<Appointment> oldAppointments;

}
