package com.service;

import com.entity.Person;
import java.util.List;

@SuppressWarnings("AlibabaClassMustHaveAuthor")
public interface PersonService {
    /** 新增
     * @param person
     * @return int
     */
    int insertPerson(Person person);

    /** 删除
     * @param id
     * @return int
     */
    int deleteByPersonId(Integer id);

    /** 更新
     * @param person
     * @return int
     */
    int updateByPersonId(Person person);

    /** 查找
     * @param id
     * @return Person
     */
    Person selectByPersonId(Integer id);

    /** 查找全部
     * @return List</>
     */
    List<Person> selectAllPerson();
}