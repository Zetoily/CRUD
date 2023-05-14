package org.miron.springcourse.config.dao;

import org.miron.springcourse.config.model.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT,"Miron"));
        people.add(new Person(++PEOPLE_COUNT,"Mafa"));
        people.add(new Person(++PEOPLE_COUNT,"Miromafa"));
        people.add(new Person(++PEOPLE_COUNT,"Lalala"));
    }
    public List<Person> index(){
        return people;
    }
    public Person show(int id){
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
    public void save(Person person){
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }
}
