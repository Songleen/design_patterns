package com.atguigu.visitor.objectStructure;

import com.atguigu.visitor.action.Operation;
import com.atguigu.visitor.person.Person;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName design-patterns
 * @Author Songleen
 * @Date 2019/08/13/16:12
 * <p>
 * 数据结构，管理很多人(Man,Women)
 */
public class PersonStructure {

    //维护了一个集合
    private List<Person> persons = new LinkedList<>();

    public void addPerson(Person person){
        persons.add(person);
    }

    public void removePerson(Person person){
        persons.remove(person);
    }

    //显示测评情况
    public void display(Operation operation){
        for (Person person : persons) {
            person.accept(operation);
        }
    }
}
