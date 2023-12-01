package jsk.spring3.demo;

import jakarta.annotation.PostConstruct;
import jsk.spring3.demo.service.UserRegistService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

// DB 연결 전 임시 유저 정보..
@Component
@RequiredArgsConstructor
public class InitService {

    private final UserRegistService userService;

    @PostConstruct
    public void init() {
        userService.createUser("user1", "qwer1234");
        userService.createUser("user2", "asdf1234");
        userService.createUser("user3", "zxcv1234");
    }
}
