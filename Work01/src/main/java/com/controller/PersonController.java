package com.controller;

import com.dao.Person;
import com.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    static Person person;
    static   {
        person = new Person();
        person.setId(6);
        person.setName("szy");
        person.setAge(18);
    }
    @RequestMapping(value = "/add")
    public String students () {

        int result = personService.insertPerson(person);
        //System.out.println("插入的结果是："+result);
        return result+"";
    }
    @RequestMapping(value = "/del")
    public String delperson () {
        int delId = 2;
        int result = personService.deleteByPersonId(delId);
        //System.out.println("插入的结果是："+result);
        return result+"成功删除";
    }
    @RequestMapping(value = "/findAll")
    public String findAll () {
        List<Person> people = personService.selectAllPerson();
        people.stream().forEach(System.out::println);
        return people.toString()+"";
    }
}