package com.example.demo.domain;

import lombok.*;

import javax.persistence.*;

@Table
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "user_type")
public class UserType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private UserTypeEnum userTypeEnum;
}
