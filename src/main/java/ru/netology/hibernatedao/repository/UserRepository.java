package ru.netology.hibernatedao.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.netology.hibernatedao.entity.User;

import java.util.List;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User, String> {
    List<User> findAllByCity(String city);

    List<User> findAllByAgeLessThanAndSort(int age, Sort sort);

    List<Optional<User>> findAllByNameAndSurnameOptional(String name, String surname);
}
