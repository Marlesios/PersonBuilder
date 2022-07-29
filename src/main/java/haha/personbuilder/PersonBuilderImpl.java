package haha.personbuilder;

import java.util.OptionalInt;

public class PersonBuilderImpl implements PersonBuilder{

    protected  String name;
    protected String surname;
    protected Integer age;
    protected String address;


    public PersonBuilderImpl setName(String name) {
        this.name =name;
        return this;
    }


    public PersonBuilderImpl setSurname(String surname) {
        this.surname =surname;
        return this;
    }


    public PersonBuilderImpl setAge(Integer age) {
        this.age = age;
        return this;
    }


    public PersonBuilderImpl setAddress(String address) {
        this.address =address;
        return this;
    }

    @Override
    public Person build() {
        if (name == null || name.length() == 0) {
            throw new IllegalStateException("Имя не может быть null");
        }
        if (surname == null || surname.length() == 0) {
            throw new IllegalStateException("Фамилия не может быть null");
        }
        if (age == null) {
            throw new IllegalStateException("Возраст не может быть null");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Возвраст не может быть меньше нуля");
        }
        return new Person(name, surname, age, address);
    }
}
