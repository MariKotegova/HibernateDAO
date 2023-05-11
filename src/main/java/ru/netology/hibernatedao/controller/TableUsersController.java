package ru.netology.hibernatedao.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernatedao.repository.TableUsersRepository;

import java.util.List;

@RestController
@RequestMapping("/persons")

public class TableUsersController {
    TableUsersRepository repository;

    public TableUsersController (TableUsersRepository repository){
        this.repository = repository;
    }

    @GetMapping("/by-city")
    public List<String> getPersonsByCity(@RequestParam("city") String city) {
        return repository.getPersonsByCity(city);
    }

}


