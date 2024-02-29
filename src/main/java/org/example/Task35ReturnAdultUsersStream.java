package org.example;

// Zwróć listę pełnoletnich użytkowników
// List<User> users = List.of(
//new User(){{name = "Name1"; age=19;}},
//new User(){{name = "Name2"; age=18;}},
//new User(){{name = "Name3"; age=17;}},
//new User(){{name = "Name4"; age=16;}},
//new User(){{name = "Name5"; age=15;}},

import java.util.List;
import java.util.stream.Collectors;

class SomeUser {
    String name;
    int age;

    public SomeUser(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Task35ReturnAdultUsersStream {
    public static void main(String[] args) {
        List<org.example.SomeUser> someUsers = List.of(
                new org.example.SomeUser("Name1", 19),
                new org.example.SomeUser("Name2", 18),
                new org.example.SomeUser("Name3", 17),
                new org.example.SomeUser("Name4", 16),
                new org.example.SomeUser("Name5", 15)
        );

        List<org.example.SomeUser> adults = someUsers.stream()
                .filter(user -> user.age >= 18)
                .toList();

        System.out.println("Pełnoletni użytkownicy:");
        adults.forEach(user -> System.out.println(user.name));
    }
}

