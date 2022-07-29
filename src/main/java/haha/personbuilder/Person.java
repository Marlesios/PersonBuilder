package haha.personbuilder;

import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected Integer age;
    protected String address;

    public Person(String name, String surname) {
        this.name =name;
        this.surname =surname;

    }

    public Person(String name, String surname, Integer age) {
        this.name =name;
        this.surname =surname;
        this.age =age;
    }

    public Person(String name, String surname, Integer age,String address) {
        this.name =name;
        this.surname =surname;
        this.age =age;
        this.address =address;
    }

    public boolean hasAge() {
        if(age == null){
            return false;
        }else {
            return true;
        }
    }
    public boolean hasAddress() { return address != null; }

    public String getName() { return name; }
    public String getSurname() { return surname;}
    public Integer getAge() { return age;}
    public String getAddress() { return address;}

    public void setAddress(String address) {this.address = address;
    }
    public void happyBirthday() { if(hasAge()) age ++;
        System.out.printf("c днем рождения, теперь вам %s ",age);}

    public PersonBuilderImpl newChildBuilder(){
        return new PersonBuilderImpl()
                .setSurname(this.surname)
                .setAge(10)
                .setAddress(this.address);
    }

    @Override
    public String toString() {
        return "имя: " + name + "\n" +
                "фамилия: " + surname + "\n" +
                "возраст: " +  age + "\n" +
                "адрес: " + address ;
    }

    @Override
    public int hashCode() { return super.hashCode();}
}
