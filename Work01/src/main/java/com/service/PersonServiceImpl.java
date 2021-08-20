package com.service;

import com.dao.Person;
import com.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;

    @Override
    public int insertPerson(Person person) {
        return personMapper.insert(person);
    }

    @Override
    public int deleteByPersonId(Integer id) {
        return personMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateByPersonId(Person person) {
        return personMapper.updateByPrimaryKey(person);
    }

    @Override
    public Person selectByPersonId(Integer id) {
        return personMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Person> selectAllPerson() {
        return personMapper.selectAllPerson();
    }

}