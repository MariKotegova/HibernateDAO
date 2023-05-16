package ru.netology.hibernatedao.controller;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.netology.hibernatedao.entity.User;
import ru.netology.hibernatedao.repository.TableUsersRepository;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/persons")

public class TableUsersController {
    TableUsersRepository repository;

    public TableUsersController(TableUsersRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/by-city")
    public List<User> findAllByCity(@RequestParam("city") String city) {
        return repository.findAllByCity(city);
    }

    @GetMapping("/by-age")
    public List<User> findAllByAgeLessThanAndSort(@RequestParam("age") int age) {
        return repository.findAllByAgeLessThanAndSort(age, Sort.by("age"));
    }

    @GetMapping("/by-name_and_surname")
    public List<Optional<User>> findAllByNameAndSurnameOptional(@RequestParam("name") String name,
                                                                @RequestParam("surname") String surname) {
        return repository.findAllByNameAndSurnameOptional(name, surname);
    }
}


