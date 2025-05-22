package com.gbueno.service.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "profiles")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "bio")
    private String bio;

    @Column(name = "phone_number")
    private String PhoneNumber;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "loyalty_points")
    private Integer loyaltyPoints;

    //profile knows about the user but a user doesn't know about a profile
    //the profile is the owner, use JoinColumn
    @OneToOne
    @JoinColumn(name = "id")
    //this tells Hibernate to use the same column of both the primary and foreign key of the entity
    @MapsId
    @ToString.Exclude
    private User user;
}
