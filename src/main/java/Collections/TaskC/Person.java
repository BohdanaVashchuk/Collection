package Collections.TaskC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Person {
    String personName;
    ArrayList<Account> accounts = new ArrayList<>();


    public Person(String name) {
        this.personName = name;


    }

    public String toString() {
        return "Person = " + personName + " ";
    }
}

