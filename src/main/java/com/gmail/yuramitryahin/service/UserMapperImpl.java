package com.gmail.yuramitryahin.service;

import com.gmail.yuramitryahin.model.User;
import com.gmail.yuramitryahin.model.dto.UserResponseDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements UserMapper {
    public UserResponseDto toDto(User user) {
        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setId(user.getId());
        userResponseDto.setFirstName(user.getFirstName());
        userResponseDto.setLastName(user.getLastName());
        userResponseDto.setEmail(user.getEmail());
        return userResponseDto;
    }
}
