package Collections.TaskC;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<Person, Account> map = new HashMap<>();

    public static void main(String[] args) {
        Person dana = new Person("Dana");
        Person dana2 = new Person("Dana2");
        Person dana3 = new Person("Dana3");

        Account account = new Account("Insta", "Dana", "12345");
        Account account2 = new Account("FaceBook", "Dana", "12345");
        Account account3 = new Account("FaceBook", "Anna", "test");

        addAccount(dana, account);
        addAccount(dana2, account2);
        addAccount(dana3, account3);

        System.out.println("Data before actions: ");
        returnData();
        deleteAccount(map.get(dana));
        System.out.println("Data after deleting an account: ");
        returnData();
        deletePerson(dana2);
        System.out.println("Data after deleting a person: ");
        returnData();

    }

    public static void returnData() {
        for (Map.Entry<Person, Account> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    public static void addAccount(Person person, Account account) {
        map.put(person, account);
    }


    public static void deleteAccount(Account account) {
        account.delete();
    }

    public static void deletePerson(Person person) {
        map.remove(person);


    }

}
