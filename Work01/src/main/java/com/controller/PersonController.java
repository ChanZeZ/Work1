package com.controller;

import com.entity.Person;
import com.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

@SuppressWarnings("AlibabaClassMustHaveAuthor")
@Slf4j
@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    static Person person;

    static {
        person = new Person();
        person.setId(100);
        person.setName("ccc");
        person.setAge(20);
    }

    @RequestMapping(value = "/add")
    public String students() {
        int result = personService.insertPerson(person);
        return result + "";
    }

    @RequestMapping(value = "/del")
    public String delperson() {
        int delId = 100;
        int result = personService.deleteByPersonId(delId);
        return result + "";
    }

    @RequestMapping(value = "/update")
    public String update() {
        int result = personService.updateByPersonId(person);
        return result + "";
    }

    @RequestMapping(value = "/findAll")
    public String findAll() {
        List<Person> people = personService.selectAllPerson();
        people.stream().forEach(System.out::println);
        return people.toString() + "";
    }

    @RequestMapping("/hello")
    public String hello(Model m) throws Exception {
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        if (true) {
            throw new Exception("some exception 异常内容！");
        }
        return "hello";
    }
}