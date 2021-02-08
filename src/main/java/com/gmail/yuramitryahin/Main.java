package com.gmail.yuramitryahin;

import com.gmail.yuramitryahin.config.AppConfig;
import com.gmail.yuramitryahin.model.User;
import com.gmail.yuramitryahin.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(new User("John", "Harison", "john@gmail.com"));
        userService.add(new User("Merry", "Sven", "merry@gmail.com"));
        System.out.println(userService.listUsers());
    }
}
