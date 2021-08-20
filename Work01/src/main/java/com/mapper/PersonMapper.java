package com.mapper;

import com.dao.Person;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface PersonMapper {
    //增加一个Person
    @Insert("insert into person(id,name,age)values(#{id},#{name},#{age})")
    int insert(Person person);
    //删除一个Person
    @Delete("delete from person where id = #{id}")
    int deleteByPrimaryKey(Integer id);
    //更改一个Person
    @Update("update person set name =#{name},age=#{age} where id=#{id}")
    int updateByPrimaryKey(Person person);
    //查询一个Person
    @Select("select id,name ,age from person where id = #{id}")
    Person selectByPrimaryKey(Integer id);
    //查询所有的Person
    @Select("select id,name,age from person")
    List<Person> selectAllPerson();
}