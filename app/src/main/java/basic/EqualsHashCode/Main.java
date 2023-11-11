package basic.EqualsHashCode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static class PersonCorrectHashing{
        String name;
        int age;

        public PersonCorrectHashing(String name, int age){
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object obj){
            if(obj instanceof PersonCorrectHashing){
                PersonCorrectHashing p = (PersonCorrectHashing) obj;
                return this.name.equals(p.name) && this.age == p.age;
            }
            return false;
        }

        @Override
        public int hashCode(){
            return (name + age).hashCode();
        }

        @Override
        public String toString(){
            return name + " " + age;
        }
    }


    public static class PersonIncorrectHashing{
        String name;
        int age;

        public PersonIncorrectHashing(String name, int age){
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object obj){
            if(obj instanceof PersonIncorrectHashing){
                PersonIncorrectHashing p = (PersonIncorrectHashing) obj;
                return this.name.equals(p.name) && this.age == p.age;
            }
            return false;
        }



        @Override
        public String toString(){
            return name + " " + age;
        }

    }

    public static void main(){
        PersonCorrectHashing p1 = new PersonCorrectHashing("John", 20);
        PersonCorrectHashing p2EqualP1 = new PersonCorrectHashing("John", 20);
        PersonCorrectHashing p3NotEqaulP1 = new PersonCorrectHashing("John", 21);

        System.out.println("p1.equals(p2EqualP1)");
        System.out.println(p1.equals(p2EqualP1));

        System.out.println("p1.equals(p3NotEqaulP1)");
        System.out.println(p1.equals(p3NotEqaulP1));

        Map<PersonCorrectHashing, Integer> map = new HashMap<>();
        map.put(p1, 1);
        map.put(p2EqualP1, 2);
        map.put(p3NotEqaulP1, 3);

        // print out the map, it will have only 2 entries because p1 and p2EqualP1 have same hashcode
        System.out.println("map");
        System.out.println(map);

        System.out.println("Incorrect hashing example");

        PersonIncorrectHashing p4 = new PersonIncorrectHashing("John", 20);
        PersonIncorrectHashing p5EqualP4 = new PersonIncorrectHashing("John", 20);
        PersonIncorrectHashing p6NotEqaulP4 = new PersonIncorrectHashing("John", 21);

        System.out.println("p4.equals(p5EqualP4)");
        System.out.println(p4.equals(p5EqualP4));
        System.out.println("p4.equals(p6NotEqaulP4)");
        System.out.println(p4.equals(p6NotEqaulP4));

        Map<PersonIncorrectHashing, Integer> map2 = new HashMap<>();
        map2.put(p4, 1);
        map2.put(p5EqualP4, 2);
        map2.put(p6NotEqaulP4, 3);

        // print out the map, it will have 3 entries because p4 and p5EqualP4 have different hashcode, since we didn't override hashCode() method
        System.out.println("map2");
        System.out.println(map2);

    }
}
