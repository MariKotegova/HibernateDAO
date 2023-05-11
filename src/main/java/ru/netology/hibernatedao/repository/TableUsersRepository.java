package ru.netology.hibernatedao.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;
import ru.netology.hibernatedao.entity.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TableUsersRepository implements CommandLineRunner {

    public TableUsersRepository() {

    }

    @PersistenceContext
    EntityManager entityManager;

    public List<String> getPersonsByCity(String city) {
        List<User> result = entityManager.createQuery("select a from User a where a.city = :city")
                .setParameter("city", city).getResultList();

        List<String> stringList = new ArrayList<>();
        for (User u : result) {
            stringList.add(u.toString());
        }

        return stringList;
    }

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        // Чтоб заполнить таблицу
        //    List<User> users = new ArrayList<>();
        //          users.add(User.builder().name("Иван").surname("Иванов").age(20).city("Moscow").phone_number("7777").build());
        //          users.add(User.builder().name("Петр").surname("Петров").age(20).city("SPB").phone_number("8888").build());
        //          users.add(User.builder().name("Алексей").surname("Алексеев").age(20).city("Moscow").phone_number("4444").build());
        //          users.add(User.builder().name("Захар").surname("Захаров").age(20).city("Ivanovo").phone_number("5555").build());
        //          users.forEach(user -> entityManager.persist(user));

    }
}
