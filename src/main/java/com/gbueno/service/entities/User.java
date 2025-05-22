package com.gbueno.service.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    // set it to the name of the field that is the owner of the relationship
    @OneToMany(mappedBy = "user")
    @Builder.Default
    private List<Address> addresses = new ArrayList<>();

    public void addAddress(Address address) {
        addresses.add(address);
        address.setUser(this);
    }

    public void removeAddress(Address address) {
        addresses.remove(address);
        address.setUser(this);
    }

    @ManyToMany
    //instead of joincolumn in many to many, use jointable
    //user entity is the owner of the relationship
    @JoinTable(
            //name of the join table
            name = "user_tags",
            //set name of the foreign key referencing the User table
            joinColumns = @JoinColumn(name = "user_id"),
            //set the name of the other foreign key
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    @Builder.Default
    private Set<Tag> tags = new HashSet<>();

    //Pass a string and make class responsible for creating a Tag object
    public void addTag(String tagName) {
        var tag = new Tag(tagName);
        tags.add(tag);
        tag.getUsers().add(this);
    }

    //We have to tell Hibernate about the owner of the relationship so it can generate correct SQL statements
    //for retrieving and saving data
    @OneToOne(mappedBy = "user")
    private Profile profile;


}
