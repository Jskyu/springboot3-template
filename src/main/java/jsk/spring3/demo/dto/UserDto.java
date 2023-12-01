package jsk.spring3.demo.dto;

import lombok.Data;

@Data
public class UserDto {

    private String userId;
    private String userPw;

    public static UserDto create(String userId, String userPw) {
        UserDto user = new UserDto();
        user.setUserId(userId);
        user.setUserPw(userPw);
        return user;
    }
}
