package com.mapper;

import com.entity.Person;
import org.apache.ibatis.annotations.*;
import java.util.List;

@SuppressWarnings("AlibabaClassMustHaveAuthor")
@Mapper
public interface PersonMapper {

    /** 新增
     * @param person
     * @return int
     */
    @Insert("insert into person(id,name,age)values(#{id},#{name},#{age})")
    int insert(Person person);

    /** 删除
     * @param id
     * @return int
     */
    @Delete("delete from person where id = #{id}")
    int deleteByPrimaryKey(Integer id);

    /** 更新
     * @param person
     * @return int
     */
    @Update("update person set name =#{name},age=#{age} where id=#{id}")
    int updateByPrimaryKey(Person person);

    /** 查找
     * @param id
     * @return Person
     */
    @Select("select id,name ,age from person where id = #{id}")
    Person selectByPrimaryKey(Integer id);

    /** 查找
     * @return List</>
     */
    @Select("select id,name,age from person")
    List<Person> selectAllPerson();
}