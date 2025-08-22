package ir.testtime;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ali", 32);
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
