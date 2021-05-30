package org.topia.services;

import org.springframework.stereotype.Service;
import org.topia.models.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public Collection<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(User.builder().id(1).name("John").age(30).build());
        users.add(User.builder().id(2).name("Michael").age(53).build());
        return users;
    }

    @Override
    public User addUser(User user) {
        return null;
    }
}
