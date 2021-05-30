package org.topia.services;

import org.springframework.stereotype.Service;
import org.topia.models.User;

import java.util.Collection;

@Service
public interface UserService {

    Collection<User> getUsers();

    User addUser(User user);
}
