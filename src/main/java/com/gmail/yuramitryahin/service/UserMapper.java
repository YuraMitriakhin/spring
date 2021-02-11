package com.gmail.yuramitryahin.service;

import com.gmail.yuramitryahin.model.User;
import com.gmail.yuramitryahin.model.dto.UserResponseDto;

public interface UserMapper {
    UserResponseDto toDto(User user);
}
