package ru.netology.hibernatedao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class User {

    @Id
    @Column(nullable = false, length = 212)
    private String name;

    @Id
    @Column(nullable = false, length = 212)
    private String surname;

    @Id
    @Column(nullable = false)
    private int age;

    @Column(nullable = false, length = 212)
    private String phone_number;

    @Column(nullable = false, length = 212)
    private String city;
//primary key (name, surname,age)
}
