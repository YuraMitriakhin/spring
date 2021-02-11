package com.gmail.yuramitryahin.service;

import com.gmail.yuramitryahin.model.User;
import com.gmail.yuramitryahin.model.dto.UserResponseDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements UserMapper {
    public UserResponseDto toDto(User user) {
        return new UserResponseDto(user.getFirstName(), user.getFirstName(),
                user.getEmail());
    }
}
