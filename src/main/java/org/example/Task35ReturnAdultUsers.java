package org.example;

// Zwróć listę pełnoletnich użytkowników
// List<User> users = List.of(
//new User(){{name = "Name1"; age=19;}},
//new User(){{name = "Name2"; age=18;}},
//new User(){{name = "Name3"; age=17;}},
//new User(){{name = "Name4"; age=16;}},
//new User(){{name = "Name5"; age=15;}},

import java.util.ArrayList;
import java.util.List;

class User {
    String name;
    int age;

    // Constructor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Task35ReturnAdultUsers {
    public static void main(String[] args) {
        List<org.example.SomeUser> someUsers = List.of(
                new org.example.SomeUser("Name1", 19),
                new org.example.SomeUser("Name2", 18),
                new org.example.SomeUser("Name3", 17),
                new org.example.SomeUser("Name4", 16),
                new org.example.SomeUser("Name5", 15));

        List<org.example.SomeUser> adultUsers = getAdultUsers(someUsers);

        System.out.println("Adult Users:");
        for (org.example.SomeUser someUser : adultUsers) {
            System.out.println(someUser.name + " - " + someUser.age + " years old");
        }
    }

    // Method to return adult users
    public static List<org.example.SomeUser> getAdultUsers(List<org.example.SomeUser> someUsers) {
        List<org.example.SomeUser> adultUsers = new ArrayList<>();

        for (org.example.SomeUser someUser : someUsers) {
            if (someUser.age >= 18) {
                adultUsers.add(someUser);
            }
        }

        return adultUsers;

//        public static List<User> getAdultUsers(List<User> users) {
//            return users.stream()
//                    .filter(user -> user.age >= 18)
//                    .collect(Collectors.toList());
//        }
    }
}
