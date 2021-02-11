package com.gmail.yuramitryahin.controller;

import com.gmail.yuramitryahin.model.User;
import com.gmail.yuramitryahin.model.dto.UserResponseDto;
import com.gmail.yuramitryahin.service.UserMapperImpl;
import com.gmail.yuramitryahin.service.UserService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final UserMapperImpl userMapper;

    @Autowired
    public UserController(UserService userService, UserMapperImpl userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping("/{userId}")
    public UserResponseDto get(@PathVariable Long userId) {
        return userMapper.userToResponseDto(userService.get(userId));
    }

    @GetMapping("/")
    List<UserResponseDto> getAll() {
        return userService.listUsers().stream()
                .map(userMapper::userToResponseDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/inject")
    public void add() {
        userService.add(new User("Bob", "Arum", "bob@example.com"));
        userService.add(new User("Alice", "Sparkly", "alice@example.com"));
        userService.add(new User("Rick", "Potter", "rick@example.com"));
        userService.add(new User("Mark", "Parker", "mark@example.com"));
    }
}
