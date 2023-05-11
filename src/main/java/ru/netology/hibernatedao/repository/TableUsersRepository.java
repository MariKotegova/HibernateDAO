package ru.netology.hibernatedao.repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TableUsersRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public List<String> getPersonsByCity(String city){
        // List<User> users = new ArrayList<>();
        // users.add(User.builder().name("Иван").surname("Иванов").age(20).city("Moscow").phone_number("7777").build());
        // users.add(User.builder().name("Петр").surname("Петров").age(20).city("SPB").phone_number("8888").build());
        // users.add(User.builder().name("Алексей").surname("Алексеев").age(20).city("Moscow").phone_number("4444").build());
        // users.add(User.builder().name("Захар").surname("Захаров").age(20).city("Ivanovo").phone_number("5555").build());
        // users.forEach(user -> entityManager.persist(user));
        return null;
    }
}
