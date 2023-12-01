package jsk.spring3.demo.service;

import jsk.spring3.demo.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Optional<UserDto> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
