package com.kodilla.optional;

import java.util.Optional;
import com.kodilla.stream.User;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User("user1", 30, 100, "Test");

        Optional<User> optionalUser = Optional.ofNullable(user);

        String username =
                optionalUser.orElse(new User("", 0, 0, "")).getUsername();

        System.out.println(username);
    }

}