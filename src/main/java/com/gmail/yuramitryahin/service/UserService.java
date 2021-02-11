package com.gmail.yuramitryahin.service;

import com.gmail.yuramitryahin.model.User;
import java.util.List;

public interface UserService {
    void add(User user);

    List<User> listUsers();

    User get(Long id);
}
