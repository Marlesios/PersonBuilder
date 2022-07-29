package haha.personbuilder;

public class Main {

    public static void main(String[] args) throws NullPointerException {
     Person person = new PersonBuilderImpl()
             .setName("mark")
             .setSurname("markus")
             .setAge(34)
             .build();
        person.setAddress("vermington");
        System.out.println(person);
        System.out.println("has age is " +person.hasAge());
        System.out.println( "address is " +  person.hasAddress());
        person.happyBirthday();

        Person child = person.newChildBuilder()
                        .setName("Alex")
                                .build();
        System.out.println("parent is "  + person.getName());
        System.out.println(person.getName() + "'s child is " + child);

        try{
            new PersonBuilderImpl()
                    .setName("george")
                    .setSurname("hevil")
                    .build();
        }catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }

        try{
            new PersonBuilderImpl()
                    .setName("alex")
                    .setSurname("hovard")
                    .setAge(-45)
                    .build();
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }






    }

}