package ru.netology.hibernatedao.repository;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import ru.netology.hibernatedao.entity.User;

import java.util.List;
import java.util.Optional;

@Repository
public class TableUsersRepository {
    @Autowired
    UserRepository userRepository;

    public TableUsersRepository() {
    }

    @Transactional
    public List<User> findAllByCity(String city) {
        return userRepository.findAllByCity(city);
    }

    @Transactional
    public List<User> findAllByAgeLessThanAndSort(int age, Sort sort) {
        return userRepository.findAllByAgeLessThanAndSort(age, Sort.by("age"));
    }

    @Transactional
    public List<Optional<User>> findAllByNameAndSurnameOptional(String name, String surname) {
        return userRepository.findAllByNameAndSurnameOptional(name, surname);
    }
}
