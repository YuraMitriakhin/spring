package com.gmail.yuramitryahin.dao;

import com.gmail.yuramitryahin.model.User;
import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> listUsers();

    User get(Long id);
}
