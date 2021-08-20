package com.controller;

import com.dao.Person;
import com.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

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
        //System.out.println("插入的结果是："+result);
        return result + "";
    }

    @RequestMapping(value = "/del")
    public String delperson() {
        int delId = 100;
        int result = personService.deleteByPersonId(delId);
        //System.out.println("插入的结果是："+result);
        return result + "";
    }

    @RequestMapping(value = "/update")
    public String update() {
        int result = personService.updateByPersonId(person);
        //System.out.println("插入的结果是："+result);
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
        if (true) {  //制造必然异常
            throw new Exception("some exception 异常内容！");
        }
        return "hello";
    }
}