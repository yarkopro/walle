package com.yarkopro.walle.user;

import java.util.Optional;

public class UserService     {
    private UserRepository userRepository;

    public Optional<User> getUserById(int id) {
        return userRepository.findById(id);
    }
}
