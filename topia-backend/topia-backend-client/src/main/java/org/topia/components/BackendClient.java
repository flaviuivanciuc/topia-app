package org.topia.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.topia.repositories.UserRepository;

@Component
public class BackendClient {

    @Autowired
    UserRepository userRepository;

    public void saveUsers() {
        userRepository.save(null);
    }

    public void getAllUsers() {
        userRepository.findAll();
    }
}
