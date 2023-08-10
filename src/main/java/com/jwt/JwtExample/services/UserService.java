package com.jwt.JwtExample.services;

import com.jwt.JwtExample.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Prerna Chouhan", "prerena@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Rohit Chouhan", "rohit@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Rohan Pathak", "rohan@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Omakr Agre", "omkar@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Manisha Chaudhary", "manisha@gmail.com"));
    }

    public List<User> getUsers() {
        return this.store;
    }

}
