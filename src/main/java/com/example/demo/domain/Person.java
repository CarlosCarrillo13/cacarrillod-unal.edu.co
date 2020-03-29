package com.example.demo.domain;

import lombok.*;

import javax.persistence.*;

@Table
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String email;

    private String password;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private UserType userType;

}
